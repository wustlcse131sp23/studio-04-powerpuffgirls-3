package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		//purple circle topL
		int r3 = 150;
		int g4 = 0;
		int b4 = 255;
		StdDraw.setPenColor(r3, g4, b4);
		double a3 = 0.25;
		double c3 = 0.611;
		double radius2 = 0.15;
		StdDraw.filledCircle(a3, c3, radius2);
		//purple circle bottomR
		int r4 = 150;
		int g5 = 0;
		int b5 = 255;
		StdDraw.setPenColor(r4, g5, b5);
		double a4 = 0.75;
		double c4 = 0.356;
		double radius3 = 0.15;
		StdDraw.filledCircle(a4, c4, radius3);
		//purple rectangle
		int r = 150;
		int g = 0;
		int b = 255;
		StdDraw.setPenColor(r, g, b);
		double x = 0.5;
		double y = 0.5;
		double halfWidth = 0.4;
		double halfHeigh = 0.2;
		StdDraw.filledRectangle(x, y, halfWidth, halfHeigh);
	
		//white circle bottomL
		int r1 = 255;
		int g2 = 255;
		int b2 = 255;
		StdDraw.setPenColor(r1, g2, b2);
		double a = 0.2;
		double c = 0.2;
		double radius = 0.22;
		StdDraw.filledCircle(a, c, radius);
		//white circle topR
		int r2 = 255;
		int g3 = 255;
		int b3 = 255;
		StdDraw.setPenColor(r2, g3, b3);
		double a2 = 0.8;
		double c2 = 0.8;
		double radius1 = 0.22;
		StdDraw.filledCircle(a2, c2, radius1);

		//middle circle blue
		int r6 = 100;
		int g7 = 0;
		int b7 = 255;
		StdDraw.setPenColor(r6, g7, b7);
		double a6 = 0.5;
		double c6 = 0.5;
		double radius5 = 0.15;
		StdDraw.filledCircle(a6, c6, radius5);
		//middle circle green
		int r5 = 100;
		int g6 = 255;
		int b6 = 100;
		StdDraw.setPenColor(r5, g6, b6);
		double a5 = 0.5;
		double c5 = 0.5;
		double radius4 = 0.1;
		StdDraw.filledCircle(a5, c5, radius4);
		//lines 
		int r7 = 255;
		int g8 = 0;
		int b8 = 0;
		double x10 = 0.2;
		double y10 = 0.5;
		double x11 = 0.8;
		double y11 = 0.3;
		StdDraw.setPenColor(r7, g8, b8);
		StdDraw.line(x10, y10, x11, y11);
		double x12 = 0.3;
		double y12 = 0.7;
		double x13 = 0.1;
		double y13 = 0.4;
		StdDraw.line(x12, y12, x13, y13);
		double x14 = 0.5;
		double y14 = 0.4;
		double x15 = 0.3;
		double y15 = 0.7;
		StdDraw.line(x14, y14, x15, y15);
		double x16 = 0.8;
		double y16 = 0.5;
		double x17 = 0.3;
		double y17 = 0.4;
		StdDraw.line(x16, y16, x17, y17);
		double x18 = 0.6;
		double y18 = 0.6;
		double x19 = 0.3;
		double y19 = 0.4;
		StdDraw.line(x18, y18, x19, y19);
		
	}
	



}
