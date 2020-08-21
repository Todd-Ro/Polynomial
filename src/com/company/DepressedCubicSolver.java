package com.company;

public class DepressedCubicSolver {

    public static double[] solveDepressedCubic (int A, int B) {
        double[] ret = new double[]{0, 0, 0, 0, 0, 0, 0, 0};
        //ret[0] will have the actual solution
        int Acubed = A*A*A;
        ret[1] = (double)Acubed;
        int sqtTermQuadraTimesTwentySeven = 27*B*B - 4*-Acubed;
        ret[2] = (double) sqtTermQuadraTimesTwentySeven;
        double sqtTermQuadra = (double) sqtTermQuadraTimesTwentySeven / 27;
        double uRootPlus = (-B + Math.sqrt(sqtTermQuadra))/2;
        double uRootMinus = (-B - Math.sqrt(sqtTermQuadra))/2;
        boolean usedPlus = true;
        double higherRoot = uRootPlus;
        if (uRootMinus > higherRoot) {higherRoot = uRootMinus; usedPlus = false;}
        ret[3] = uRootPlus;
        ret[4] = uRootMinus;
        ret[5] = higherRoot;
        double t = Math.cbrt(higherRoot);
        ret[6] = t;
        double sCubed = higherRoot+B;
        ret[7] = sCubed;
        double s = Math.cbrt(sCubed);

        if (usedPlus) {
            System.out.println("t cubed is" +
                    "(-"+B+ " + sqrt( " + B*B + " + 4 * "+Acubed + "/27)) / 2");
            System.out.println("s cubed is t cubed plus "+B);
            System.out.println("The solution, y, is given by y = s - t");
        }
        else {
            System.out.println("t cubed is" +
                    "(-"+B+ " - sqrt( " + B*B + " + 4 * "+Acubed + "/27)) / 2");
            System.out.println("s cubed is t cubed plus "+B);
            System.out.println("The solution, y, is given by y = s - t");
        }

        ret[0] = s-t;
        return ret;
    }

    public static double printDepressedCubic (int A, int B) {
        System.out.println("We are solving y^3 + " + A + "y = " + B);
        System.out.println("We first want to find s and t such that 3st = " + A + " and s^3 - t^3 = " + B);
        System.out.println("s = " + A + "/(3t)");
        int Acubed = A*A*A;
        System.out.println(Acubed + "/(27*t^3) - t^3 = " + B);
        System.out.println("Multiplying both sides of the previous equation by t^3 and rearranging, ");
        System.out.println("t^6 + " + B + "t^3 - " + Acubed + "/27 = 0");
        System.out.println("Substituting u=t^3, this is a quadratic with coefficients 1, "+B+", and -"+Acubed+"/27");
        double[] uRoots = QuadraticSolver.printQuadratic(1, B, (double)-Acubed/27);
        double higherRoot = uRoots[0];
        if (uRoots[1] > uRoots[0]) {higherRoot = uRoots[1];}
        double t = Math.cbrt(higherRoot);
        System.out.println("Using the root where u="+higherRoot+", t = "+t);
        double sCubed = higherRoot+B;
        double s = Math.cbrt(sCubed);
        System.out.println("Since we are finding s such that s^3 - t^3 = "+B+", s^3 = ");
        System.out.println("So, s = "+s);

        double y;
        // y = Math.cbrt(10 + Math.sqrt(108)) - Math.cbrt(-10 + Math.sqrt(108)); //Sample answer
        y = s-t;
        System.out.println("So, our solution for y that makes y^3 + "+A+"y = "+B +" true is "+y);
        return y;
    }

}
