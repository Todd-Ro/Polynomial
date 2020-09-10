package com.company;

/* Thanks to Girolamo Cardano and Nicolo Fontana Tartaglia in the 1500s for the techniques regarding cubics
* found in this project.
* Thanks to http://www.sosmath.com/algebra/factor/fac11/fac11.html for helping to explain these techniques.*/

import java.util.Arrays;

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
		// y should still equal 2

		int newA = 2;
		int newB = -15;
		int C = 3;
		System.out.println(Arrays.toString(DepressedCubicSolver.depressedCubicRemainder(newA, newB, C)));
	}
}
