package com.redstoner.nemes.skin_render.main;

import org.lwjgl.opengl.GL11;

public class Skin {

	public static void skin_wall(double x, double y, double z, double rotX, double rotY, double rotZ) {
		GL11.glTranslated(x, y, z);
		GL11.glRotated(rotX, 1.0d, 0.0d, 0.0d);
		GL11.glRotated(rotY, 0.0d, 1.0d, 0.0d);
		GL11.glRotated(rotZ, 0.0d, 0.0d, 1.0d);
		
		body(0, 0, 0, 0, 0, -7);
		left_leg_top(0.8, -11.2, 0.7, -20, 0, 3);
		left_leg_bottom(1, -14, 1.5, 0, 5, -30);
		right_leg_top(-2.8, -11, 0, 0, 0, 0);
		right_leg_bottom(-2.8, -16, 0, 0, 0, 0);
		left_hand_top(6, -0.9, 0, 0, 0, -5);
		left_hand_bottom(5.6, -5, 0, -10, 0, -12);
		right_hand_top(-5.8, -0.4, 0, -40, 10, -10);
		right_hand_bottom(-6, -3, 2.5, -60, 10, 0);
		head(0.2, 5.4, 0, 0, 5, 2);
		
		GL11.glRotated(-rotZ, 0.0d, 0.0d, 1.0d);
		GL11.glRotated(-rotY, 0.0d, 1.0d, 0.0d);
		GL11.glRotated(-rotX, 1.0d, 0.0d, 0.0d);
		GL11.glTranslated(-x, -y, -z);
	}
	
	public static void draw_skin(double x, double y, double z, double rotX, double rotY, double rotZ) {
		GL11.glTranslated(x, y, z);
		GL11.glRotated(rotX, 1.0d, 0.0d, 0.0d);
		GL11.glRotated(rotY, 0.0d, 1.0d, 0.0d);
		GL11.glRotated(rotZ, 0.0d, 0.0d, 1.0d);
		
		body(0, 0, 0, 0, 0, 0);
		left_leg_top(2, -12, 0, 0, 0, 0);
		left_leg_bottom(2, -17, 0, 0, 0, 0);
		right_leg_top(-2, -12, 0, 0, 0, 0);
		right_leg_bottom(-2, -17, 0, 0, 0, 0);
		left_hand_top(6, 0, 0, 0, 0, 0);
		left_hand_bottom(6, -5, 0, 0, 0, 0);
		right_hand_top(-6, 0, 0, 0, 0, 0);
		right_hand_bottom(-6, -5, 0, 0, 0, 0);
		head(0, 6, 0, 0, 0, 0);
		
		GL11.glRotated(-rotZ, 0.0d, 0.0d, 1.0d);
		GL11.glRotated(-rotY, 0.0d, 1.0d, 0.0d);
		GL11.glRotated(-rotX, 1.0d, 0.0d, 0.0d);
		GL11.glTranslated(-x, -y, -z);
	}
	
