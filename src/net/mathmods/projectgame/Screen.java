package net.mathmods.projectgame;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Screen extends JPanel implements Runnable {

	Thread thread = new Thread();
	Frame frame;
	public boolean running = false;
	private int fps = 0;
	public static int scene = 0;
	
	public Screen(Frame frame){
		this.frame = frame;
	}
	
	@Override
	public void paintComponents(Graphics g){
		
		
		
	}
	
	@Override
	public void run() {
		
		float lastTime = System.currentTimeMillis();
		
		running = true;
		int frames = 0;
		
		while(running){
			
			repaint();
			
			frames++;
			if(lastTime <= System.currentTimeMillis()){
				fps = frames;
				frames = 0;
			}
		}
	}

}
