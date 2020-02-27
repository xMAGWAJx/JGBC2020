package lesson4.userloginservice;

public class User {

  private String login;
  private String password;
  private boolean userIsBlocked;
  private int numberOfAttempts;

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

  public void setNumberOfAttempts(int numberOfAttempts) {
    this.numberOfAttempts = numberOfAttempts;
  }

  public User(String login, String password) {
    this.login = login;
    this.password = password;
    this.userIsBlocked = false;
    this.numberOfAttempts = 3;
  }

  public void resetNumberOfAttempts() {
    this.numberOfAttempts = 3;
  }

  public void blockUser() {
      this.userIsBlocked = true;
  }
}