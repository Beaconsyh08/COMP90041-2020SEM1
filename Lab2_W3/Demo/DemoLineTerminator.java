import java.util.Scanner;

public class DemoLineTerminator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter your sentence:");

        int n = keyboard.nextInt();

    /*
       Deal with the junk "\n"
       The method nextInt reads the 2 but does not read the end-of-line character '\n'.
       So the first nextLine invocation reads the rest of the line that contains the 2
       There is nothing more on that line (except for '\n'), so nextLine returns the empty string.
       The second invocation of nextLine begins on the next line and reads "heads are better than".
    */
//        String junk = keyboard.nextLine();

        String s1 = keyboard.nextLine();
        String s2 = keyboard.nextLine();

        System.out.println("n = " + n);
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
//        System.out.println("junk = " + junk);
    }
}


