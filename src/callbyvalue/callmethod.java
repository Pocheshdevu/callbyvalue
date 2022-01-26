package callbyvalue;

import java.io.*;

public class callmethod {
	static void swap(int a ,int b)
	{
		int temp = a;
		a=b;
		b=temp;
	}
	public static void main(String[] args) 
	{
		int x = 5;
		int y = 7;
		System.out.println("before swapping x = " + x + " and y = " + y);
		swap(x,y);
		System.out.println("after swapping x = " + x + " and y  = " + y);
		
		
	
	
	}

}
