package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CircleMorph extends Polymorph {

	int angle = 0;
	

	CircleMorph(int x, int y, int width, int height) {
		super(x, y, width, height);

	}

	@Override
	public void update() {
		
		if (angle==360) {
			angle = 0;
		}
		angle+=15;

		setX(225 + (int) (Math.cos(Math.toRadians(angle)) * 200));
		setY(225 + (int) (Math.sin(Math.toRadians(angle)) * 200));
		
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.yellow);
		g.fillOval(getX(), getY(), getWidth(), getHeight());
	}

}
