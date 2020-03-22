package lesson11.userserviceanduserrepository;

public class UserService {

    private UserRepository userRepositoryDataBase;

    public UserService(UserRepository userRepositoryDataBase) {
        this.userRepositoryDataBase = userRepositoryDataBase;
    }

    public void addUser(User user) {
        userRepositoryDataBase.save(user);
    }
}
