package com.threads;

public class Test1 {

	public static void main(String[] args) {
		
		 permutation("ABC");
		
		 }
		  
		 private static void permutation(String string) {
		  printPermutation(string,"");
		 }
		 
		 private static void printPermutation(String string, String permutation) {
		   
		  if(string.length()==0){
			  if(permutation.equals("CAB"))
			  {
		   System.out.println(permutation);
			  }
		   return;
		  }
		   
		  for (int i = 0; i < string.length(); i++) {
		   char toAppendToPermutation = string.charAt(i);
		   String remaining = string.substring(0, i) + string.substring(i + 1);
		    
		   printPermutation( remaining,  permutation + toAppendToPermutation);
		  }  
		 }
}
