import java.util.Scanner;

public class Project {

	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in); //scans user input
		
		double a;
		double b;
		double c;
		double r1;
		double r2;
		
		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------\n");
		
		System.out.println("\tSolve The Quadratic Equation\n");
		
		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------\n");
		
		System.out.println("\tEquation: \n");
		System.out.println("\t\t ax^2 + bx + c = 0\n");
		
		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------\n");
		
		System.out.println(" You must Enter the Values for the Variables a,b,c.\n");
		
		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------\n");
		
		
		System.out.println(" Enter any numbers for a,b,c (in format: a b c): ");
		double userInput1 = scan.nextDouble(); // first input for a
		a = userInput1;
		double userInput2 = scan.nextDouble(); // second input for b
		b = userInput2;
		double userInput3 = scan.nextDouble(); // third input for c
		c = userInput3;
		
		//------------------------------------------
		//------------------------------------------
		// finding r1,r2
		// r1 = (((-1)*(b))+discriminant)/((2)*(a))
		// r2 = (((-1)*(b))-discriminant)/((2)*(a))		
		// discriminant = (Math.pow(b, 2)-(((4)*a)*c))
		// double root = Math.pow(disdiscriminant, 0.5);
		
		
		double discriminant = (Math.pow(b, 2)-(((4)*a)*c));
		double root = Math.pow(discriminant, 0.5);
		r1 = (((-1)*b)+ root)/((2)*a);
		r2 = (((-1)*b)- root)/((2)*a);	
		
		if (discriminant > 0) {
			System.out.print("The equation has Two roots ");
			System.out.printf("r1 = %.6f, ",r1);
			System.out.printf("r2 = %.6f\n",r2);
		}else if (discriminant == 0) {
			System.out.print("The equation has One root ");
			System.out.printf("r1 = %.6f\n",r1);
		}else {
			System.out.println("The equation has no real roots ");
		};
	};
};