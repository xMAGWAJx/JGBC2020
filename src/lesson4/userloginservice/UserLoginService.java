package lesson4.userloginservice;

public class UserLoginService {

  public static void main(String[] args) {

    UserLoginService service = new UserLoginService();
    User userOne = new User("user-login", "user-password");
​
    service.login(userOne, "user-password-12345"); //Should return false
    service.login(userOne, "user-password"); //Should return true
  }
}
