package javaBasics;

import java.util.Scanner;

public class inputOutput {

	public static void main(String[] args) {
     System.out.println("This is a output line");
     
     System.out.print("First String ");
     System.out.print("Second String");
     
     System.out.println();
     System.out.printf("This is a formatted output %d, PI=%f \n", 10, 22f/7);
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter a number: ");
     int num=sc.nextInt();
     System.out.println("The number you have entered is :"+num);
     
     sc.close();
     
	}

}
