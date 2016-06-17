package a00_mandelbrot;

//Mandelbrot.java
//Zuerst warten bis die Grafik gezeichnet wird 
//Mit der Maus kann ein Rechteck markiert werden, dessen Inhalt in einem
//neuen Fenster vergrössert wird

import ch.aplu.util.*;
import java.awt.Color;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class Mandelbrot extends GPanel implements MouseListener,
		MouseMotionListener {
	private int maxIterations = 50;
	private double range;
	private int res;
	private Point2D.Double start, end;
	private double s;
	private boolean drawNext = false;
	private MessageDialog msg = new MessageDialog(
			"Es wird viel gerechnet. Bitte warten...");

	public Mandelbrot(Point2D.Double start, Point2D.Double end) {
		super("Mandelbrot", start.x, end.x, start.y, end.y);
		res = this.getWindow().getHeight();
		range = end.x - start.x;
		addMouseListener(this);
		addMouseMotionListener(this);
		enableRepaint(false);
		this.start = start;
		this.end = end;
		draw();
		while (!drawNext)
			Thread.currentThread().yield();
		new Mandelbrot(start, end);
	}

	public void mouseDragged(MouseEvent e) {
		Graphics2D offG2D = getWindow().getOffG2D();
		offG2D.setXORMode(Color.white);
		color(Color.red);
		Square(start.x, start.y, end.x, end.y);
		end.x = toWindowX(e.getX());
		end.y = toWindowY(e.getY());
		Square(start.x, start.y, end.x, end.y);
		repaint();
	}

	public void mousePressed(MouseEvent e) {
		start.x = end.x = toWindowX(e.getX());
		start.y = end.y = toWindowY(e.getY());
	}

	public void mouseReleased(MouseEvent e) {
		start.x = Math.min(start.x, end.x);
		start.y = Math.min(start.y, end.y);
		end.x = start.x + s;
		end.y = start.y + s;
		drawNext = true;
	}

	void Square(double x1, double y1, double x2, double y2) {
		double b = x2 - x1;
		double h = y2 - y1;
		s = Math.max(Math.abs(b), Math.abs(h));
		if (b != 0 && Math.abs(b) < s)
			b = b / Math.abs(b) * s;
		if (h != 0 && Math.abs(h) < s)
			h = h / Math.abs(h) * s;
		line(x1, y1, x1 + b, y1);
		line(x1 + b, y1, x1 + b, y1 + h);
		line(x1 + b, y1 + h, x1, y1 + h);
		line(x1, y1 + h, x1, y1);
		end.x = x1 + b;
		end.y = y1 + h;
	}

	public void draw() {
		msg.show();
		Complex vector = new Complex(start.x, start.y);
		for (double i = 0; i < res; i++) {
			for (double j = 0; j < res; j++) {
				Complex ctemp = new Complex(range / res * i, range / res * j);
				Complex c = Complex.add(ctemp, vector);

				Complex z = new Complex(0, 0);
				int k = 0;
				while (z.modulus() < 2 && k < maxIterations) {
					Complex temp = Complex.multiply(z, z); // z = z^2 + c
					z = Complex.add(temp, c);
					k++;
				}
				putPixel(c, new Color((30 * k) % 256, (4 * k) % 256,
						255 - (30 * k) % 256));
			}
			repaint();
		}
		msg.close();
	}

	void putPixel(Complex z, Color c) {
		color(c);
		point(z.getReal(), z.getImg());
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

	public void mouseMoved(MouseEvent e) {
	}

	public void mouseClicked(MouseEvent e) {
	}

	public static void main(String[] args) {
		new Mandelbrot(new Point2D.Double(-2, -2), new Point2D.Double(2, 2));
	}

}
