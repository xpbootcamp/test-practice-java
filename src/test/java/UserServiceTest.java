import org.junit.Assert;
import org.junit.Test;

public class UserServiceTest {
    @Test
    public void should_register_success_when_user_register_given_valid_username_and_password() {
        String userName = "lisa";
        String password = "lisa123";
        UserRepositry userRepositry = new UserRepositry();
        UserService userService = new UserService(userRepositry);

        long userId = userService.register(userName, password);

        Assert.assertEquals(userName, userRepositry.getUserById(userId).getUserName());
        Assert.assertEquals(password, userRepositry.getUserById(userId).getPassword());
    }
}
