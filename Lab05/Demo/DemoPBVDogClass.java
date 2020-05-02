/**
 * Description
 * This is for Demonstration purpose
 * If you have any confusion, please contact me
 * yuhsong1@unimelb.edu.au
 * yuhsong@student.unimelb.edu.au
 *
 * @author Yuhao Song
 */
public class DemoPBVDogClass {
    private String name;

    public DemoPBVDogClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void foo(DemoPBVDogClass d) {
        System.out.println(d.getName().equals("Max")); // true
        // change d inside of foo() to point to a new Dog instance "Fifi"
        d = new DemoPBVDogClass("Fifi");
        System.out.println(d.getName().equals("Fifi")); // true
    }

    public static void foo2(DemoPBVDogClass d) {
        System.out.println(d.getName().equals("Max")); // true
        // this changes the name of d to be "Fifi"
        d.setName("Fifi");
    }

    public static void changeArray(int[] arr) {
        arr = new int[]{45, 67};
//        arr[0] = 99;
    }

    public static void main(String[] args) {
        DemoPBVDogClass aDog = new DemoPBVDogClass("Max");
        DemoPBVDogClass oldDog = aDog;

        // we pass the object to foo
        foo(aDog); // true & true
        // aDog variable is still pointing to the "Max" dog when foo(...) returns
        System.out.println(aDog.getName().equals("Max")); // true
        System.out.println(aDog.getName().equals("Fifi")); // false
        System.out.println(aDog == oldDog); // true // check for the memory address

//        ##################################################################
//          Feel free to comment out and try the following code and try to run it
//        ##################################################################
//        foo2(aDog); // true
//        // when foo(...) returns, the name of the dog has been changed to "Fifi"
//        System.out.println(aDog.getName().equals("Fifi")); // true
//        // but it is still the same dog:
//        System.out.println(aDog == oldDog); // true

//        // array example
//        int[] exampleArray = {3,8};
//        aDog.changeArray(exampleArray);
//        System.out.println(exampleArray[0]);
    }
}

