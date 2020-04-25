package com.data_structure.practice_set4;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
	
	    static List<Integer> spiralOrder(int[][] matrix) {
	    	
	      int m = matrix.length;
	      int n = matrix[0].length;
	      List<Integer> result = new ArrayList<Integer>();
	      int left = 0;
	      int right = n - 1;
	      int top = 0;
	      int bottom = m - 1;
	      while (result.size() < m * n) {
	        for (int j = left; j <= right && result.size() < m * n; j++) {
	          result.add(matrix[top][j]);
	        }
	        top++;
	        for (int i = top; i <= bottom && result.size() < m * n; i++) {
	          result.add(matrix[i][right]);
	        }
	        right--;
	        for (int j = right; j >= left && result.size() < m * n; j--) {
	          result.add(matrix[bottom][j]);
	        }
	        bottom--;
	        for (int i = bottom; i >= top && result.size() < m * n; i--) {
	          result.add(matrix[i][left]);
	        }
	        left++;
	      }
	      return result;
	    }
	    
	    public static void main(String[] args) {
			int [][] matrix= {{12,34,56,67},
							 {78,89,90,98},
	    					 {21,34,64,76},
	    					 {32,56,87,97}};
	    					 
          List<Integer> list=spiralOrder(matrix);
          System.out.println("In Spiral Order: ");
          System.out.println(list.toString());
		}
}
