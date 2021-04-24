public class FirstJava {
    public static void main(String args[]) {
        System.out.println("Hello CMRU");
        System.out.println("args[0] = " + args[0]);
        Printline.type2();
        System.out.println("args[1] = " + args[1]);
        Printline.type1();
    }
}

class Printline {
    public static void type1() {
        System.out.println("*************");
    }

    public static void type2() {
        System.out.println("#############");
    }
}