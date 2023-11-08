package com.lbrce;

public class FindCuboidArea {
	public static double findSurfaceArea(double length, double width, double height)
	{
		 double surfaceArea = 2 * ((length * width) + (length * height) + (width * height));
	        return surfaceArea;
	}

}
