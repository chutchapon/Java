public class type_values {
    public static void main(String[] args) {
        byte bt1 = 11;
        /*
         * maximum number is 127 mininmum number is -128 be careful 0 is + number 8bit
         * storage can't get more 256 values
         */
        System.out.println("bt1 = " + bt1);
        short sh = 1000;
        /*
         * storage 16bit values maximum number is 32767 can get bt1 in sh becuases short
         * > byte
         */
        System.out.println("sh = " + sh);
        byte bt2 = (byte) (1 + 2 + 3 + 4 + 10);
        /* sh can't input into bt2 because byte < short */
        /*
         * can force convert with () type of format ex.(byte) when force values will
         * error
         */
        /* force convert will use with calculation for not > than type value */
        System.out.println("bt2 = " + bt2);
        bt2 = (byte) (bt1 + 100);
        /* calculated and force convert to byte */
        /* values must not > type of values */
        /* when java calculated values storage by int type in memory */
        System.out.println("bt2 + value = " + bt2);
        /* when not fix values java will storage with int type is 32 bit values */
        int in1 = 100000;
        /* 32 bit values */
        System.out.println("in1 = " + in1);
        long ln1 = 10000000;
        /* L in last ex 100L storage in long type with 64 bit */
        /* 64 bit values */
        System.out.println("ln1 = " + ln1);
        Printline.type1();
        float fl1 = (float) (0.50);
        /*
         * when float type appeared java is storage in double type need force convert to
         * float
         */
        System.out.println("fl1 = " + fl1);
        float fl2 = 15.5f;
        /* 32 bit values same as force convert */
        System.out.println("fl2 = " + fl2);
        int in2 = (int) fl2;
        /* can't auto convert to int */
        /* when force convert to int after . cant show values */
        System.out.println("in2 = " + in2);
        double db1 = 10.999999999;
        /* 64 bit values */
        System.out.println("db = " + db1);
        char ch1 = '\u0041';
        /* char ch1 = 'a'; */
        /* 32 bit values */
        /* char use with single code ' ' if use " " java storage with string */
        System.out.println("ch1 = " + ch1);
        char ch2 = 54;
        /* 32 bit values */
        /*
         * can get number in char be careful because in today char storage in unicode
         * form
         */
        System.out.println("ch2 = " + ch2);
        Printline.type2();
        boolean bol1 = true;
        /* 1 bit values only 0 and 1 in word is true and false */
        System.out.println("bol1 = " + bol1);
        String str1 = "hello world";
        /* 64 bit values */
        /* test myself can print out hello world */
        System.out.println("str1 is " + str1);
    }
}

class Printline {
    public static void type1() {
        System.out.println("***************************************");
    }

    public static void type2() {
        System.out.println("#######################################");
    }
}