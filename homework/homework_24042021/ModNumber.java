import java.util.Scanner;

public class ModNumber {

    public static void main(String[] args) {
        /* create variable */
        /* Input call */
        Scanner value = new Scanner(System.in);
        /* Input */
        System.out.print("Enter Number :");
        int num = value.nextInt();
        /* test report */
        System.out.print("Factor of number " + num + " : ");
        for (int x = 1; x <= num; x++)
            if (num % x == 0) {
                System.out.print(x);
                if (x != num) {
                    System.out.print(", ");
                }
            }
    }
}