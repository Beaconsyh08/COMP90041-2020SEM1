/*
  Description
  This is for Demonstration purpose
  If you have any confusion, please contact me
  yuhsong1@unimelb.edu.au
  yuhsong@student.unimelb.edu.au

  @author Yuhao Song
 */
package Inh;

public class DemoDriver {
    public static void main(String[] args) {
        DemoDog dog1 = new DemoDog();
        // different between this and super to access variables
//        dog1.tryVar();
        // overridden method invocation
//        dog1.sleep();
        System.out.println(dog1);
    }
}
