public class SubClass extends SuperClass {
    int a ;
    void printA(int a){
        System.out.println("a = "+ a);
    }
    /* Override Method */
    void lineA() {
        System.out.println("######################");
    }
    void lineA(char ch, char sym) {
        for (int i = 1; i <= 16; i++) {
            System.out.print(ch);
            System.out.print(sym);
        }
        System.out.println();
    }
}
