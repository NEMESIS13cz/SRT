package com.redstoner.nemes.skin_render.main;

import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

public class Render {

	private static final float zNear = 0.002f;
	private static final float zFar = 500.0f;
	private static final float FOV = 70.0f;
	private static final int startWidth = 1280;
	private static final int startHeight = 720;
	private static final String name = "Skin render engine";
	
	private static int framerateLimit = 60;
	
	public static void main(String[] args) {
		new Render();
	}
	
	public Render() {		
		setup();
		initOGL();
		
		TextureManager.loadTexture(false, "skin", "skin");
		
		render();
		cleanup();
	}
	
	private void setup() {
		try {
			Display.setDisplayMode(new DisplayMode(startWidth, startHeight));
			Display.setTitle(name);
			Display.setResizable(true);
			Display.create();
			Keyboard.create();
			Mouse.create();
		} catch (LWJGLException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
	
	private void initOGL() {
		 GL11.glViewport(0, 0, Display.getWidth(), Display.getHeight());
		 GL11.glMatrixMode(GL11.GL_PROJECTION);
		 GL11.glLoadIdentity();
		 GLU.gluPerspective(FOV, startWidth/startHeight, zNear, zFar);
		 GL11.glMatrixMode(GL11.GL_MODELVIEW);
		 GL11.glEnable(GL11.GL_TEXTURE_2D);
		 GL11.glEnable(GL11.GL_DEPTH_TEST);
		 GL11.glDepthFunc(GL11.GL_LESS);
		 GL11.glEnable(GL11.GL_BLEND);
		 GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		 GL11.glEnable(GL11.GL_ALPHA_TEST);
		 GL11.glHint(GL11.GL_PERSPECTIVE_CORRECTION_HINT, GL11.GL_NICEST);
	}
	
	private void reinitOGL() {
		GL11.glViewport(0, 0, Display.getWidth(), Display.getHeight());
		GL11.glMatrixMode(GL11.GL_PROJECTION);
		GL11.glLoadIdentity();
		GLU.gluPerspective(FOV, (float)Display.getWidth()/(float)Display.getHeight(), zNear, zFar);
		GL11.glMatrixMode(GL11.GL_MODELVIEW);
		GL11.glLoadIdentity();
	}
	
	private void cleanup() {
		TextureManager.deleteAllTextures();
		Display.destroy();
		System.gc();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.exit(0);
	}
	
	private void render() {
		long next_frame = System.currentTimeMillis();
		long frame_time = 1000 / framerateLimit;
		long next_second = System.currentTimeMillis();
		long second = 1000;
		
		int frames = 0;
		
		try {
			while (!Display.isCloseRequested()) {
				if (next_second < System.currentTimeMillis()) {
					next_second += second;
					
					Display.setTitle(name + " | " + frames);
					frames = 0;
				}
				if (next_frame < System.currentTimeMillis()) {
					if (Display.wasResized()) {
						reinitOGL();
					}
					long frame_start_time = System.currentTimeMillis();
					next_frame += frame_time;
					
					draw();
					
					frames++;
					long temp = System.currentTimeMillis() - frame_start_time;
					if (temp < frame_time) {
						Thread.sleep(frame_time - temp);
					}
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	int rot = 0;
	
	private void draw() {
		GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
		TextureManager.bindTexture("skin");
		
		Skin.draw_skin(0, 0, -50, 20, rot, 0);
		rot++;
		
		TextureManager.unbind();
		
		// render other stuff
		
		Display.update();
	}
	
	public static void add_point(double x, double y, double z, double texture_x, double texture_y) {
		GL11.glTexCoord2d(texture_x / 64.0d, texture_y / 64.0d);
		GL11.glVertex3d(x, y, z);
	}
}
