package com.csplusplus;

public class Unit8 {

    // 1. Method to calculate the sum of all elements in a 2D array
    // Instructions: Traverse the 2D array and calculate the sum of all elements.
    public static int sumOfElements(int[][] array) {
    	int sum = 0;
        for(int[] val: array) {
        	for(int num: val) {
        		sum+=num;
        	}
        }
        return sum;
    }

    // 2. Method to count how many times a specific number appears in a 2D array
    // Instructions: Traverse the 2D array and count the number of times a specified value appears.
    public static int countOccurrences(int[][] array, int value) {
    	int count = 0;
        for(int[] val: array) {
        	for(int num: val) {
        		if(num == value) {
        			count++;
        		}
        	}
        }
        return count;
    }

    // 3. Method to find the maximum element in a 2D array
    // Instructions: Traverse the 2D array and find the maximum element.
    public static int findMax(int[][] array) {
    	int max = array[0][0];
        for(int[] val: array) {
        	for(int num: val) {
        		if(num > max) {
        			max = num;
        		}
        		}
        	}
        return max;
        }
        
    // 4. Method to reverse the rows of the 2D array
    // Instructions: Reverse the rows of the 2D array (e.g., the first row becomes the last, etc.).
    public static void reverseRows(int[][] array) {
     	    int[][] newarr = new int[array.length][array[0].length];
     	    //int i = array.length-1;
     	    for (int row = 0; row < array.length; row++) {
     	    	for (int col = 0; col < array[0].length; col++) {
     	    		newarr[row][col] = array[array.length-1-row][col];
     	    	}
     	    }
     	    for(int row = 0; row < array.length; row++) {
     	    	for(int col = 0; col<array[0].length;col++) {
     	    		array[row][col] = newarr[row][col];
     	    	}
     	    }
     }
   

    // 5. Method to transpose a 2D array (swap rows and columns)
    // Instructions: Create and return a new 2D array that is the transpose of the input array.
    public static int[][] transpose(int[][] array) {
    	    int[][] newarr = new int[array[0].length][array.length];
    	    for (int row = 0; row < array.length; row++) {
    	    	for (int col = 0; col < array[0].length; col++) {
    	    		newarr[col][row] = array[row][col];
    	    	}
    	    }
    	    return newarr;
    }
 
    

    // 6. Method to fill a 2D array with random integers
    // Instructions: Create a 2D array of size numRows x numCols and fill it with random integers between min and max.
    public static int[][] fillWithRandom(int min, int max, int numRows, int numCols) {
    	int[][] array = new int[numRows][numCols];
    	for (int row = 0; row < array.length; row++) {
	    	for (int col = 0; col < array[0].length; col++) {
	    		array[col][row] = (int)(Math.random()*max)+min;
	    	}
	    }
    	return array;
    }
}