package com.girmiti.javaprograms;

import java.util.Scanner;

/*
 * Author:Rathinam Somasundaram
 */
public class Perimeter_and_area_of_Rectangle {

	public static void main(String[] args) {
		
/*Declaration of variables*/
		
		double length;
		double width;
		double area;
		double perimeter;
		
		/*Creating Scanner class object*/
		
		Scanner input = new Scanner(System.in);
		
		/*Input for length of Rectangle*/
		
		System.out.println("Enter the Length of the Rectangle");
		length = input.nextDouble();
		
		/*Input for  width of the Rectangle*/
		
		System.out.println("Enter the Width of the Rectangle ");
		width = input.nextDouble();
		
		/*Calculating Area of Rectangle*/
		
		area = length*width;
		
		/*Calculating Perimeter of Rectangle*/
		
		perimeter = 2*(length + width);
		
		/*Print the perimeter of Rectangle*/
		
		System.out.println("Perimeter of Rectangle is" + " " + perimeter + "units");
		
		/*Print the area of Rectangle*/
		
		System.out.println("Area of Rectangle"+ " "+ area + "Sq.units");
		

	}

}
