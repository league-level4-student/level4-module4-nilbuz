package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;
import java.util.Random;

import javax.swing.JOptionPane;

public class MessageMorph extends Polymorph implements MouseListener{

	MessageMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	@Override
	public void update() {
//		Random rand = new Random();
//		setX(rand.nextInt(500-getWidth()));
//		setY(rand.nextInt(500-getHeight()));
		
	}
	
	public void showMessage() {
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "a");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
