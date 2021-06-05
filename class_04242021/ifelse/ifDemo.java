public class ifDemo {

    public static void main(String[] args) {
        int num1 = 0;
        if (num1 > 0) {
            /* if (num1 <= 5) { */
            /* if can limit line with {} */
            /* System.out.println("num1 > 10"); */
            /* this line Sawaddee not in if clause */
            /* System.out.println("Sawaddee"); */
            System.out.println("num1 > 0");
        } else if (num1 < 0) {
            System.out.println("num1 < 0");
        } else {
            System.out.println("num1 = 0");
        }
        System.out.println("===End Program===");
    }
}