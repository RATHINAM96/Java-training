package com.girmiti.javaprograms;
/*
 * Author:Rathinam Somasundaram
 */

import java.util.Scanner;
public class Area_of_circle {

	public static void main(String[] args) {
		
		/*Declaration of variables and data types*/
		
		double PI = 3.14;
		double r;
		double area;
		
		/*Creating Scanner object*/
		
		Scanner input = new Scanner(System.in);
		
		/*Input for r*/
		
		System.out.println("Enter the value for r ");
		r = input.nextDouble();
		
		/*Finding Area of circle*/
		
		area = PI * r * r;
		
		/*Printing Results*/
		
		System.out.println("The area of circle is "  + " "+ area);
		
		
		
		

	}

}
