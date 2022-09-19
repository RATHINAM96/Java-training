package com.girmiti.javaprograms;
/*
 * Author:Rathinam Somasundaram
 */
import java.util.Scanner;
public class Sum_and_average_of_three_Numbers {

	public static void main(String[] args) {
		
		/*Declaration of variables and data types*/
		
		int a;
		int b;
		int c;
		int d;
		double e;
		
		/*Creating scanner object*/
		
		Scanner input = new Scanner(System.in);
		
		/*Input for variable a*/
		
		System.out.println("Enter the value of a");
		a = input.nextInt();
		
		/*Input for variable b*/
		
		System.out.println("Enter the value of a");
		b = input.nextInt();
		
		/*Input for variable c*/
		
		System.out.println("Enter the value of a");
		c = input.nextInt();
		
		/*Sum of three numbers*/
		
		d = a + b + c ;
		
		/*Average of three numbers*/
		
		e = (a + b + c)/ 3;
		
		/*Printing Results*/
		
		System.out.println("the Sum of three numbers is "+ " " + d);
		System.out.println("The average of three numbers is"+ " " + e);
		
		
		
		
		
		
	}

}