	public static void head(double x, double y, double z, double rotX, double rotY, double rotZ) {
		GL11.glTranslated(x, y, z);
		GL11.glRotated(rotX, 1.0d, 0.0d, 0.0d);
		GL11.glRotated(rotY, 0.0d, 1.0d, 0.0d);
		GL11.glRotated(rotZ, 0.0d, 0.0d, 1.0d);
		
		GL11.glBegin(GL11.GL_QUADS);
		
		// LEFT
		Render.add_point(-4.0d, -4.0d, 4.0d, 8.0d, 16.0d);
		Render.add_point(-4.0d, -4.0d, -4.0d, 0.0d, 16.0d);
		Render.add_point(-4.0d, 4.0d, -4.0d, 0.0d, 8.0d);
		Render.add_point(-4.0d, 4.0d, 4.0d, 8.0d, 8.0d);

		// FRONT
		Render.add_point(-4.0d, 4.0d, 4.0d, 8.0d, 8.0d);
		Render.add_point(4.0d, 4.0d, 4.0d, 16.0d, 8.0d);
		Render.add_point(4.0d, -4.0d, 4.0d, 16.0d, 16.0d);
		Render.add_point(-4.0d, -4.0d, 4.0d, 8.0d, 16.0d);
		
		// RIGHT
		Render.add_point(4.0d, -4.0d, 4.0d, 16.0d, 16.0d);
		Render.add_point(4.0d, 4.0d, 4.0d, 16.0d, 8.0d);
		Render.add_point(4.0d, 4.0d, -4.0d, 24.0d, 8.0d);
		Render.add_point(4.0d, -4.0d, -4.0d, 24.0d, 16.0d);
		
		// BACK
		Render.add_point(4.0d, 4.0d, -4.0d, 24.0d, 8.0d);
		Render.add_point(4.0d, -4.0d, -4.0d, 24.0d, 16.0d);
		Render.add_point(-4.0d, -4.0d, -4.0d, 32.0d, 16.0d);
		Render.add_point(-4.0d, 4.0d, -4.0d, 32.0d, 8.0d);
		
		// TOP
		Render.add_point(-4.0d, 4.0d, -4.0d, 8.0d, 0.0d);
		Render.add_point(4.0d, 4.0d, -4.0d, 16.0d, 0.0d);
		Render.add_point(4.0d, 4.0d, 4.0d, 16.0d, 8.0d);
		Render.add_point(-4.0d, 4.0d, 4.0d, 8.0d, 8.0d);
		
		// BOTTOM
		Render.add_point(-4.0d, -4.0d, -4.0d, 16.0d, 8.0d);
		Render.add_point(4.0d, -4.0d, -4.0d, 24.0d, 8.0d);
		Render.add_point(4.0d, -4.0d, 4.0d, 24.0d, 0.0d);
		Render.add_point(-4.0d, -4.0d, 4.0d, 16.0d, 0.0d);
		
		// Overlay
		// LEFT
		Render.add_point(-4.15d, -4.0d, 4.0d, 40.0d, 16.0d);
		Render.add_point(-4.15d, -4.0d, -4.15d, 32.0d, 16.0d);
		Render.add_point(-4.15d, 4.0d, -4.15d, 32.0d, 8.0d);
		Render.add_point(-4.15d, 4.0d, 4.0d, 40.0d, 8.0d);
		
		// FRONT
		Render.add_point(-4.15d, 4.0d, 4.15d, 40.0d, 8.0d);
		Render.add_point(4.15d, 4.0d, 4.15d, 48.0d, 8.0d);
		Render.add_point(4.15d, -4.0d, 4.15d, 48.0d, 16.0d);
		Render.add_point(-4.15d, -4.0d, 4.15d, 40.0d, 16.0d);

		// RIGHT
		Render.add_point(4.15d, -4.0d, 4.0d, 48.0d, 16.0d);
		Render.add_point(4.15d, 4.0d, 4.0d, 48.0d, 8.0d);
		Render.add_point(4.15d, 4.0d, -4.15d, 56.0d, 8.0d);
		Render.add_point(4.15d, -4.0d, -4.15d, 56.0d, 16.0d);

		// BACK
		Render.add_point(4.15d, 4.0d, -4.15d, 56.0d, 8.0d);
		Render.add_point(4.15d, -4.0d, -4.15d, 56.0d, 16.0d);
		Render.add_point(-4.15d, -4.0d, -4.15d, 64.0d, 16.0d);
		Render.add_point(-4.15d, 4.0d, -4.15d, 64.0d, 8.0d);
		
		GL11.glEnd();

		GL11.glRotated(-rotZ, 0.0d, 0.0d, 1.0d);
		GL11.glRotated(-rotY, 0.0d, 1.0d, 0.0d);
		GL11.glRotated(-rotX, 1.0d, 0.0d, 0.0d);
		GL11.glTranslated(-x, -y, -z);
	}
	
