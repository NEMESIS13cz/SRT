package com.redstoner.nemes.skin_render.main;

public class Texture {

	private int ID, width, height;
	
	public Texture(int id, int w, int h) {
		ID = id;
		width = w;
		height = h;
	}
	
	/**
	 * The texture ID in OpenGL's texture registry
	 * 
	 * @return
	 */
	
	public int getID() {
		return ID;
	}
	
	/**
	 * The width of the texture
	 * 
	 * @return
	 */
	
	public int getWidth() {
		return width;
	}
	
	/**
	 * The height of the texture
	 * 
	 * @return
	 */
	
	public int getHeight() {
		return height;
	}
}
