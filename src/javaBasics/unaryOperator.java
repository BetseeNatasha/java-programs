package javaBasics;

public class unaryOperator {

	public static void main(String[] args) {
     int var1,var2;
     var1=- 50;
     
     var2=- var1; // unary operator to invert the sign 
     System.out.println("The var1 ="+ var1+", var2 = "+ var2);
     
     var1=60;
     var2=var1++;
     System.out.println("The var1 ="+ var1+", var2 = "+ var2);
     
     var1=70;
     var2=++var1;
     System.out.println("The var1 ="+ var1+", var2 = "+ var2);
     
     var1=80;
     var2=--var1;
     System.out.println("The var1 ="+ var1+", var2 = "+ var2);
     
     
     var1=90;
     var2=var1--;
     System.out.println("The var1 ="+ var1+", var2 = "+ var2);
     
     boolean bool1,res;
     bool1=true;
     res=!bool1;
     System.out.println("The bool1 is "+ bool1);
     System.out.println("The result of boolean negation of "+ bool1+" is "+ res);
	}

}
