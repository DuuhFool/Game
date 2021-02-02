package com.tutorial.main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter{
	
	private Handler handler;
	
	private boolean pressingW = false;
	private boolean pressingS = false;
	private boolean pressingD = false;
	private boolean pressingA = false;
	
	
	public KeyInput(Handler handler) {
		this.handler = handler;
	}
	
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		
		for(int i = 0; i< handler.object.size(); i++) {
			GameObject tempObject = handler.object.get(i);
			
			if(tempObject.getId() == ID.Player) {
			
				//KEY COMMANDS
				
				if(key == KeyEvent.VK_W) {
					pressingW = true;
					tempObject.setVelY(-5);
				}
				if(key == KeyEvent.VK_S) {
					pressingS = true;
					tempObject.setVelY(5);
				}
				if(key == KeyEvent.VK_D) {
					pressingD = true;
					tempObject.setVelX(5);
				}
				if(key == KeyEvent.VK_A) {
					pressingA = true;
					tempObject.setVelX(-5);
				}
			}
		}
	}
	
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		
		for(int i = 0; i< handler.object.size(); i++) {
			GameObject tempObject = handler.object.get(i);
			
			if(tempObject.getId() == ID.Player) {
			
				//KEY COMMANDS
				
				if(key == KeyEvent.VK_W) {
					pressingW = false;
					if (pressingS) {
						//tempObject.setVelY(5);
					} else {
						tempObject.setVelY(0);
					}
				}
				if(key == KeyEvent.VK_S) {
					pressingS = false;
					if (pressingW) {
						//tempObject.setVelY(-5);
					} else {
						tempObject.setVelY(0);
					}
				}
				if(key == KeyEvent.VK_D) {
					pressingD = false;
					if(pressingA) {
						//tempObject.setVelX(5);
					} else {
						tempObject.setVelX(0);
					}
				}
				if(key == KeyEvent.VK_A) {
					pressingA = false;
					if(pressingD) {
						 //tempObject.setVelX(-5);
					} else {
						 tempObject.setVelX(0);
					}
				}
			}
		}
	}
	
	
}
