package utilpackage;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		
		
		int a[]={100,6,44,33,77,99};
		
		char c[]={'j','p','a','A'};
		
		Arrays.sort(a);
		
		
	
		for(int b:a)
		{
			System.out.println(b);
		}

		
		Arrays.sort(c);
		
		for(char cc:c)
			System.out.println(cc);
	}

}
