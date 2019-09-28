package edu.cg.models;

import com.jogamp.opengl.GL2;

public class Cube implements IRenderable{
	
	
	
	
	
	@Override
	public void render(GL2 gl) {
		
		gl.glMatrixMode(GL2.GL_MODELVIEW);
		gl.glScaled(2, 2, 2);
		renderCube(gl);


	}
	
	
	public void renderCube(GL2 gl) {
		gl.glBegin(GL2.GL_QUADS);
		gl.glColor3f(1f, 1f, 0f);
		gl.glVertex3f(-0.1f ,0.1f, 0.1f);		
		gl.glVertex3f(-0.1f ,-0.1f, 0.1f);
		gl.glVertex3f(0.1f ,-0.1f, 0.1f);
		gl.glVertex3f(0.1f ,0.1f, 0.1f);
		
		gl.glColor3f(1f, 0f, 0f);
		gl.glVertex3f(0.1f ,0.1f, 0.1f);		
		gl.glVertex3f(0.1f ,-0.1f, 0.1f);
		gl.glVertex3f(0.1f ,-0.1f, -0.1f);
		gl.glVertex3f(0.1f ,0.1f, -0.1f);
		
		gl.glColor3f(0f, 1f, 0f);
		gl.glVertex3f(0.1f ,0.1f, -0.1f);		
		gl.glVertex3f(0.1f ,-0.1f, -0.1f);
		gl.glVertex3f(-0.1f ,-0.1f, -0.1f);
		gl.glVertex3f(-0.1f ,0.1f, -0.1f);
		
		gl.glColor3f(0f, 0f, 1f);
		gl.glVertex3f(-0.1f ,0.1f, 0.1f);		
		gl.glVertex3f(-0.1f ,0.1f, -0.1f);
		gl.glVertex3f(-0.1f ,-0.1f, -0.1f);
		gl.glVertex3f(-0.1f ,-0.1f, 0.1f);
		
		gl.glColor3f(0.5f, 0.5f, 0.5f);
		gl.glVertex3f(0.1f ,0.1f, -0.1f);		
		gl.glVertex3f(-0.1f ,0.1f, -0.1f);
		gl.glVertex3f(-0.1f ,0.1f, 0.1f);
		gl.glVertex3f(0.1f ,0.1f, 0.1f);
		
		gl.glColor3f(1f, 0f, 1f);				
		gl.glVertex3f(0.1f ,-0.1f, -0.1f);		
		gl.glVertex3f(0.1f ,-0.1f, 0.1f);
		gl.glVertex3f(-0.1f ,-0.1f, 0.1f);
		gl.glVertex3f(-0.1f ,-0.1f, -0.1f);		
		
		
		
		
		
		gl.glEnd();
	
	}
	

	@Override
	public String toString() {
		return "Cube";
	}

	
	@Override
	public boolean isAnimated() {
		return false;
	}
	
	
	@Override
	public void init(GL2 gl) {
		
		
	}


	@Override
	public void control(int type, Object params) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setCamera(GL2 gl) {
		// TODO Auto-generated method stub
		
	}
}
