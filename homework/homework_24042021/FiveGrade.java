import java.util.Scanner;

public class FiveGrade {
    public static void main(String[] args) {
        System.out.println("\n");
        System.out.println("**********************************************Start Program**********************************************");
        System.out.println("\n");
        /* create variable */
        int numofstu = 5, numofscore = 3;
        String[] instuid = new String[numofstu];
        int[] sumscore = new int[numofstu];
        char[] grade = new char[numofstu];
        int[][] scorevalue = new int[numofstu][numofscore];
        /* Input call */
        Scanner value = new Scanner(System.in);
        /* Create Student ID */
        for (int stuid = 0; stuid < instuid.length; stuid++) {
            instuid[stuid] = " ";
        }
        /* create for value score */
        for (int stuid = 0; stuid < scorevalue.length; stuid++) {
            for (int score = 0; score < scorevalue[stuid].length; score++) {
                scorevalue[stuid][score] = -1;
            }
        }
        /* Input Info */
        for (int stuid = 0; stuid < scorevalue.length; stuid++) {
            /* Header Input ID */
            Printline.type2();
            Printline.type1();
            System.out.println("In put student No." + (stuid + 1) + " ID");
            Printline.type1();
            Printline.type2();
            System.out.print("\n");
            Printline.type1();
            /* New Line Input Student ID */
            System.out.print("\n");
            /* Input Student ID */
            System.out.print("Enter Student ID Student No." + (stuid + 1) + " : ");
            instuid[stuid] = value.next();
            System.out.print("\n");
            Printline.type1();
            System.out.print("\n");
            for (int score = 0; score < scorevalue[stuid].length; score++) {
                /* Accumulated marks during semester score */
                if (score <= 0) {
                    /* Header Input */
                    Printline.type2();
                    Printline.type1();
                    System.out.println("In put Student ID : " + instuid[stuid] + " Score");
                    Printline.type1();
                    Printline.type2();
                    System.out.print("\n");
                    Printline.type1();
                    do {
                        while (scorevalue[stuid][score] < 0) {
                            System.out.print("Enter Accumulated marks during semester score (Between 0-30)" + "\n"
                                    + "Student ID : " + instuid[stuid] + " : ");
                            scorevalue[stuid][score] = value.nextInt();
                            if (scorevalue[stuid][score] < 0) {
                                System.out.print("Enter Score > 0 " + "\n");
                                Printline.type1();
                            }
                        }
                    } while (scorevalue[stuid][score] < 0); /* stop */
                    do {
                        while (scorevalue[stuid][score] > 30) {
                            if (scorevalue[stuid][score] > 30) {
                                System.out.print("Enter Score < 30 " + "\n");
                            }
                            Printline.type1();
                            System.out.print("Enter Accumulated marks during semester score (Between 0-30) : ");
                            scorevalue[stuid][score] = value.nextInt();
                        }
                        while (scorevalue[stuid][score] < 0) {
                            if (scorevalue[stuid][score] < 0) {
                                System.out.print("Enter Score > 0 " + "\n");
                            }
                            Printline.type1();
                            System.out.print("Enter Accumulated marks during semester score (Between 0-30) : ");
                            scorevalue[stuid][score] = value.nextInt();
                        }
                    } while (scorevalue[stuid][score] > 30); /* stop */
                    Printline.type1();
                }
                /* Midterm score */
                else if (score <= 1) {
                    do {
                        while (scorevalue[stuid][score] < 0) {
                            System.out.print("Enter Midterm score (Between 0-30)" + "\n" + "Student ID : "
                                    + instuid[stuid] + " : ");
                            scorevalue[stuid][score] = value.nextInt();
                            if (scorevalue[stuid][score] < 0) {
                                System.out.print("Enter Score > 0 " + "\n");
                                Printline.type1();
                            }
                        }
                    } while (scorevalue[stuid][score] < 0); /* stop */
                    do {
                        while (scorevalue[stuid][score] > 30) {
                            if (scorevalue[stuid][score] > 30) {
                                System.out.print("Enter Score < 30 " + "\n");
                            }
                            Printline.type1();
                            System.out.print("Enter Midterm score (Between 0-30) : ");
                            scorevalue[stuid][score] = value.nextInt();
                        }
                        while (scorevalue[stuid][score] < 0) {
                            if (scorevalue[stuid][score] < 0) {
                                System.out.print("Enter Score > 0 " + "\n");
                            }
                            Printline.type1();
                            System.out.print("Enter Midterm score (Between 0-30) : ");
                            scorevalue[stuid][score] = value.nextInt();
                        }
                    } while (scorevalue[stuid][score] > 30); /* stop */
                    Printline.type1();
                }
                /* Final Score */
                else if (score <= 2) {
                    do {
                        while (scorevalue[stuid][score] < 0) {
                            System.out.print("Enter Final score (Between 0-40)" + "\n" + "Student ID : "
                                    + instuid[stuid] + " : ");
                            scorevalue[stuid][score] = value.nextInt();
                            if (scorevalue[stuid][score] < 0) {
                                System.out.print("Enter Score > 0 " + "\n");
                                Printline.type1();
                            }
                        }
                    } while (scorevalue[stuid][score] < 0); /* stop */
                    do {
                        while (scorevalue[stuid][score] > 40) {
                            if (scorevalue[stuid][score] > 40) {
                                System.out.print("Enter Score < 40 " + "\n");
                            }
                            Printline.type1();
                            System.out.print("Enter Final score (Between 0-40) : ");
                            scorevalue[stuid][score] = value.nextInt();
                        }
                        while (scorevalue[stuid][score] < 0) {
                            if (scorevalue[stuid][score] < 0) {
                                System.out.print("Enter Score > 0 " + "\n");
                            }
                            Printline.type1();
                            System.out.print("Enter Final score (Between 0-40) : ");
                            scorevalue[stuid][score] = value.nextInt();
                        }
                    } while (scorevalue[stuid][score] > 40); /* stop */
                    Printline.type1();
                    /* new line */
                    System.out.println("\n");
                }
                /* end input score */
            }
        }
        /* create for sumary all score */
        for (int score = 0; score < sumscore.length; score++) {
            sumscore[score] = 0;
        }
        /* calculate sumary all score */
        for (int stuid = 0; stuid < scorevalue.length; stuid++) {
            for (int score = 0; score < scorevalue[stuid].length; score++) {
                sumscore[stuid] = sumscore[stuid] + scorevalue[stuid][score];
            }
        }
        /* create for all student grade */
        for (char stuid = 0; stuid < sumscore.length; stuid++) {
            grade[stuid] = ' ';
        }
        /* calculate all student grade */
        for (char stuid = 0; stuid < sumscore.length; stuid++) {
            do {
                while (grade[stuid] == ' ') {
                    if (sumscore[stuid] > 79 && sumscore[stuid] <= 100) {
                        grade[stuid] = 'A';
                    } else if (sumscore[stuid] > 69 && sumscore[stuid] <= 79) {
                        grade[stuid] = 'B';
                    } else if (sumscore[stuid] > 59 && sumscore[stuid] <= 69) {
                        grade[stuid] = 'C';
                    } else if (sumscore[stuid] > 49 && sumscore[stuid] <= 59) {
                        grade[stuid] = 'D';
                    } else {
                        grade[stuid] = 'F';
                    }
                }
            } while (grade[stuid] == ' '); /* stop */
        }
        /* Header all student grade */
        Printline.type2();
        Printline.type1();
        System.out.println("Report All Student Grade");
        Printline.type1();
        Printline.type2();
        System.out.print("\n");
        /* test report all student grade */
        for (int stuid = 0; stuid < grade.length; stuid++) {
            Printline.type1();
            System.out.println("Student ID : " + instuid[stuid] + "\n" + "Grade " + " (Between A-F) : " + grade[stuid]);
            Printline.type1();
        }
        System.out.println("\n");
        System.out.println("***********************************************End Program***********************************************");
        System.out.println("\n");
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