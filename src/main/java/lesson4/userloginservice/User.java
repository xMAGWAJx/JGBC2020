package lesson4.userloginservice;

public class User {

    private String login;
    private String password;
    private boolean userIsBlocked = false;
    private int numberOfAttempts = 3;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public boolean isUserIsBlocked() {
        return userIsBlocked;
    }

    public int getNumberOfAttempts() {
        return numberOfAttempts;
    }

    public void decreaseAmountOfAttempts() {
        this.numberOfAttempts--;
        System.out.println("Login attempts left: " + numberOfAttempts);
    }

    public void resetNumberOfAttempts() {
        this.numberOfAttempts = 3;
    }

    public void blockUser() {
        this.userIsBlocked = true;
    }
}