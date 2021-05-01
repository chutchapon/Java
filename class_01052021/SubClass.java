public class SubClass extends SuperClass {
    // public class SubClass extends Authentication {
    // public class SubClass implements Authentication {
    /* subclass cant call private method from superclass */
    // public int getA() {
    // // call get A from SuperClass and return value
    // return super.getA() - 3;
    // }
    /* create body fot Authentication */
    // public boolean login(String userName) {
    // // public void login() {
    // setUserName(userName);
    // return true;
    // }
    /* abstract from Authentication */
    // public boolean login(String userName) {
    // return true;
    // }

    // public boolean logout() {
    // return true;
    // }
    public void exeptions() {
        try {
            System.out.println("result = " + (10 / 5));
        } catch (ArithmeticException ex) {
            System.out.println("Error !!" + ex.getMessage());
        } catch (Exception exc) {
            System.out.println("Error !! Contact admin");
        }
    }
}
