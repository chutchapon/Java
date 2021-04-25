import java.util.Scanner;

public class MainRun {

    public static void main(String[] args) {
        SuperClass obj1;
        /* create SuperClass */
        obj1 = new SuperClass();
        /* create Object Superclass */
        obj1.lineA();
        obj1.x = 10; /* obj1 Attribute x */
        obj1.y = 20; /* obj1 Attribute y */
        System.out.println("x+y = " + (obj1.x + obj1.y));
        /* can create and build */
        SuperClass obj2 = new SuperClass();
        obj2.lineA(); 
        obj2.x = 100; 
        obj2.y = 200; 
        obj2.z = obj2.x + obj2.y;
        System.out.println("obj2.x+obj2.y = " + obj2.z);
        System.out.println("obj1.x = " + obj1.x + " " + "obj2.x = " + obj2.x);
        System.out.println("obj2.z = " + obj2.z);
        System.out.println(obj1);
        /* test input */
        //  Scanner value = new Scanner(System.in);
        // obj2.price = -1;
        // obj2.sum = 0;
        // do {
        //     while (obj2.price != 0) {
        //         obj1.lineA();
        //         System.out.print("Enter price (0 is End Program ) : ");
        //         obj2.price = value.nextInt();
        //         obj2.sum = obj2.sum + obj2.price;
        //         if (obj2.price < 0) {
        //             System.out.print("Enter price > 0 " + "\n");
        //             obj1.lineA();
        //         }
        //         obj1.lineA();
        //     }
        // } while (obj2.price != 0); /* stop */
        //  System.out.println("sumation of price : " + obj2.sum); 
    }
}