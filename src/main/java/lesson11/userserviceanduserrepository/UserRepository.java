package lesson11.userserviceanduserrepository;

import java.util.HashMap;

public class UserRepository {

    private static int userKeyValue = 0;
    HashMap<Integer, User> users = new HashMap<>();

    public void save(User user) {
        Integer key = ++userKeyValue;
        user.setId(key);
        users.put(key, user);
    }
}
