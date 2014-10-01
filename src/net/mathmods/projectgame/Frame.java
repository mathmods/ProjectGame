package net.mathmods.projectgame;

import javax.swing.JFrame;

public class Frame extends JFrame {

	public static void main(String[] args){
		//SwingUtilities.invokeLater(new Runnable()){
		//	@Override
		//	public void run(){
				new Frame();
		//	}
		//};
	}
	
	public Frame(){
		new JFrame();
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setExtendedState(MAXIMIZED_BOTH);
		this.setTitle("Project Game");
		this.setUndecorated(true);
		this.setResizable(false);
		this.setVisible(true);
		
		Screen screen = new Screen(this);
		this.add(screen);
	}
	
}