	public static void body(double x, double y, double z, double rotX, double rotY, double rotZ) {
		GL11.glTranslated(x, y, z);
		GL11.glRotated(rotX, 1.0d, 0.0d, 0.0d);
		GL11.glRotated(rotY, 0.0d, 1.0d, 0.0d);
		GL11.glRotated(rotZ, 0.0d, 0.0d, 1.0d);
		
		GL11.glBegin(GL11.GL_QUADS);
		
		// LEFT
		Render.add_point(-4.0d, -10.0d, 2.0d, 16.0d, 32.0d);
		Render.add_point(-4.0d, -10.0d, -2.0d, 20.0d, 32.0d);
		Render.add_point(-4.0d, 2.0d, -2.0d, 20.0d, 20.0d);
		Render.add_point(-4.0d, 2.0d, 2.0d, 16.0d, 20.0d);

		// FRONT
		Render.add_point(-4.0d, 2.0d, 2.0d, 20.0d, 20.0d);
		Render.add_point(4.0d, 2.0d, 2.0d, 28.0d, 20.0d);
		Render.add_point(4.0d, -10.0d, 2.0d, 28.0d, 32.0d);
		Render.add_point(-4.0d, -10.0d, 2.0d, 20.0d, 32.0d);
		
		// RIGHT
		Render.add_point(4.0d, -10.0d, 2.0d, 28.0d, 32.0d);
		Render.add_point(4.0d, 2.0d, 2.0d, 32.0d, 20.0d);
		Render.add_point(4.0d, 2.0d, -2.0d, 32.0d, 20.0d);
		Render.add_point(4.0d, -10.0d, -2.0d, 28.0d, 32.0d);
		
		// BACK
		Render.add_point(4.0d, 2.0d, -2.0d, 40.0d, 20.0d);
		Render.add_point(4.0d, -10.0d, -2.0d, 40.0d, 32.0d);
		Render.add_point(-4.0d, -10.0d, -2.0d, 32.0d, 32.0d);
		Render.add_point(-4.0d, 2.0d, -2.0d, 32.0d, 20.0d);
		
		// TOP
		Render.add_point(-4.0d, 2.0d, -2.0d, 20.0d, 16.0d);
		Render.add_point(4.0d, 2.0d, -2.0d, 28.0d, 16.0d);
		Render.add_point(4.0d, 2.0d, 2.0d, 28.0d, 20.0d);
		Render.add_point(-4.0d, 2.0d, 2.0d, 20.0d, 20.0d);
		
		// BOTTOM
		Render.add_point(-4.0d, -10.0d, -2.0d, 28.0d, 20.0d);
		Render.add_point(4.0d, -10.0d, -2.0d, 36.0d, 20.0d);
		Render.add_point(4.0d, -10.0d, 2.0d, 36.0d, 16.0d);
		Render.add_point(-4.0d, -10.0d, 2.0d, 28.0d, 16.0d);
		
		GL11.glEnd();

		GL11.glRotated(-rotZ, 0.0d, 0.0d, 1.0d);
		GL11.glRotated(-rotY, 0.0d, 1.0d, 0.0d);
		GL11.glRotated(-rotX, 1.0d, 0.0d, 0.0d);
		GL11.glTranslated(-x, -y, -z);
	}
	
	public static void right_leg_top(double x, double y, double z, double rotX, double rotY, double rotZ) {
		GL11.glTranslated(x, y, z);
		GL11.glRotated(rotX, 1.0d, 0.0d, 0.0d);
		GL11.glRotated(rotY, 0.0d, 1.0d, 0.0d);
		GL11.glRotated(rotZ, 0.0d, 0.0d, 1.0d);
		
		GL11.glBegin(GL11.GL_QUADS);
		
		// LEFT
		Render.add_point(-2.0d, -4.0d, 2.0d, 0.0d, 26.0d);
		Render.add_point(-2.0d, -4.0d, -2.0d, 4.0d, 26.0d);
		Render.add_point(-2.0d, 2.0d, -2.0d, 4.0d, 20.0d);
		Render.add_point(-2.0d, 2.0d, 2.0d, 0.0d, 20.0d);

		// FRONT
		Render.add_point(-2.0d, 2.0d, 2.0d, 4.0d, 20.0d);
		Render.add_point(2.0d, 2.0d, 2.0d, 8.0d, 20.0d);
		Render.add_point(2.0d, -4.0d, 2.0d, 8.0d, 26.0d);
		Render.add_point(-2.0d, -4.0d, 2.0d, 4.0d, 26.0d);
		
		// RIGHT
		Render.add_point(2.0d, -4.0d, 2.0d, 8.0d, 26.0d);
		Render.add_point(2.0d, 2.0d, 2.0d, 12.0d, 20.0d);
		Render.add_point(2.0d, 2.0d, -2.0d, 12.0d, 20.0d);
		Render.add_point(2.0d, -4.0d, -2.0d, 8.0d, 26.0d);
		
		// BACK
		Render.add_point(2.0d, 2.0d, -2.0d, 12.0d, 20.0d);
		Render.add_point(2.0d, -4.0d, -2.0d, 12.0d, 26.0d);
		Render.add_point(-2.0d, -4.0d, -2.0d, 16.0d, 26.0d);
		Render.add_point(-2.0d, 2.0d, -2.0d, 16.0d, 20.0d);
		
		// TOP
		Render.add_point(-2.0d, 2.0d, -2.0d, 4.0d, 16.0d);
		Render.add_point(2.0d, 2.0d, -2.0d, 8.0d, 16.0d);
		Render.add_point(2.0d, 2.0d, 2.0d, 8.0d, 20.0d);
		Render.add_point(-2.0d, 2.0d, 2.0d, 4.0d, 20.0d);
		
		GL11.glEnd();

		GL11.glRotated(-rotZ, 0.0d, 0.0d, 1.0d);
		GL11.glRotated(-rotY, 0.0d, 1.0d, 0.0d);
		GL11.glRotated(-rotX, 1.0d, 0.0d, 0.0d);
		GL11.glTranslated(-x, -y, -z);
	}
	
