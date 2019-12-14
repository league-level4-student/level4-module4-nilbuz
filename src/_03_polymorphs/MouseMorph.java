package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.MouseInfo;


public class MouseMorph extends Polymorph{

	int mouseX;
	int mouseY;
	
	MouseMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
		
	}

	@Override
	public void update() {
		System.out.println(mouseX +" "+ mouseY);
		mouseX = (int) MouseInfo.getPointerInfo().getLocation().getX();
		mouseY = (int) MouseInfo.getPointerInfo().getLocation().getY();
		
		setX(mouseX);
		setY(mouseY-50);
		
	}

}
