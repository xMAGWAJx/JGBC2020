package lesson8.forum;

public class Administrator extends Moderator {
  @Override
  public void writePost() {
    System.out.println("Administrator: Writing post");
  }

  public void blockUser() {
    System.out.println("Blocking user");
  }
}