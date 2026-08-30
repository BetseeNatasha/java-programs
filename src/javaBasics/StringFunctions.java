package javaBasics;

public class StringFunctions {

	public static void main(String[] args) {
     String str1="HELLO", str2="Hello";
     System.out.println("Length of string 1 is: "+str1.length());
     
     if(str1.equals(str2)) 
    	 System.out.println("Both string 1 and string 2 are equal");
     else
    	 System.out.println("Both string 1 and string 2 are not equal");
     
     if(str1.equalsIgnoreCase(str2)) 
    	 System.out.println("Both string 1 and string 2 are equal");
     else
    	 System.out.println("Both string 1 and string 2 are not equal");
     
     System.out.println("The character at index 2 in string 2 is:"+str2.charAt(2));
     
     System.out.println("The distance between string 1 and string 2 is:"+str1.compareTo(str2));
     
     str1="AABCDEE";
     str2="Java String Functions";
     System.out.println("Does string 1 starts with 'AAB'? "+str1.startsWith("AAB"));
     System.out.println("Does string 1 starts with 'DEF'? "+str1.endsWith("DEF"));
     
     System.out.println("The first occurence of 'a' in string 2 is at index: "+str2.indexOf('a'));
     System.out.println("The last occurence of 'a' in string 2 is at index: "+str2.lastIndexOf('a')); 
     
     System.out.println("Replacing 'E' with 'F' in string 1: "+str1.replace('E','F'));
     
     System.out.println("Substring of string 2 from index 5 to 11 is: "+str2.substring(5,13));
     
     String str3="This-is-a-sample-string";
     String []splitArr=str3.split("-");
     for(String s:splitArr)
     System.out.print(s+" ");
     
     String str4="   This is a sample string for trim method   ";
     System.out.println("This is string 4 before trim: "+str4);
     System.out.println("This is string 4 after trim: "+str4.trim());
     
	}

}
