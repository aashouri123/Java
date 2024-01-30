import java.util.Scanner;

public class Project3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double[][] matrix = new double[4][4]; // a 4 by 4 matrix

		System.out.println("Enter the matrix: ");
		for (int row = 0; row < matrix.length; row++) {  // 2 loops to access the row then the column of array
			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = input.nextDouble();
			};
		};
		System.out.printf("The average of the Diagnoal is: %.3f ", averageMajorDiagonal(matrix));

	};
	
	public static double averageMajorDiagonal(double[][] m) {
		double sum = 0;
		
		for(int i = 0; i < m.length;i++) {
				sum += m[i][i];
		};
		return sum / m.length;
	};

};
