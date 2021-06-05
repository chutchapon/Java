public class SuperClass {
    // attribute
    private int a;
    // private is modifier

    // setter getter method
    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        // return a;
        return add4ToA();
    }

    private int add4ToA() {
        return this.a + 3;
    }
}
