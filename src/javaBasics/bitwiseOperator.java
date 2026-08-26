package javaBasics;

public class bitwiseOperator {

	public static void main(String[] args) {
     byte val1=12;
     byte val2=10;
     byte res;
     
     res=(byte)~val1;
     System.out.println(res);
     
     res=(byte)(val1 & val2);
     System.out.println(res);
     
     res=(byte)(val1 | val2);
     System.out.println(res);
     
     res=(byte)(val1 ^ val2);
     System.out.println(res);
     
     res=(byte)(val1 << 2);
     System.out.println(res);
     
     res=(byte)(val1 >> 2);
     System.out.println(res);
	}

}
