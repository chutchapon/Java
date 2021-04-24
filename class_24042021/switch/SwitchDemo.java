public class SwitchDemo {
    public static void main(String[] args) {
        /* int choice = 3; */
        char choice = 'z';
        switch (choice) {
        /* switch case can only compare = only */
        /* default can set in start case but end with break command */
        /* case 1: */
        case 'x':
        /* in case use only number cant use float */
            System.out.println("coffee");
            break;
        /* break for stop case */
        /* case 2: */
        case 'y':
            System.out.println("tea");
            System.out.println("donut ");
            break;
        /* case 3: */
        case 'z':
            System.out.println("milk");
            break;
        default:
            System.out.println("Unknow");
            /* default dont want every switch case */
        }
    }
}
