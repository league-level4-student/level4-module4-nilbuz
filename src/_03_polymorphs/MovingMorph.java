package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph {

	boolean direction = true;

	MovingMorph(int x, int y, int width, int height) {
		super(x, y, width, height);

	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	@Override
	public void update() {
		System.out.println(getX());

		if (getX() > 500 - getWidth()) {
			direction = false;
		}

		if (getX() < 0) {
			direction = true;
		}

		if (direction) {
			setX(getX() + 5);
		} else if (!direction) {
			setX(getX() - 5);
		}

	}

}