	public static void right_leg_bottom(double x, double y, double z, double rotX, double rotY, double rotZ) {
		GL11.glTranslated(x, y, z);
		GL11.glRotated(rotX, 1.0d, 0.0d, 0.0d);
		GL11.glRotated(rotY, 0.0d, 1.0d, 0.0d);
		GL11.glRotated(rotZ, 0.0d, 0.0d, 1.0d);
		
		GL11.glBegin(GL11.GL_QUADS);
		
		// LEFT
		Render.add_point(-2.0d, -5.0d, 2.0d, 0.0d, 32.0d);
		Render.add_point(-2.0d, -5.0d, -2.0d, 4.0d, 32.0d);
		Render.add_point(-2.0d, 1.0d, -2.0d, 4.0d, 26.0d);
		Render.add_point(-2.0d, 1.0d, 2.0d, 0.0d, 26.0d);

		// FRONT
		Render.add_point(-2.0d, 1.0d, 2.0d, 4.0d, 26.0d);
		Render.add_point(2.0d, 1.0d, 2.0d, 8.0d, 26.0d);
		Render.add_point(2.0d, -5.0d, 2.0d, 8.0d, 32.0d);
		Render.add_point(-2.0d, -5.0d, 2.0d, 4.0d, 32.0d);
		
		// RIGHT
		Render.add_point(2.0d, -5.0d, 2.0d, 8.0d, 32.0d);
		Render.add_point(2.0d, 1.0d, 2.0d, 12.0d, 26.0d);
		Render.add_point(2.0d, 1.0d, -2.0d, 12.0d, 26.0d);
		Render.add_point(2.0d, -5.0d, -2.0d, 8.0d, 32.0d);
		
		// BACK
		Render.add_point(2.0d, 1.0d, -2.0d, 12.0d, 26.0d);
		Render.add_point(2.0d, -5.0d, -2.0d, 12.0d, 32.0d);
		Render.add_point(-2.0d, -5.0d, -2.0d, 16.0d, 32.0d);
		Render.add_point(-2.0d, 1.0d, -2.0d, 16.0d, 26.0d);
		
		// BOTTOM
		Render.add_point(-2.0d, -5.0d, -2.0d, 8.0d, 20.0d);
		Render.add_point(2.0d, -5.0d, -2.0d, 12.0d, 20.0d);
		Render.add_point(2.0d, -5.0d, 2.0d, 12.0d, 16.0d);
		Render.add_point(-2.0d, -5.0d, 2.0d, 8.0d, 16.0d);
		
		GL11.glEnd();

		GL11.glRotated(-rotZ, 0.0d, 0.0d, 1.0d);
		GL11.glRotated(-rotY, 0.0d, 1.0d, 0.0d);
		GL11.glRotated(-rotX, 1.0d, 0.0d, 0.0d);
		GL11.glTranslated(-x, -y, -z);
	}
	
