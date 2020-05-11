/*
  Description
  This is for Demonstration purpose
  If you have any confusion, please contact me
  yuhsong1@unimelb.edu.au
  yuhsong@student.unimelb.edu.au

  @author Yuhao Song
 */
import java.util.Arrays;

public class DemoArrayObject {
    public static void main(String[] args) {
        JavaTutorial[] tutorialArray = new JavaTutorial[5];
        tutorialArray[0] = new JavaTutorial(5,30,"haha");

        for (JavaTutorial each: tutorialArray) {
            each.setStudentNo(100);
        }

        for (int i =0; i < tutorialArray.length; i++) {
            tutorialArray[i].setStudentNo(12);
        }





//        // the initial value is null for class type
//        System.out.println(Arrays.toString(tutorialArray));
//
//        // NullPointerException
////        System.out.println(tutorialArray[0].studentNo);
//
//        // initial the JavaTutorial Object
//        tutorialArray[0] = new JavaTutorial(1, 20, "Yuhao");
//        tutorialArray[3] = new JavaTutorial(2,15,"Yuhao");
//        System.out.println(Arrays.toString(tutorialArray));
//        tutorialArray[0].displayMethod(1, "hi");
    }

    static class JavaTutorial {
        int tutorialNo;
        int studentNo;
        String tutorName;

        public JavaTutorial(int tutorialNo, int studentNo, String tutorName) {
            this.tutorialNo = tutorialNo;
            this.studentNo = studentNo;
            this.tutorName = tutorName;
        }

        public int getTutorialNo() {
            return tutorialNo;
        }

        public void setTutorialNo(int tutorialNo) {
            this.tutorialNo = tutorialNo;
        }

        public int getStudentNo() {
            return studentNo;
        }

        public void setStudentNo(int studentNo) {
            this.studentNo = studentNo;
        }

        public String getTutorName() {
            return tutorName;
        }

        public void setTutorName(String tutorName) {
            this.tutorName = tutorName;
        }

        @Override
        public String toString() {
            return "JavaTutorial{" +
                    "tutorialNo=" + tutorialNo +
                    ", studentNo=" + studentNo +
                    ", tutorName='" + tutorName + '\'' +
                    '}';
        }


        public String displayMethod(int n1, String t1) {
            System.out.println(n1);
            System.out.println(t1);
            return "hi";
        }
    }
}
