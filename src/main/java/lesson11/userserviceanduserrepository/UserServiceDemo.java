package lesson11.userserviceanduserrepository;

public class UserServiceDemo {

    public static void main(String[] args) {

        UserService userService = new UserService();

        User testUser = new User("TestName", 100);
        User testUser2 = new User("TestName2", 12);

        userService.addUser(testUser);
        userService.addUser(testUser2);

        System.out.println(testUser);
        System.out.println(testUser2);



    }
}
