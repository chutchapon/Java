public class operator {
    public static void main(String[] args) {
        int a1 = 12, b1 = 7;
        System.out.println("a + b = " + (a1 + b1));
        System.out.println("a / b = " + (a1 / b1));
        System.out.println("a / b = " + (a1 / 7.0));
        System.out.println("a % b = " + (a1 % b1));
        System.out.println("3+5*2-7/6%4 = " + (3 + 5 * 2 - 7 / 6 % 4));
        System.out.println("3+5*2-7/(6%4) = " + (3 + 5 * 2 - 7 / (6 % 4)));
        Printline.type1();
        System.out.println("a == b = " + (a1 == b1));
        System.out.println("a > b = " + (a1 > b1));
        System.out.println("a <= b = " + (a1 <= b1));
        System.out.println("true & true = " + (true & true));
        System.out.println("true & false = " + (true & false));
        Printline.type2();
        System.out.println("(a > 10) & (a < 20) = " + ((a1 > 10) & (b1 < 20)));
        System.out.println((a1 > 10) + " & " + (b1 < 20) + " is " + ((a1 > 10) & (b1 < 20)));
        System.out.println("(a > 10) | (a < 20) = " + ((a1 > 10) | (b1 < 20)));
        System.out.println((a1 > 10) + " | " + (b1 < 20) + " is " + ((a1 > 10) | (b1 < 20)));
        Printline.type3();
        int a2 = 13, b2 = 8;
        System.out.println("Line 23 : " + ((a2 < 12) & (b2 == 8)));
        System.out.println("a is " + (a2) + " b is " + (b2));
        System.out.println("a is " + (a2 < 12) + " b is " + (b2 == 8));
        System.out.println("Line 25 : " + ((a2 < 12) && (b2 == 8)));
        System.out.println("a is " + (a2 < 12) + " b is " + (a2 == 8));
        Printline.type4();
        System.out.println("Line 28 : " + ((a2 < 12) & ((b2--) == 7)));
        System.out.println("a is " + (a2) + " b is " + (b2));
        System.out.println("a is " + (a2 < 12) + " b is " + ((b2) == 7));
        System.out.println("Line 32 : " + ((a2 < 12) && ((b2) == 7)));
        /* if use && before && is false java not calculate logic b2 */ 
        System.out.println("a is " + (a2) + " b is " + (b2));
        System.out.println("a is " + (a2 < 12) + " b is " + ((b2) == 7));
        Printline.type5();
    }
}

class Printline {
    public static void type1() {
        System.out.println("***************************************");
    }

    public static void type2() {
        System.out.println("#######################################");
    }

    public static void type3() {
        System.out.println("---------------------------------------");
    }

    public static void type4() {
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
    }
    public static void type5() {
        System.out.println("=======================================");
    }
}
