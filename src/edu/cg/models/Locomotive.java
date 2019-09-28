package edu.cg.models;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.glu.GLUquadric;

import edu.cg.algebra.Ops;

public class Locomotive implements IRenderable {
	
	
	
	@Override
	public void render(GL2 gl) {
		gl.glMatrixMode(GL2.GL_MODELVIEW);
		renderBody(gl);
		
		gl.glPushMatrix();
			gl.glTranslated(-0.05f, 0f, 0f);
			renderLeftWindow(gl);
			renderDoor(gl);
		gl.glPopMatrix();
		
		gl.glPushMatrix();
			gl.glTranslated(0.2f, 0f, 0f);
			renderLeftWindow(gl);
			renderRightWindow(gl);
		gl.glPopMatrix();
		
		gl.glPushMatrix();
			gl.glTranslated(0.45f, 0f, 0f);
			renderLeftWindow(gl);
			renderRightWindow(gl);
		gl.glPopMatrix();
	

		gl.glPushMatrix();
			gl.glTranslated(0.5f, 0f, 0f);
			renderBackWindow(gl);
		gl.glPopMatrix();
		
		gl.glPushMatrix();
			gl.glTranslated(-0.3f, 0f, 0f);
			renderFrontWindow(gl);
		gl.glPopMatrix();
		
		gl.glPushMatrix();
			gl.glTranslated(-0.6f, -0.2f, 0.15f);
			renderWheel(gl);
		gl.glPopMatrix();
		
		gl.glPushMatrix();
			gl.glTranslated(-0.6f, -0.2f, -0.25f);
			renderWheel(gl);
			gl.glPopMatrix();
	
		gl.glPushMatrix();
			gl.glTranslated(0.2f, -0.2f, 0.15f);
			renderWheel(gl);
		gl.glPopMatrix();

		gl.glPushMatrix();
			gl.glTranslated(0.2f, -0.2f, -0.25f);
			renderWheel(gl);
		gl.glPopMatrix();
		
		gl.glPushMatrix();
			gl.glTranslated(-0.775f, -0.1f, -0.1f);
			renderLight(gl);
		gl.glPopMatrix();
		
		gl.glPushMatrix();
			gl.glTranslated(-0.775f, -0.1f, 0.1f);
			renderLight(gl);
		gl.glPopMatrix();
		
		gl.glPushMatrix();
			gl.glTranslated(-0.3f, 0.2f, 0f);
			renderRoof(gl);
		gl.glPopMatrix();
		
		gl.glPushMatrix();
			gl.glTranslated(-0.55f, 0f, 0f);
			renderChimny(gl);
		gl.glPopMatrix();
		
		
	}
	public void renderBody(GL2 gl) {
		gl.glBegin(GL2.GL_QUADS);
		gl.glColor3f(0.6f, 0f, 0f);
		
		gl.glVertex3f(0.5f ,0.2f, -0.2f);   //back  		
		gl.glVertex3f(0.5f ,0.2f, 0.2f);
		gl.glVertex3f(0.5f ,-0.2f, 0.2f);
		gl.glVertex3f(0.5f ,-0.2f, -0.2f);
		
		gl.glVertex3f(0.5f ,0.2f, -0.2f);   //right
		gl.glVertex3f(0.5f ,-0.2f, -0.2f);
		gl.glVertex3f(-0.3f ,-0.2f, -0.2f);
		gl.glVertex3f(-0.3f ,0.2f, -0.2f);
		
		gl.glVertex3f(0.5f ,-0.2f, 0.2f);   //left  		
		gl.glVertex3f(0.5f ,0.2f, 0.2f);
		gl.glVertex3f(-0.3f ,0.2f, 0.2f);
		gl.glVertex3f(-0.3f ,-0.2f, 0.2f);
		
		gl.glVertex3f(-0.3f ,-0.2f, 0.2f);   //front  		
		gl.glVertex3f(-0.3f ,0.2f, 0.2f);
		gl.glVertex3f(-0.3f ,0.2f, -0.2f);
		gl.glVertex3f(-0.3f ,-0.2f, -0.2f);
		
		gl.glVertex3f(-0.3f ,-0.2f, 0.2f);   //floor  		
		gl.glVertex3f(-0.3f ,-0.2f, -0.2f);
		gl.glVertex3f(0.5f ,-0.2f, -0.2f);
		gl.glVertex3f(0.5f ,-0.2f, 0.2f);
		
		gl.glVertex3f(-0.3f ,0.2f, -0.2f);   //roof  		
		gl.glVertex3f(-0.3f ,0.2f, 0.2f);
		gl.glVertex3f(0.5f ,0.2f, 0.2f);
		gl.glVertex3f(0.5f ,0.2f, -0.2f);
		
		
		
		
		
		gl.glVertex3f(-0.3f ,0f, -0.2f);   //right
		gl.glVertex3f(-0.3f ,-0.2f, -0.2f);
		gl.glVertex3f(-0.8f ,-0.2f, -0.2f);
		gl.glVertex3f(-0.8f ,0f, -0.2f);
		
		
		gl.glVertex3f(-0.3f ,-0.2f, 0.2f);   //left  		
		gl.glVertex3f(-0.3f ,0f, 0.2f);
		gl.glVertex3f(-0.8f ,0f, 0.2f);
		gl.glVertex3f(-0.8f ,-0.2f, 0.2f);
	
		gl.glVertex3f(-0.8f ,-0.2f, 0.2f);   //front  		
		gl.glVertex3f(-0.8f ,0f, 0.2f);
		gl.glVertex3f(-0.8f ,0f, -0.2f);
		gl.glVertex3f(-0.8f ,-0.2f, -0.2f);
		
		gl.glVertex3f(-0.8f ,-0.2f, 0.2f);   //floor  		
		gl.glVertex3f(-0.8f ,-0.2f, -0.2f);
		gl.glVertex3f(-0.3f ,-0.2f, -0.2f);
		gl.glVertex3f(-0.3f ,-0.2f, 0.2f);
		
		gl.glVertex3f(-0.8f ,0f, -0.2f);   //roof  		
		gl.glVertex3f(-0.8f ,0f, 0.2f);
		gl.glVertex3f(-0.3f ,0f, 0.2f);
		gl.glVertex3f(-0.3f ,0f, -0.2f);
		
	
		gl.glEnd();
		
		
	}
	
