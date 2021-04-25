public class SuperClass {
    /* Attribute */
    int x, y, z;

    /* Constructor Method */
    SuperClass() {
        this.x = -1;
        this.y = -2;
        this.z = -3;
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