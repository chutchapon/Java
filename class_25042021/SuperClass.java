public class SuperClass {
    /* Attribute */
    int x, y, z;
    /* default = 0 */

    /* Constructor Method */
    SuperClass() {
        this.x = -1;
        this.y = -2;
        this.z = -3;
    }

    /* Overload Method */
    SuperClass(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    SuperClass(int x) {
        this.x = x;
    }

    /* toString */
    public String toString() {
        return "this is SuperClass";
    }

    /* Method */
    void lineA() {
        /* Method Body */
        System.out.println("----------------------");
    }

    /* Overload Method */
    void lineA(char ch) {
        for (int i = 1; i <= 16; i++) {
            System.out.print(ch);
        }
        System.out.println();
    }

    int add() {
        return this.x + this.y;
    }

    void plus(int x) {
        System.out.println("input x = " + x);
        /* form x recent in method */
        System.out.println("input this.x = " + this.x);
        /* Attribute in class */
    }
}