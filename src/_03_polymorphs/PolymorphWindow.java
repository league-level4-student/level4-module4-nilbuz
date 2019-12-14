package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener {
	public static final int WIDTH = 900;
	public static final int HEIGHT = 600;

	private JFrame window;
	private Timer timer;

	Polymorph bluePoly;
	Polymorph redPoly;
	Polymorph movingPoly;
	Polymorph circlePoly;
	Polymorph mousePoly;
	Polymorph messagePoly;
	
	public ArrayList<Polymorph> polymorphs;

	public static void main(String[] args) {
		new PolymorphWindow().buildWindow();
	}

	public void buildWindow() {
		window = new JFrame("IT'S MORPHIN' TIME!");
		window.add(this);
		window.getContentPane().setPreferredSize(new Dimension(500, 500));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		window.setVisible(true);

		polymorphs = new ArrayList<Polymorph>();
		polymorphs.add(bluePoly = new BluePolymorph(10,10,40,40));
		polymorphs.add(redPoly = new RedMorph(100, 100, 60, 60));
		polymorphs.add(movingPoly = new MovingMorph(0, 400, 30, 30));
		polymorphs.add(circlePoly = new CircleMorph(100,200,50,50));
		polymorphs.add(mousePoly = new MouseMorph(0,0,20,20));
		polymorphs.add(messagePoly = new MessageMorph(0,0,10,10));
		
		

		timer = new Timer(1000 / 60, this);
		timer.start();
	}

	public void paintComponent(Graphics g) {
		// draw background
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, 500, 500);

		// draw polymorph
		
		for (Polymorph morph : polymorphs) {
			morph.draw(g);
			morph.update();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();

	}
}
