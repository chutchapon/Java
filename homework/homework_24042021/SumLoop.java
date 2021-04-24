import java.util.Scanner;

public class SumLoop {
    public static void main(String[] args) {
        /* create variable */
        int num = -1;
        int sum = 0;
        /* Input call */
        Scanner value = new Scanner(System.in);
        /* Input */
        do {
            while (num != 0) {
                System.out.print("Enter Number (Between 1-100, 0 is End Program ) : ");
                num = value.nextInt();
                sum = sum + num;
                if (num < 0) {
                    System.out.print("Enter Score > 0 " + "\n");
                    Printline.type1();
                }
            }
        } while (num != 0); /* stop */
        /* test report */
        System.out.println("Sumation of number : " + sum);
    }
}
