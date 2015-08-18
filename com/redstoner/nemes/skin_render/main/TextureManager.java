package com.redstoner.nemes.skin_render.main;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.HashMap;
import java.util.Iterator;

import javax.imageio.ImageIO;

import org.lwjgl.opengl.GL11;

public class TextureManager {
	
	// The internal map used by this texture manager
	private static HashMap<String, Texture> textureMap = new HashMap<String, Texture>();
	
	/**
	 * Gets the texture object associated with the given name
	 * 
	 * @param name
	 * @return
	 */
	
	public static Texture getTexture(String name) {
		return textureMap.get(name);
	}
	
	/**
	 * Binds the texture associated with the given name to OpenGL
	 * 
	 * @param name
	 */
	
	public static void bindTexture(String name) {
		Texture t = getTexture(name);
		if (t != null) {
			GL11.glBindTexture(GL11.GL_TEXTURE_2D, t.getID());
		}
	}
	
	/**
	 * Unbinds all textures from OpenGL
	 */
	
	public static void unbind() {
		GL11.glBindTexture(GL11.GL_TEXTURE_2D, 0);
	}
	
	/**
	 * Deletes the texture associated with the given name, both from the local hash map and OpenGL's texture memory
	 * 
	 * @param name
	 */
	
	public static void deleteTexture(String name) {
		Texture t = getTexture(name);
		if (t != null) {
			textureMap.remove(name);
			GL11.glDeleteTextures(t.getID());
		}
	}
	
	/**
	 * Deletes all textures from the local hash map and OpenGL's texture memory
	 */
	
	public static void deleteAllTextures() {
		Iterator<String> i = textureMap.keySet().iterator();
		while (i.hasNext()) {
			Texture t = getTexture(i.next());
			if (t != null) {
				GL11.glDeleteTextures(t.getID());
			}
		}
		textureMap.clear();
	}
	
	/**
	 * Loads a texture from a .png file, converts it, loads it into OpenGL's memory and puts it into the local hash map under the given name
	 * Additionally if blurry = true doesn't apply certain filters which makes the texture blurry
	 * 
	 * @param blurry
	 * @param name
	 * @param fileName
	 */
	
	public static void loadTexture(boolean blurry, String name, String fileName) {
		int[] pixels = null;
		int w = 0;
		int h = 0;
		
		try {
			BufferedImage image = ImageIO.read(ClassLoader.getSystemResourceAsStream("skins/" + fileName + ".png"));
			w = image.getWidth();
			h = image.getHeight();
			pixels = new int[w * h];
			image.getRGB(0, 0, w, h, pixels, 0, w);
		}catch(IOException e) {
			e.printStackTrace();
			System.err.println("Could not find skin texture!");
			System.exit(1);
		}
		
		int[] data = new int[w * h];
		for (int i = 0; i < w * h; i++) {
			int alpha = (pixels[i] & 0xFF000000) >> 24;
			int red = (pixels[i] & 0xFF0000) >> 16;
			int green = (pixels[i] & 0xFF00) >> 8;
			int blue = (pixels[i] & 0xFF);
			
			data[i] = alpha << 24 | blue << 16 | green << 8 | red;
		}
		
		IntBuffer res = ByteBuffer.allocateDirect(data.length * 4).order(ByteOrder.nativeOrder()).asIntBuffer();
		res.put(data).flip();
		
		int id = GL11.glGenTextures();
		GL11.glBindTexture(GL11.GL_TEXTURE_2D, id);
		GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_NEAREST);
		if (!blurry) { // MIN_FILTER alone (without MAG_FILTER) makes the texture slightly blurred
			GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MAG_FILTER, GL11.GL_NEAREST);
		}
		GL11.glTexImage2D(GL11.GL_TEXTURE_2D, 0, GL11.GL_RGBA, w, h, 0, GL11.GL_RGBA, GL11.GL_UNSIGNED_BYTE, res);
		GL11.glBindTexture(GL11.GL_TEXTURE_2D, 0);
		
		textureMap.put(name, new Texture(id, w, h));
	}
}
