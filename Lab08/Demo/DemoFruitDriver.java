/*
  Description
  This is for Demonstration purpose
  If you have any confusion, please contact me
  yuhsong1@unimelb.edu.au
  yuhsong@student.unimelb.edu.au

  @author Yuhao Song
 */
class DemoFruit {
    public static void age() {
        System.out.println("Fruit");
    }

    public void desc() {
        System.out.println("Fruit");
    }
}

class DemoApple extends DemoFruit {
    // not overriding, method hiding here, there won’t be any run-time polymorphism.
    public static void age() {
        System.out.println("Apple");
    }

    public void desc() {
        System.out.println("Apple");
    }
}

public class DemoFruitDriver {
    public static void main(String[] args) {
        // DemoFruit
        // Compile             Run-time
        DemoFruit obj1 = new DemoFruit();
        // DemoApple
        DemoFruit obj2 = new DemoApple();
        DemoApple obj3 = new DemoApple();
        // dynamic binding
        obj1.desc();
        obj2.desc();
        obj3.desc();

        // static binding
        DemoFruit.age();
        DemoFruit.age();
        DemoApple.age();
    }
}