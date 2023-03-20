package ch06.practice.p01;

public class Cylinder {
	public int radius;
	public int height;
	
	public double getVolume() {
		return radius*radius*Math.PI*height;
	}
	
	public double getArea() {
		return radius*radius*Math.PI*2 + 2*Math.PI*radius*height;
	}
}
