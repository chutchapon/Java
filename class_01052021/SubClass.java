public class SubClass extends SuperClass {
    /* subclass cant call private method from superclass */
    public int getA() {
        // call get A from SuperClass and return value
        return super.getA() - 3;
    }
}
