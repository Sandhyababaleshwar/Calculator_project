package com;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
while(true) {
	System.out.println("Enter choice");
	int choice=s.nextInt();
	switch(choice) {
	case 1:
		System.out.println("hi");
		break;
	case 2:
		System.out.println("bye");
		break;
    case 3:
	    System.out.println("END");
	    System.exit(0);//TERMINATE TO JVM(PROGRAM)
	    default:
	    	System.out.println("Invalid choice");
	}
	System.out.println("--------------");			
     }
   }
 }
