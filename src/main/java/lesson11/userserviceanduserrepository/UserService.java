package lesson11.userserviceanduserrepository;

public class UserService {

    UserRepository userRepositoryDataBase = new UserRepository();

    public void addUser (User user) {
        userRepositoryDataBase.save(user);
    }
}
