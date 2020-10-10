import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;

public class UserRepository {
    public HashMap<Long, User> users;

    public UserRepository() {
        users = new HashMap<>();
    }

    public long save(String userName, String password) {
        long userID = ThreadLocalRandom.current().nextLong();
        users.put(userID, new User(userName, password));
        return userID;
    }

    public User getUserById(long userId) {
        return users.get(userId);
    }
}
