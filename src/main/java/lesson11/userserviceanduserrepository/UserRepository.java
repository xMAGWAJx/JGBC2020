package lesson11.userserviceanduserrepository;

import java.util.HashMap;

public class UserRepository {

    HashMap<Integer, User> users = new HashMap<>();

    private static int userKeyValue = 0;

    public void save(User user) {
        Integer key = ++userKeyValue;
        user.setId(key);
        users.put(key, user);
    }
}
