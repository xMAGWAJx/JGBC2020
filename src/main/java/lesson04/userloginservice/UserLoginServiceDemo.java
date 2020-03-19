package lesson04.userloginservice;

public class UserLoginServiceDemo {

    public static void main(String[] args) {

        UserLoginService service = new UserLoginService();
        User userOne = new User("TEST_USER", "TEST_PASSWORD");

        service.login(userOne, "user-password-12345"); //Should return false
        service.login(userOne, "TEST_PASSWORD"); //Should return true

        System.out.println(userOne.isUserIsBlocked());

        service.login(userOne, "user-password-12345"); //Should return false
        service.login(userOne, "user-password-12345"); //Should return false
        service.login(userOne, "user-password-12345"); //Should return false
        service.login(userOne, "TEST_PASSWORD"); //Should return false

    }
}
