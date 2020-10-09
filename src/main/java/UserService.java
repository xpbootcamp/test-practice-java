public class UserService {
    public UserRepositry userRepositry;

    public UserService(UserRepositry userRepositry) {
        this.userRepositry = userRepositry;
    }

    public long register(String userName, String password) {
        return userRepositry.save(userName, password);
    }
}
