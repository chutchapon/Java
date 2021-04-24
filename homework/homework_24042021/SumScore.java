import java.util.Scanner;

public class SumScore {

    public static void main(String[] args) {
        Printline.type1();
        int sum = 0, score1 = -1, score2 = -1, score3 = -1; /* start */
        Scanner score = new Scanner(System.in);
        for (int x = 0; x < 3; x++)
            /* Accumulated marks during semester score */
            if (x <= 0) {
                do {
                    while (score1 < 0) {
                        System.out.print("Enter Accumulated marks during semester score (Between 0-30) : ");
                        score1 = score.nextInt();
                        if (score1 < 0) {
                            System.out.print("Enter Score > 0 " + "\n");
                            Printline.type1();
                        }
                    }
                } while (score1 < 0); /* stop */
                do {
                    while (score1 > 30) {
                        if (score1 > 30) {
                            System.out.print("Enter Score < 30 " + "\n");
                        }
                        Printline.type1();
                        System.out.print("Enter Accumulated marks during semester score (Between 0-30) : ");
                        score1 = score.nextInt();
                    }
                    while (score1 < 0) {
                        if (score1 < 0) {
                            System.out.print("Enter Score > 0 " + "\n");
                        }
                        Printline.type1();
                        System.out.print("Enter Accumulated marks during semester score (Between 0-30) : ");
                        score1 = score.nextInt();
                    }
                } while (score1 > 30); /* stop */
                System.out.println("Accumulated marks during semester score : " + score1);
                Printline.type1();
            }
            /* Midterm score */
            else if (x <= 1) {
                do {
                    while (score2 < 0) {
                        System.out.print("Enter Midterm score (Between 0-30) : ");
                        score2 = score.nextInt();
                        if (score2 < 0) {
                            System.out.print("Enter Score > 0 " + "\n");
                            Printline.type1();
                        }
                    }
                } while (score2 < 0); /* stop */
                do {
                    while (score2 > 30) {
                        if (score2 > 30) {
                            System.out.print("Enter Score < 30 " + "\n");
                        }
                        Printline.type1();
                        System.out.print("Enter Midterm score (Between 0-30) : ");
                        score2 = score.nextInt();
                    }
                    while (score2 < 0) {
                        if (score2 < 0) {
                            System.out.print("Enter Score > 0 " + "\n");
                        }
                        Printline.type1();
                        System.out.print("Enter Midterm score (Between 0-30) : ");
                        score2 = score.nextInt();
                    }
                } while (score2 > 30); /* stop */
                System.out.println("Midterm score : " + score2);
                Printline.type1();
            }
            /* Final Score */
            else {
                do {
                    while (score3 < 0) {
                        System.out.print("Enter Final score (Between 0-40) : ");
                        score3 = score.nextInt();
                        if (score3 < 0) {
                            System.out.print("Enter Score > 0 " + "\n");
                            Printline.type1();
                        }
                    }
                } while (score3 < 0); /* stop */
                do {
                    while (score3 > 40) {
                        if (score3 > 40) {
                            System.out.print("Enter Score < 40 " + "\n");
                        }
                        Printline.type1();
                        System.out.print("Enter Final score (Between 0-40) : ");
                        score3 = score.nextInt();
                    }
                    while (score3 < 0) {
                        if (score3 < 0) {
                            System.out.print("Enter Score > 0 " + "\n");
                        }
                        Printline.type1();
                        System.out.print("Enter Final score (Between 0-40) : ");
                        score3 = score.nextInt();
                    }
                } while (score3 > 40); /* stop */
                System.out.println("Final score : " + score3);
                Printline.type1();
            }
        /* Sumary Score */
        sum = score1 + score2 + score3;
        System.out.println("Sumary score (Between 0-100): " + sum);
        Printline.type1();
    }
}

class Printline {
    public static void type1() {
        System.out.println("-----------------------------------------------------------------------------------");
    }
}