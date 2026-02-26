package javafullstack;

import java.util.Scanner;

public class task {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		
		
//		arithmetic operations
		int a=30,b=20;
		System.out.println("Addition: "+(a+b));
	    System.out.println("Subtraction: "+(a-b));
	    System.out.println("Mutliplication: "+(a*b));
	    System.out.println("Division: "+(a/b));
	    System.out.println("Modules: "+(a%b));
	    
	    
//	    swapping of two numbers
//		using temp
		int k=10,l=20;
		int temp=k;
		k=l;
		l=temp;
		System.out.println("k: "+k+" l: "+l);
		
//		without using third value
		int x=20,y=30;
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("x: "+x+" y: "+y);
		
//		using bitwise operator
		int m=100,n=50;
		m=m^n;
		n=m^n;
		m=m^n;
		System.out.println("m: "+m+" n: "+n);
		
//		last 2digit of a number
		int z=456;
		System.out.println("Last two digit: "+(z%100));
		
//		middle number
		int p=89879;
		int q=p;
		p/=100;
		int r=p%10;
		System.out.println("Given number:"+q);
		System.out.println("Middle number:"+r);
		System.out.println("Square of the middle number ("+r+") : "+(r*r));
		
		
//		last 
		System.out.print("Enter a number: ");
		int num=ob.nextInt();
		System.out.println("The Last digit of the given number: "+(num%10));

		
		
//		square root
		System.out.print("enter a value: ");
		int val=ob.nextInt();
		System.out.println("Square root of the given value: "+(int)Math.sqrt(val));
		
		
//	area of the triangle
		
		System.out.print("Enter the base value: ");
		float base=ob.nextFloat();
		System.out.print("Ente the height value: ");
		float height=ob.nextFloat();
		System.out.println("The area of the traingle is "+(0.5*height*base));
		
		
//		kilometer to  miles
		System.out.print("Enter the kilometers: ");
		float km=ob.nextFloat();
		System.out.println("The equivalent miles: "+(km*0.63)+"miles");
		
		
//		C-F
		System.out.print("Enter the Celsius value: ");
		float c=ob.nextFloat();
		System.out.println("The fahrenheit value: "+((c*1.8)+32));
		
//		quadratic equation
		
		System.out.print("Enter the value of a: ");
		int A=ob.nextInt();
		System.out.print("Enter the value of b: ");
		int B=ob.nextInt();
		System.out.println("(a+b)^2: "+((Math.pow(A, 2))+(2*A*B)+Math.pow(B,2)));
		System.out.println("(a-b)^2: "+((Math.pow(A, 2))-(2*A*B)+Math.pow(B,2)));
		System.out.println("((a^2)-(b^2)): "+((A+B)*(A-B)));
		
//		input
		System.out.print("Enter the integer:");
		int integer=ob.nextInt();
		System.out.println(integer);
		
		System.out.print("Enter a character:");
		char character=ob.next().charAt(0);
		System.out.println(character);
		
		System.out.print("Enter a word: ");
		String word=ob.next();
		System.out.println(word);
		
		ob.nextLine();
		
		System.out.print("Enter the sentence:");
		String line=ob.nextLine();
		System.out.println(line);
		
		System.out.print("Enter a decimal value:");
		float decimal=ob.nextFloat();
		System.out.println(decimal);
		
		
		
		

	}

}
