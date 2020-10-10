public class UserService {
    public UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public long register(String userName, String password) {
        return userRepository.save(userName, password);
    }
}
