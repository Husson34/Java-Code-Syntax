package com.class12;

public class PracticerowSum {

	public static void main(String[] args) {
		int[][] data = { {3, 2, 5},
				
                {1, 4, 4, 8, 13},
                {9, 1, 0, 2},
                {0, 2, 6, 3, -1, -8} };
		
	int	rowsum=0;
	
	for(int r=0; r<data.length; r++) {
		for(int c=0;c<data[r].length;c++) {
		rowsum= rowsum+ data[r][c];
		
		
		}
		System.out.println(rowsum);
		rowsum=0;
	}
		

	}
}

