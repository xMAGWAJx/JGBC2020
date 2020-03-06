package lesson4.userloginservice;

public class UserLoginService {

    public boolean login(User user, String password) {

        if (!user.isUserIsBlocked() && user.getPassword().equals(password)) {
            user.resetNumberOfAttempts();
            System.out.println("User " + user.getLogin() + " is logged in.");
        } else if (user.getNumberOfAttempts() > 1){
            user.decreaseAmountOfAttempts();
        } else {
            user.blockUser();
            thisUserIsBlocked(user);
        }
        return true;
    }

    private void thisUserIsBlocked(User user) {
        System.out.println("User " + user.getLogin() + " is blocked!");
    }
}