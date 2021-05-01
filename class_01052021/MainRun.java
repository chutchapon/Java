public class MainRun {
    public static void main(String[] args) {
        // call and create object in SuperClass
        SuperClass obj1 = new SuperClass();
        obj1.setA(10);
        System.out.println("a = " + obj1.getA());
        // /* call and create object in subclass */
        // SubClass obj2 = new SuperCLass();
        // obj2.a = 10;
        // System.out.println("a = " + obj2.a);
        SubClass obj2 = new SubClass();
        obj2.setA(20);
        System.out.println("a = " + obj2.getA());
    }
}
