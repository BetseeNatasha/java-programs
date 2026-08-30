package javaBasics;

public class StringBufferBuilder {

	public static void main(String[] args) {
     StringBuffer str1= new StringBuffer();
     System.out.println("The capacity of string buffer 1 is: "+str1.capacity()); //16
     
     str1=new StringBuffer(50);
     System.out.println("The capacity of string buffer 1 is: "+str1.capacity()); //50 - Setting the capacity to 50 
          
     str1=new StringBuffer("Hello");
     System.out.println("The capacity of string buffer 1 is: "+str1.capacity()); //21
     
     str1.append(" World");
     System.out.println("The string 1 after appending is: "+str1); 
     
     StringBuffer str2=new StringBuffer("AABBDDEE");
     str2.insert(4, "CC");
     System.out.println("The string 2 after inserting 'C' at index 3 is: "+str2);
     System.out.println("The string 2 after deleting 'CC' from index 4 to 6 is: "+str2.delete(4, 6)); 
     System.out.println("The string 2 after replacing 'BB' with 'FF' from index 2 to 4 is: "+str2.replace(2, 4, "FF")); 
     System.out.println("The string 2 after reversing is: "+str2.reverse());
	}

}
