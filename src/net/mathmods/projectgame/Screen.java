package net.mathmods.projectgame;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Screen extends JPanel implements Runnable {

	Thread thread = new Thread(this);
	Frame frame;
	public boolean running = false;
	private int fps = 0;
	public static int scene = 0;
	
	public Screen(Frame frame){
		this.frame = frame;
		
		frame.addKeyListener(new Listener(this));
		
		thread.start();
	}
	
	@Override
	public void paintComponent(Graphics g){
		
		g.clearRect(0, 0, frame.getWidth(), frame.getHeight());
		
		g.drawString(fps + "", 10, 10);
	}
	
	@Override
	public void run() {
		
		long lastTime = System.currentTimeMillis();
		
		running = true;
		int frames = 0;
		
		while(running){
			
			repaint();
			
			frames++;
			if(System.currentTimeMillis() - 1000 >= lastTime){
				fps = frames;
				frames = 0;
				lastTime = System.currentTimeMillis();
				
			}
			
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public class listen{
		public void KeyESC(){
			running = false;
		}
	}

}
