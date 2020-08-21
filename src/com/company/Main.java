package com.company;

public class Main {

    public static void main(String[] args) {
		int A = 6;
		int B = 20;
		double y = DepressedCubicSolver.solveDepressedCubic(A, B)[0];
		y = Rounding.round(y, 15);
		System.out.println(" y = " + y);
		// y should equal 2

		System.out.println();
		y = DepressedCubicSolver.printDepressedCubic(A, B);
		y = Rounding.round(y, 15);
		System.out.println(" y = " + y);
	}
}
