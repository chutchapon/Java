import java.util.Scanner;

public class MainRun {

    public static void main(String[] args) {

        /* 10.00 AM - 12.00 AM */

        SuperClass obj1 = new SuperClass();
        SubClass obj2 = new SubClass();

        obj1.lineA();
        obj2.lineA();

        obj1.lineA('*');
        obj1.lineA('%');
        obj2.lineA('*', '$');

        System.out.println(obj1.x + " : " + obj2.x);
        obj2.printA(111);

        /* 9.00 AM - 10.00 AM */
        // SuperClass obj1;

        /* create SuperClass */

        // obj1 = new SuperClass();
        /* create Object Superclass */
        // obj1.lineA();
        // obj1.x = 10; /* obj1 Attribute x */
        // obj1.y = 20; /* obj1 Attribute y */
        // obj1.z = 0;
        // System.out.println("x+y = " + (obj1.x + obj1.y));

        /* can create and build */

        // SuperClass obj2 = new SuperClass();
        // obj2.lineA();
        // obj2.x = 100;
        // obj2.y = 200;
        // obj2.z = obj2.x + obj2.y;

        /* report */

        // System.out.println("obj2.x+obj2.y = " + obj2.z);
        // System.out.println("obj1.x = " + obj1.x + " " + "obj2.x = " + obj2.x);
        // System.out.println("obj2.z = " + obj2.z);
        // System.out.println(obj1);
        // System.out.println(obj1.add());
        // obj1.plus(5);

        /* test input and cal */

        // Scanner value = new Scanner(System.in);
        // System.out.print("Enter Number for x : ");
        // obj1.x = value.nextInt();
        // System.out.print("Enter Number for y : ");
        // obj1.y = value.nextInt();
        // obj1.lineA();
        // System.out.println(obj1.add());
    }
}