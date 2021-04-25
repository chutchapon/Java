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
        System.out.println(obj1.x + " " + obj2.x);
    }
}