	public static void left_leg_top(double x, double y, double z, double rotX, double rotY, double rotZ) {
		GL11.glTranslated(x, y, z);
		GL11.glRotated(rotX, 1.0d, 0.0d, 0.0d);
		GL11.glRotated(rotY, 0.0d, 1.0d, 0.0d);
		GL11.glRotated(rotZ, 0.0d, 0.0d, 1.0d);
		
		GL11.glBegin(GL11.GL_QUADS);
		
		// LEFT
		Render.add_point(-2.0d, -4.0d, 2.0d, 16.0d, 58.0d);
		Render.add_point(-2.0d, -4.0d, -2.0d, 20.0d, 58.0d);
		Render.add_point(-2.0d, 2.0d, -2.0d, 20.0d, 52.0d);
		Render.add_point(-2.0d, 2.0d, 2.0d, 16.0d, 52.0d);

		// FRONT
		Render.add_point(-2.0d, 2.0d, 2.0d, 20.0d, 52.0d);
		Render.add_point(2.0d, 2.0d, 2.0d, 24.0d, 52.0d);
		Render.add_point(2.0d, -4.0d, 2.0d, 24.0d, 58.0d);
		Render.add_point(-2.0d, -4.0d, 2.0d, 20.0d, 58.0d);
		
		// RIGHT
		Render.add_point(2.0d, -4.0d, 2.0d, 24.0d, 58.0d);
		Render.add_point(2.0d, 2.0d, 2.0d, 28.0d, 52.0d);
		Render.add_point(2.0d, 2.0d, -2.0d, 28.0d, 52.0d);
		Render.add_point(2.0d, -4.0d, -2.0d, 24.0d, 58.0d);
		
		// BACK
		Render.add_point(2.0d, 2.0d, -2.0d, 28.0d, 52.0d);
		Render.add_point(2.0d, -4.0d, -2.0d, 28.0d, 58.0d);
		Render.add_point(-2.0d, -4.0d, -2.0d, 32.0d, 58.0d);
		Render.add_point(-2.0d, 2.0d, -2.0d, 32.0d, 52.0d);
		
		// TOP
		Render.add_point(-2.0d, 2.0d, -2.0d, 20.0d, 48.0d);
		Render.add_point(2.0d, 2.0d, -2.0d, 24.0d, 48.0d);
		Render.add_point(2.0d, 2.0d, 2.0d, 24.0d, 52.0d);
		Render.add_point(-2.0d, 2.0d, 2.0d, 20.0d, 52.0d);
		
		GL11.glEnd();

		GL11.glRotated(-rotZ, 0.0d, 0.0d, 1.0d);
		GL11.glRotated(-rotY, 0.0d, 1.0d, 0.0d);
		GL11.glRotated(-rotX, 1.0d, 0.0d, 0.0d);
		GL11.glTranslated(-x, -y, -z);
	}
	
	public static void left_leg_bottom(double x, double y, double z, double rotX, double rotY, double rotZ) {
		GL11.glTranslated(x, y, z);
		GL11.glRotated(rotX, 1.0d, 0.0d, 0.0d);
		GL11.glRotated(rotY, 0.0d, 1.0d, 0.0d);
		GL11.glRotated(rotZ, 0.0d, 0.0d, 1.0d);
		
		GL11.glBegin(GL11.GL_QUADS);
		
		// LEFT
		Render.add_point(-2.0d, -5.0d, 2.0d, 16.0d, 64.0d);
		Render.add_point(-2.0d, -5.0d, -2.0d, 20.0d, 64.0d);
		Render.add_point(-2.0d, 1.0d, -2.0d, 20.0d, 58.0d);
		Render.add_point(-2.0d, 1.0d, 2.0d, 16.0d, 58.0d);

		// FRONT
		Render.add_point(-2.0d, 1.0d, 2.0d, 20.0d, 58.0d);
		Render.add_point(2.0d, 1.0d, 2.0d, 24.0d, 58.0d);
		Render.add_point(2.0d, -5.0d, 2.0d, 24.0d, 64.0d);
		Render.add_point(-2.0d, -5.0d, 2.0d, 20.0d, 64.0d);
		
		// RIGHT
		Render.add_point(2.0d, -5.0d, 2.0d, 24.0d, 64.0d);
		Render.add_point(2.0d, 1.0d, 2.0d, 28.0d, 58.0d);
		Render.add_point(2.0d, 1.0d, -2.0d, 28.0d, 58.0d);
		Render.add_point(2.0d, -5.0d, -2.0d, 24.0d, 64.0d);
		
		// BACK
		Render.add_point(2.0d, 1.0d, -2.0d, 28.0d, 58.0d);
		Render.add_point(2.0d, -5.0d, -2.0d, 28.0d, 64.0d);
		Render.add_point(-2.0d, -5.0d, -2.0d, 32.0d, 64.0d);
		Render.add_point(-2.0d, 1.0d, -2.0d, 32.0d, 58.0d);
		
		// BOTTOM
		Render.add_point(-2.0d, -5.0d, -2.0d, 24.0d, 52.0d);
		Render.add_point(2.0d, -5.0d, -2.0d, 28.0d, 52.0d);
		Render.add_point(2.0d, -5.0d, 2.0d, 28.0d, 48.0d);
		Render.add_point(-2.0d, -5.0d, 2.0d, 24.0d, 48.0d);
		
		GL11.glEnd();

		GL11.glRotated(-rotZ, 0.0d, 0.0d, 1.0d);
		GL11.glRotated(-rotY, 0.0d, 1.0d, 0.0d);
		GL11.glRotated(-rotX, 1.0d, 0.0d, 0.0d);
		GL11.glTranslated(-x, -y, -z);
	}
	
