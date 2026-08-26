package javaBasics;

import java.util.Scanner;

public class stringProgram {

	public static void main(String[] args) {
    char []charArray= {'S','t','r','i','n','g'};
    String str=new String(charArray);
    System.out.println(str);
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter input:");
    String inp=sc.next();
    System.out.println("The input string is :"+inp );
    
    String str1="Hello";
    String str2="World";
    System.out.println(str1 + " "+str2);
	}

}
