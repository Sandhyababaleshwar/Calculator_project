package com;

import java.util.Scanner;

public class Solution {
public static void main(String[]args) {
	//Scanner
	//upcasting -> Calculator -> CalculatorImpl
	//display 1:add 2:sub 3 4 5:exit default
	//switch
	Scanner s= new Scanner(System.in);
	Calculator calc=new CalculatorImpl();
	while(true) {
	System.out.println("1:Addition\n2:Substraction\n3:Multipliction");
	System.out.println("4:Division\n5:Exit\nEnter Choice");
	int choice=s.nextInt();
	int a=0;
	int b=0;
	if(choice>=1 && choice<=4) {
		System.out.println("Enter 2 Numbers:");
		 a=s.nextInt();
		 b=s.nextInt();
	}
	switch(choice) {
	case 1:
		System.out.println("Sum of"+a+" & "+b+" is "+calc.add(a,b));
		break;
	case 2:
		System.out.println("Difference of"+a+" & "+b+" is "+calc.sub(a,b));
		break;
	case 3:
		System.out.println("Product of"+a+" & "+b+" is "+calc.mul(a,b));
		break;
	case 4:
		int result=calc.div(a, b);//calc.div(10,0)
		if(result!=-1) {
		System.out.println("Division of"+a+" & "+b+" is "+result);
		}
		else {
			System.out.println("Cannot Perform Division");           
		}
		break;
	case 5:
		System.out.println("Thank You");
		System.exit(0);
		default:
			System.out.println(calc.displayErrorMessage());
	}
	System.out.println("----------------");
	
}
	
}
}