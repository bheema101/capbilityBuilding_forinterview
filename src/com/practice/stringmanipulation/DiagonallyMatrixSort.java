package com.practice.stringmanipulation;

public class DiagonallyMatrixSort {

	public static void main(String[] args) {
		int[][] matrix = new int[3][3];
		System.out.println(matrix.length);
		int k=10;
		int diagonalyyarrayindex =0;
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix.length;j++) {
				matrix[i][j] =  --k;
			}
		}
		
		int diagonalyyarray[] = new int[3];
		//collecting diagonally element
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix.length;j++) {
				//System.out.print( "  "+matrix[i][j]);
				if(i==j) {
					diagonalyyarray[diagonalyyarrayindex++] = matrix[i][j];
				}
			}
		}
		
		
		
		
		int temp=0;
		//sorting element using array
		//using collection we can use collections.sort() method by passing list
		for(int i=0;i<diagonalyyarray.length;i++) {
			//System.out.print(diagonalyyarray[i]);951 591 519   
			for(int j = i+1;j<diagonalyyarray.length;j++) {
				if(diagonalyyarray[i] > diagonalyyarray[j]) {
					temp = diagonalyyarray[i];
					diagonalyyarray[i] = diagonalyyarray[j];
					diagonalyyarray[j] = temp;
				}}
			
		}
		
		
		for(int i=0;i<diagonalyyarray.length;i++) {
			System.out.print(diagonalyyarray[i] +" ");
			
		}
		

	}

}
