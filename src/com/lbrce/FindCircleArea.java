package com.lbrce;
public class FindCircleArea {
	
		public static double findArea(double radius) {
	        double area = Math.PI * radius * radius;
	        return area;
	    }
	}
public class FindCircleArea {
    public static void main(String[] args) {
        double radius = 5.0;
        double length = 10.0;
        double width = 5.0;
        double height = 2.0;
        double circleArea = FindCircleArea.findArea(radius);
        System.out.println("The area of the circle is: " + circleArea);
        double cuboidSurfaceArea = FindCuboidArea.findSurfaceArea(length, width, height);
        System.out.println("The surface area of the cuboid is: " + cuboidSurfaceArea);
        double rectangleArea = FindRectangleArea.findArea(length, width);
        System.out.println("The area of the rectangle is: " + rectangleArea);
    }
}









