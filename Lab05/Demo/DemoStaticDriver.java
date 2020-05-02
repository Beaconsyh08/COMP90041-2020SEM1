/**
 * Description
 * This is for Demonstration purpose
 * If you have any confusion, please contact me
 * yuhsong1@unimelb.edu.au
 * yuhsong@student.unimelb.edu.au
 *
 * @author Yuhao Song
 */
public class DemoStaticDriver {
    public static void main(String[] args) {
        // no object create

        System.out.println(DemoStatic.getCourseCode());
        DemoStatic.setCourseCode(90038);
        System.out.println(DemoStatic.getCourseCode());

        DemoStatic tutorial1 = new DemoStatic(1);
        DemoStatic tutorial2 = new DemoStatic(2);
        System.out.println(tutorial1.getTutorialNo());
        System.out.println(tutorial2.getTutorialNo());

    }
}
