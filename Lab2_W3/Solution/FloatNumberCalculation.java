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
public class FloatNumberCalculation {
    public static void main(String[] args) {
        float numberA;
        float numberB;

        // This is the good habit, when you want some response from user, you need to give some hints
        System.out.println("Enter two float number: ");

        Scanner keyboard = new Scanner(System.in);

        numberA = keyboard.nextFloat();
        numberB = keyboard.nextFloat();

        System.out.println(numberA + "+" + numberB + "=" + (numberA + numberB));
        System.out.println(numberA + "-" + numberB + "=" + (numberA - numberB));
        System.out.println(numberA + "x" + numberB + "=" + (numberA * numberB));
    }
}