	public static void left_hand_top(double x, double y, double z, double rotX, double rotY, double rotZ) {
		GL11.glTranslated(x, y, z);
		GL11.glRotated(rotX, 1.0d, 0.0d, 0.0d);
		GL11.glRotated(rotY, 0.0d, 1.0d, 0.0d);
		GL11.glRotated(rotZ, 0.0d, 0.0d, 1.0d);
		
		GL11.glBegin(GL11.GL_QUADS);
		
		// LEFT
		Render.add_point(-2.0d, -4.0d, 2.0d, 32.0d, 58.0d);
		Render.add_point(-2.0d, -4.0d, -2.0d, 36.0d, 58.0d);
		Render.add_point(-2.0d, 2.0d, -2.0d, 36.0d, 52.0d);
		Render.add_point(-2.0d, 2.0d, 2.0d, 32.0d, 52.0d);

		// FRONT
		Render.add_point(-2.0d, 2.0d, 2.0d, 36.0d, 52.0d);
		Render.add_point(2.0d, 2.0d, 2.0d, 40.0d, 52.0d);
		Render.add_point(2.0d, -4.0d, 2.0d, 40.0d, 58.0d);
		Render.add_point(-2.0d, -4.0d, 2.0d, 36.0d, 58.0d);
		
		// RIGHT
		Render.add_point(2.0d, -4.0d, 2.0d, 40.0d, 58.0d);
		Render.add_point(2.0d, 2.0d, 2.0d, 44.0d, 52.0d);
		Render.add_point(2.0d, 2.0d, -2.0d, 44.0d, 52.0d);
		Render.add_point(2.0d, -4.0d, -2.0d, 40.0d, 58.0d);
		
		// BACK
		Render.add_point(2.0d, 2.0d, -2.0d, 44.0d, 52.0d);
		Render.add_point(2.0d, -4.0d, -2.0d, 44.0d, 58.0d);
		Render.add_point(-2.0d, -4.0d, -2.0d, 48.0d, 58.0d);
		Render.add_point(-2.0d, 2.0d, -2.0d, 48.0d, 52.0d);
		
		// TOP
		Render.add_point(-2.0d, 2.0d, -2.0d, 36.0d, 48.0d);
		Render.add_point(2.0d, 2.0d, -2.0d, 40.0d, 48.0d);
		Render.add_point(2.0d, 2.0d, 2.0d, 40.0d, 52.0d);
		Render.add_point(-2.0d, 2.0d, 2.0d, 36.0d, 52.0d);
		
		GL11.glEnd();

		GL11.glRotated(-rotZ, 0.0d, 0.0d, 1.0d);
		GL11.glRotated(-rotY, 0.0d, 1.0d, 0.0d);
		GL11.glRotated(-rotX, 1.0d, 0.0d, 0.0d);
		GL11.glTranslated(-x, -y, -z);
	}
	