	public void renderLeftWindow(GL2 gl) {
		gl.glBegin(GL2.GL_QUADS);
		
		gl.glColor3f(0f, 0f, 0.1f);
		
		gl.glVertex3f(0f ,-0.05f, 0.2f+0.001f);		
		gl.glVertex3f(0f ,0.15f, 0.2f+0.001f);
		gl.glVertex3f(-0.15f ,0.15f, 0.2f+0.001f);
		gl.glVertex3f(-0.15f ,-0.05f, 0.2f+0.01f);
	
		gl.glEnd();
		
		
	}
	
	public void renderRightWindow(GL2 gl) {
		gl.glBegin(GL2.GL_QUADS);
		
		gl.glColor3f(0f, 0f, 0.1f);
		
		gl.glVertex3f(-0.15f ,0.15f, -0.2f-0.001f);		
		gl.glVertex3f(0f ,0.15f, -0.2f-0.001f);
		gl.glVertex3f(0f ,-0.05f, -0.2f-0.001f);
		gl.glVertex3f(-0.15f ,-0.05f, -0.2f-0.001f);
	
		gl.glEnd();
		
		
	}
	public void renderBackWindow(GL2 gl) {
		gl.glBegin(GL2.GL_QUADS);
		
		gl.glColor3f(0f, 0f, 0.1f);
		
		gl.glVertex3f(0f+0.001f,0.15f, -0.15f);		
		gl.glVertex3f(0f+0.001f,0.15f, 0.15f);
		gl.glVertex3f(0f+0.001f,-0.05f, 0.15f);
		gl.glVertex3f(0f+0.001f,-0.05f, -0.15f);
	
		gl.glEnd();
		
		
	}
	public void renderFrontWindow(GL2 gl) {
		gl.glBegin(GL2.GL_QUADS);
		
		gl.glColor3f(0f, 0f, 0.1f);
		
		gl.glVertex3f(0f-0.001f ,0.15f, 0.15f);		
		gl.glVertex3f(0f-0.001f ,0.15f, -0.15f);
		gl.glVertex3f(0f-0.001f ,0f, -0.15f);
		gl.glVertex3f(0f-0.001f ,0f, 0.15f);
	
		gl.glEnd();
		
		
	}
	public void renderDoor(GL2 gl) {
		gl.glBegin(GL2.GL_QUADS);
		
		gl.glColor3f(0f, 0f, 0.1f);
		
		gl.glVertex3f(-0.15f ,0.15f, -0.2f-0.001f);		
		gl.glVertex3f(0f ,0.15f, -0.2f-0.001f);
		gl.glVertex3f(0f ,-0.2f, -0.2f-0.001f);
		gl.glVertex3f(-0.15f ,-0.2f, -0.2f-0.001f);
	
		gl.glEnd();
		
		
	}
	
