import java.util.Scanner;

public class MultiplyingMatrices {
	public static void main(String[] args) {
		// User inputs for numRows and numCols of both 2D arrays A and B
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of rows for matrix A: ");
		int numRowsA = input.nextInt();
		System.out.println("Enter number of columns for matrix A: ");
		int numColsA = input.nextInt(); 
		System.out.println("Enter number of rows for matrix B: ");
		int numRowsB = input.nextInt();
		System.out.println("Enter number of columns for matrix B: ");
		int numColsB = input.nextInt();
		
		// Checks to see if the two matrices can be multiplied at all
		if(numRowsA != numColsB && numRowsB != numColsA) {
			System.out.println("AB is not defined");
			System.exit(1);
		}
		// Creates 2D arrays representing matrix A and B
		int[][] matrixA = new int[numRowsA][numColsA];
		int[][] matrixB = new int[numRowsB][numColsB];
		int counter = 1;
		// Gets user input to establish row and column values for A. Keep entering numbers until the program asks you to enter the next row.
		for(int i = 0; i < matrixA.length; i++, counter++) {
			System.out.println("Enter row " + counter + " of A: ");
			for(int j = 0; j < matrixA[i].length; j++) {
				matrixA[i][j] = input.nextInt();
			}
		}
		counter = 1;
		// Gets user input to establish row and column values for B.
		for(int i = 0; i < matrixB.length; i++, counter++) {
			System.out.println("Enter row " + counter + " of B: ");
			for(int j = 0; j < matrixB[i].length; j++) {
				matrixB[i][j] = input.nextInt();
			}
		}
		// Multiplies the matrices together
		if(numRowsA == numColsB) {
			int[][] matrixC = new int[numRowsA][numColsB];
			for(int i = 0; i < numRowsA; i++) {
				for(int j = 0; j < numColsB; j++) {
					for(int k = 0; k < numColsA; k++) {
						matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
					}
				}	
			}
			// call to the print array method to print out the product of A and B
			printArray(matrixC);
		}
	}
	// Prints 2D arrays
	public static void printArray(int[][] a) {
		for(int i = 0; i < a.length; i++) {
			System.out.println();
			for(int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
		}
	}
}