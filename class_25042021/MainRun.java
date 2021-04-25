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
    }
}