	public static void left_hand_bottom(double x, double y, double z, double rotX, double rotY, double rotZ) {
		GL11.glTranslated(x, y, z);
		GL11.glRotated(rotX, 1.0d, 0.0d, 0.0d);
		GL11.glRotated(rotY, 0.0d, 1.0d, 0.0d);
		GL11.glRotated(rotZ, 0.0d, 0.0d, 1.0d);
		
		GL11.glBegin(GL11.GL_QUADS);
		
		// LEFT
		Render.add_point(-2.0d, -5.0d, 2.0d, 32.0d, 64.0d);
		Render.add_point(-2.0d, -5.0d, -2.0d, 36.0d, 64.0d);
		Render.add_point(-2.0d, 1.0d, -2.0d, 36.0d, 58.0d);
		Render.add_point(-2.0d, 1.0d, 2.0d, 32.0d, 58.0d);

		// FRONT
		Render.add_point(-2.0d, 1.0d, 2.0d, 36.0d, 58.0d);
		Render.add_point(2.0d, 1.0d, 2.0d, 40.0d, 58.0d);
		Render.add_point(2.0d, -5.0d, 2.0d, 40.0d, 64.0d);
		Render.add_point(-2.0d, -5.0d, 2.0d, 36.0d, 64.0d);
		
		// RIGHT
		Render.add_point(2.0d, -5.0d, 2.0d, 40.0d, 64.0d);
		Render.add_point(2.0d, 1.0d, 2.0d, 44.0d, 58.0d);
		Render.add_point(2.0d, 1.0d, -2.0d, 44.0d, 58.0d);
		Render.add_point(2.0d, -5.0d, -2.0d, 40.0d, 64.0d);
		
		// BACK
		Render.add_point(2.0d, 1.0d, -2.0d, 44.0d, 58.0d);
		Render.add_point(2.0d, -5.0d, -2.0d, 44.0d, 64.0d);
		Render.add_point(-2.0d, -5.0d, -2.0d, 48.0d, 64.0d);
		Render.add_point(-2.0d, 1.0d, -2.0d, 48.0d, 58.0d);
		
		// BOTTOM
		Render.add_point(-2.0d, -5.0d, -2.0d, 40.0d, 52.0d);
		Render.add_point(2.0d, -5.0d, -2.0d, 44.0d, 52.0d);
		Render.add_point(2.0d, -5.0d, 2.0d, 44.0d, 48.0d);
		Render.add_point(-2.0d, -5.0d, 2.0d, 40.0d, 48.0d);
		
		GL11.glEnd();

		GL11.glRotated(-rotZ, 0.0d, 0.0d, 1.0d);
		GL11.glRotated(-rotY, 0.0d, 1.0d, 0.0d);
		GL11.glRotated(-rotX, 1.0d, 0.0d, 0.0d);
		GL11.glTranslated(-x, -y, -z);
	}
	
	public static void right_hand_top(double x, double y, double z, double rotX, double rotY, double rotZ) {
		GL11.glTranslated(x, y, z);
		GL11.glRotated(rotX, 1.0d, 0.0d, 0.0d);
		GL11.glRotated(rotY, 0.0d, 1.0d, 0.0d);
		GL11.glRotated(rotZ, 0.0d, 0.0d, 1.0d);
		
		GL11.glBegin(GL11.GL_QUADS);
		
		// LEFT
		Render.add_point(-2.0d, -4.0d, 2.0d, 40.0d, 26.0d);
		Render.add_point(-2.0d, -4.0d, -2.0d, 44.0d, 26.0d);
		Render.add_point(-2.0d, 2.0d, -2.0d, 44.0d, 20.0d);
		Render.add_point(-2.0d, 2.0d, 2.0d, 40.0d, 20.0d);

		// FRONT
		Render.add_point(-2.0d, 2.0d, 2.0d, 44.0d, 20.0d);
		Render.add_point(2.0d, 2.0d, 2.0d, 48.0d, 20.0d);
		Render.add_point(2.0d, -4.0d, 2.0d, 48.0d, 26.0d);
		Render.add_point(-2.0d, -4.0d, 2.0d, 44.0d, 26.0d);
		
		// RIGHT
		Render.add_point(2.0d, -4.0d, 2.0d, 48.0d, 26.0d);
		Render.add_point(2.0d, 2.0d, 2.0d, 52.0d, 20.0d);
		Render.add_point(2.0d, 2.0d, -2.0d, 52.0d, 20.0d);
		Render.add_point(2.0d, -4.0d, -2.0d, 48.0d, 26.0d);
		
		// BACK
		Render.add_point(2.0d, 2.0d, -2.0d, 52.0d, 20.0d);
		Render.add_point(2.0d, -4.0d, -2.0d, 52.0d, 26.0d);
		Render.add_point(-2.0d, -4.0d, -2.0d, 56.0d, 26.0d);
		Render.add_point(-2.0d, 2.0d, -2.0d, 56.0d, 20.0d);
		
		// TOP
		Render.add_point(-2.0d, 2.0d, -2.0d, 44.0d, 16.0d);
		Render.add_point(2.0d, 2.0d, -2.0d, 48.0d, 16.0d);
		Render.add_point(2.0d, 2.0d, 2.0d, 48.0d, 20.0d);
		Render.add_point(-2.0d, 2.0d, 2.0d, 44.0d, 20.0d);
		
		GL11.glEnd();

		GL11.glRotated(-rotZ, 0.0d, 0.0d, 1.0d);
		GL11.glRotated(-rotY, 0.0d, 1.0d, 0.0d);
		GL11.glRotated(-rotX, 1.0d, 0.0d, 0.0d);
		GL11.glTranslated(-x, -y, -z);
	}
	
