import java.util.Scanner;

public class testloop {

    public static void main(String[] args) {
        /* create variable */
        int price = -1;
        int sum = 0;
        int stam1 = 0;
        int stam3 = 0;
        /* Input call */
        Scanner value = new Scanner(System.in);
        /* Input */
        do {
            while (price != 0) {
                Printline.type1();
                System.out.print("Enter Price (0 is End Program ) : ");
                price = value.nextInt();
                sum = sum + price;
                if (price < 0) {
                    System.out.print("Enter Price > 0 " + "\n");
                    Printline.type1();
                }
                Printline.type1();
            }
        } while (price != 0); /* stop */
        /* test report */
        System.out.print("\n");
        Printline.type1();
        System.out.println("Sumation of Price : " + sum);
        Printline.type1();
        for (int x = 1; x <= sum; x++) {
            if (x % 40 == 0 && x % 60 == 0) {
                stam3 = stam3++;
            } else if (x % 40 == 0) {
                if (x % 60 != 0) {
                    stam3 = stam1++;
                }
            } else if (x % 60 == 0) {
                if (x % 40 != 0) {
                    stam3 = stam3++;
                }
            }
        }
        Printline.type2();
        System.out.println("Numbers Of Stam 1 Bath :" + stam1);
        System.out.println("Numbers Of Stam 3 Bath :" + stam3);
        Printline.type2();
    }
}

class Printline {
    public static void type1() {
        System.out.println("-----------------------------------------------------------------------------------");
    }

    public static void type2() {
        System.out.println("===================================================================================");
    }
}