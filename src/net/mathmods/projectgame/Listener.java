package net.mathmods.projectgame;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Listener implements KeyListener {

	private Screen s;
	private Screen.listen l;
	
	public Listener(Screen s){
		this.s = s;
		this.l = s.new listen();
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()){
		case 27:
			
		default:
			System.out.println(e.getKeyCode());
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

}
