/*
   The University of Melbourne
   School of Computing and Information Systems
   COMP90041 Programming and Software Development
*/

/**
 * Description
 * This is not the official sample solution from the University
 * If you have any confusion, please contact me
 * yuhsong1@unimelb.edu.au
 * yuhsong@student.unimelb.edu.au
 *
 * @author Yuhao Song
 */
public class WageCalculator {
    public static void main(String[] args) {
        int hours = Integer.parseInt(args[0]);

//        String hourss = "5";
//        System.out.println(Integer.parseInt(hourss) == hours);

        double wages;

        if (hours < 40) {
            wages = hours * 8.25;
        } else {
            wages = 40 * 8.25 + (hours - 40) * 8.25 * 1.5;
        }

//        wages = hours > 40 ? 40 * 8.25 + (hours - 40) * 8.25 * 1.5 : hours * 8.25;

        System.out.println("Wages: " + wages);
    }
}
