package com.company;

public class QuadraticSolver {

    public static double[] solveQuadratic (int a, int b, int c) {
        double sol1 = (-b + Math.sqrt(b*b - 4*a*c)) / (2*a);
        double sol2 = (-b - Math.sqrt(b*b - 4*a*c)) / (2*a);
        return new double[]{sol1, sol2};
    }

    public static double[] printQuadratic (int a, int b, int c) {
        double[] oldret = solveQuadratic(a, b, c);
        System.out.println("the solution to " + a + "x^2 + " + b + "x + " + c
        + "is " + oldret[0] + " or " + oldret[1]);
        return oldret;
    }

    public static double[] solveQuadratic (double a, double b, double c) {
        double sol1 = (-b + Math.sqrt(b*b - 4*a*c)) / (2*a);
        double sol2 = (-b - Math.sqrt(b*b - 4*a*c)) / (2*a);
        return new double[]{sol1, sol2};
    }

    public static double[] printQuadratic (double a, double b, double c) {
        double[] oldret = solveQuadratic(a, b, c);
        System.out.println("By the quadratic formula, the roots of a quadratic with coefficients " +a+", "+b+", and "+c
                + " are " + oldret[0] + " and " + oldret[1]);
        return oldret;
    }
}