	public void renderWheel(GL2 gl) {
		GLU glu = new GLU();
		GLUquadric quad = glu.gluNewQuadric(); 

		gl.glColor3f(0f, 0.2f, 0f);
		glu.gluCylinder(quad, 0.1f, 0.1f, 0.1f, 20, 1);
		gl.glPushMatrix();
			gl.glColor3f(0.3f, 0.2f, 0.1f);
			gl.glTranslated(0, 0, 0.1);
			glu.gluDisk(quad,0.07f ,0.1f,20,1);
			gl.glColor3f(0.4f, 0f, 0f);
			glu.gluDisk(quad,0f ,0.07f,20,1);
		gl.glPopMatrix();
		gl.glPushMatrix();
			gl.glFrontFace(GL2.GL_CW);
			gl.glColor3f(0.3f, 0.2f, 0.1f);
			glu.gluDisk(quad,0.07f ,0.1f,20,1);
			gl.glColor3f(0.4f, 0f, 0f);
			glu.gluDisk(quad,0f ,0.07f,20,1);
		gl.glPopMatrix();
		gl.glFrontFace(GL2.GL_CCW);
		glu.gluDeleteQuadric(quad);
	}
	
	public void renderLight(GL2 gl) {
		GLU glu = new GLU();
		GLUquadric quad = glu.gluNewQuadric(); 

		gl.glColor3f(0.1f, 0.1f, 0.1f);
		gl.glTranslated(-0.05f, 0f, 0f);
		gl.glRotated(Math.toDegrees(Math.acos(0)), 0, 1, 0);
		
		glu.gluCylinder(quad, 0.05f, 0.05f, 0.05f, 20, 1);
		gl.glPushMatrix();
			gl.glFrontFace(GL2.GL_CW);
			gl.glColor3f(1f, 1f, 1f);
			glu.gluDisk(quad,0f ,0.05f,20,1);
		gl.glPopMatrix();
		
		gl.glFrontFace(GL2.GL_CCW);
		glu.gluDeleteQuadric(quad);
		
		
		
		
	}
	
	public void renderRoof(GL2 gl) {
		GLU glu = new GLU();
		GLUquadric quad = glu.gluNewQuadric(); 

		gl.glColor3f(0.1f, 0.1f, 0.1f);
		gl.glScaled(1, 0.15f, 0.5f);
		gl.glRotated(90, 0, 1, 0);
		glu.gluCylinder(quad, 0.4f, 0.4f, 0.8f, 20,1);
	
		gl.glPushMatrix();
			gl.glFrontFace(GL2.GL_CW);
			glu.gluDisk(quad,0f ,0.4f,20,1);
			gl.glFrontFace(GL2.GL_CCW);
		gl.glPopMatrix();
		gl.glPushMatrix();
			gl.glTranslated(0, 0, 0.8f);
			glu.gluDisk(quad,0f ,0.4f,20,1);
		gl.glPopMatrix();
		
		glu.gluDeleteQuadric(quad);
	}
		
	//meilfunctional  
	public void renderChimny(GL2 gl) {
		GLU glu = new GLU();
		GLUquadric quad = glu.gluNewQuadric(); 

		gl.glColor3f(0.6f, 0f, 0f);
		gl.glRotated(-90, 1, 0, 0);
		glu.gluCylinder(quad, 0.05f, 0.05f, 0.2f, 20, 1);

		gl.glTranslated(0, 0, 0.2);
		glu.gluCylinder(quad, 0.1f, 0.1f, 0.1f, 20, 1);
		gl.glPushMatrix();
			
			gl.glTranslated(0, 0, 0.1);
			glu.gluDisk(quad,0f ,0.1f,20,1);
		
		gl.glPopMatrix();
		gl.glPushMatrix();
			gl.glFrontFace(GL2.GL_CW);
			glu.gluDisk(quad,0f ,0.1f,20,1);
			gl.glFrontFace(GL2.GL_CCW);
		gl.glPopMatrix();
		
		glu.gluDeleteQuadric(quad);
	}
	
	@Override
	
	public void init(GL2 gl) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void control(int type, Object params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isAnimated() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setCamera(GL2 gl) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return "Locomotive";
	}

}
