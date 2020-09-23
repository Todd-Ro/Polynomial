package com.company;

public class CubicCompressor {

    public static double[] compressCubic (int a, int b, int c, int d) {
        /*Takes in the cubic ax^3 + bx^2 + cx + d. Outputs the equivalent depressed cubic
        y^3 + yCoeff * y + constant, where y = x - yOffset.
         */

        double yOffset = (double) b/(3*a);
        double secondConstComponent = (double) (2*(Math.pow(b, 3))) / (27*(Math.pow(a, 2)));
        double thirdConstComponent = (double) (b*c)/(3*a);
        int yCubeCoeff = a;
        double yCoeff = c - ((Math.pow(b, 2)) / (3*a));
        double constant = d + secondConstComponent - thirdConstComponent;
        yCoeff = yCoeff / a;
        constant = constant / a;
        double[] ret = new double[] {yCoeff, constant, -yOffset};
        return ret;
    }

    public static double[] compressCubicPrinter (int a, int b, int c, int d) {
        double yOffset = (double) b/(3*a);
        System.out.println("y = x minus " + yOffset);
        double secondConstComponent = (double) (2*(Math.pow(b, 3))) / (27*(Math.pow(a, 2)));
        double thirdConstComponent = (double) (b*c)/(3*a);
        int yCubeCoeff = a;
        double yCoeff = c - ((Math.pow(b, 2)) / (3*a));
        System.out.println("y Coeff is currently " + yCoeff);
        System.out.println("Second component of the constant is" + secondConstComponent);
        System.out.println("Third component of the constant is " + thirdConstComponent);
        double constant = d + secondConstComponent - thirdConstComponent;
        System.out.println("Constant is currently" + constant);
        yCoeff = yCoeff / a;
        constant = constant / a;
        double[] ret = new double[] {yCoeff, constant, -yOffset};
        return ret;
    }



}
