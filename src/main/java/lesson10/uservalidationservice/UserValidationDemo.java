package lesson10.uservalidationservice;

public class UserValidationDemo {

    public static void main(String[] args) {

        UserValidationService userValidationService = new UserValidationService();

        User testUser = new User("NameTest", "lastNameTest", 18);

        userValidationService.validate(testUser);
    }
}