	public static void right_hand_bottom(double x, double y, double z, double rotX, double rotY, double rotZ) {
		GL11.glTranslated(x, y, z);
		GL11.glRotated(rotX, 1.0d, 0.0d, 0.0d);
		GL11.glRotated(rotY, 0.0d, 1.0d, 0.0d);
		GL11.glRotated(rotZ, 0.0d, 0.0d, 1.0d);
		
		GL11.glBegin(GL11.GL_QUADS);
		
		// LEFT
		Render.add_point(-2.0d, -5.0d, 2.0d, 40.0d, 32.0d);
		Render.add_point(-2.0d, -5.0d, -2.0d, 44.0d, 32.0d);
		Render.add_point(-2.0d, 1.0d, -2.0d, 44.0d, 26.0d);
		Render.add_point(-2.0d, 1.0d, 2.0d, 40.0d, 26.0d);

		// FRONT
		Render.add_point(-2.0d, 1.0d, 2.0d, 44.0d, 26.0d);
		Render.add_point(2.0d, 1.0d, 2.0d, 48.0d, 26.0d);
		Render.add_point(2.0d, -5.0d, 2.0d, 48.0d, 32.0d);
		Render.add_point(-2.0d, -5.0d, 2.0d, 44.0d, 32.0d);
		
		// RIGHT
		Render.add_point(2.0d, -5.0d, 2.0d, 48.0d, 32.0d);
		Render.add_point(2.0d, 1.0d, 2.0d, 52.0d, 26.0d);
		Render.add_point(2.0d, 1.0d, -2.0d, 52.0d, 26.0d);
		Render.add_point(2.0d, -5.0d, -2.0d, 48.0d, 32.0d);
		
		// BACK
		Render.add_point(2.0d, 1.0d, -2.0d, 52.0d, 26.0d);
		Render.add_point(2.0d, -5.0d, -2.0d, 52.0d, 32.0d);
		Render.add_point(-2.0d, -5.0d, -2.0d, 56.0d, 32.0d);
		Render.add_point(-2.0d, 1.0d, -2.0d, 56.0d, 26.0d);
		
		// BOTTOM
		Render.add_point(-2.0d, -5.0d, -2.0d, 48.0d, 20.0d);
		Render.add_point(2.0d, -5.0d, -2.0d, 52.0d, 20.0d);
		Render.add_point(2.0d, -5.0d, 2.0d, 52.0d, 16.0d);
		Render.add_point(-2.0d, -5.0d, 2.0d, 48.0d, 16.0d);
		
		GL11.glEnd();

		GL11.glRotated(-rotZ, 0.0d, 0.0d, 1.0d);
		GL11.glRotated(-rotY, 0.0d, 1.0d, 0.0d);
		GL11.glRotated(-rotX, 1.0d, 0.0d, 0.0d);
		GL11.glTranslated(-x, -y, -z);
	}
}
