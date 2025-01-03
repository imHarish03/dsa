package dsa.pattern.creational.prototype;

import java.awt.geom.Point2D;

public class Employee implements Cloneable{
	
	private double point;
	
	public void init() {
		point= Point2D.distance(0, 0, 0, 0);
	}

}
