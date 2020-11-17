package com.practice.stringmanipulation;

public class MergetwoSortedArray {

	public static void main(String[] args) {
		int[] num1= new int[] {2,5,8,9};
		int[] num2= new int[] {1,3,4,7};
		int[] num3 = new int[8];
		
		int i=0,j=0;
		int n1=num1.length;
		int n2=num2.length;
		int k=0;
		//which element is bigger that array is  increased until condition satasify
		while(i<n1&&j<n2) {
			if(num1[i]<num2[j]) {
				num3[k++] = num1[i++];
			}else {
				num3[k++] = num2[j++];
			}
		}
		
		 while (i < n1) 
			 num3[k++] = num1[i++]; 
	      
	        // Store remaining elements of second array 
	        while (j < n2) 
	        	num3[k++] = num2[j++]; 
		
	        printArray(num3);
		
	}  
	
	static void printArray(int[] num3) {
		
		for(int i=0;i<num3.length;i++) {
			System.out.print(num3[i]);
		}
		
	}
	
	

}
