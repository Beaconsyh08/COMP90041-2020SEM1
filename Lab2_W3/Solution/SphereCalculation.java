/*
   The University of Melbourne
   School of Computing and Information Systems
   COMP90041 Programming and Software Development
*/

import java.util.Scanner;

/**
 * Description
 * This is not the official sample solution from the University
 * If you have any confusion, please contact me
 * yuhsong1@unimelb.edu.au
 * yuhsong@student.unimelb.edu.au
 *
 * @author Yuhao Song
 */
public class SphereCalculation {
    public static void main(String[] args) {
        double radius;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the radius: ");

        radius = keyboard.nextDouble();

        double volume = 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
        double surfaceArea = 4 * Math.PI * radius * radius;

        System.out.printf("Volume = " + "%.2f\n", volume);
        System.out.printf("Surface Area = " + "%.2f\n", surfaceArea);


        // if you have any confusion about the (4.0/3.0) and (4/3), please try the following code by yourself
        // What's more, the parentheses are important and could not ignored in some cases

//        System.out.println(Math.PI * Math.pow(radius, 3)*(4/3));
//        System.out.println(Math.PI * Math.pow(radius, 3)* 4/3);
//        System.out.println(4/3);
//        System.out.println(4.0/3.0);
//        System.out.println(4.0/3);
//        System.out.println(4/3.0);

    }
}
