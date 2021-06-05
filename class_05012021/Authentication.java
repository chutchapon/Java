// abstract public class Authentication {
//     private String userName;

//     public void setUserName(String userName) {
//         this.userName = userName;
//     }

//     public String getUserName() {
//         return this.userName;
//     }

//     abstract boolean login(String userName);
//     // abstract void login();
// }
public interface Authentication {
    abstract boolean login(String userName);

    abstract boolean logout();
}
