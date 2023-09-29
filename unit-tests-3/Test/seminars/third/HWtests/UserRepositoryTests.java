package seminars.third.HWtests;

import org.junit.jupiter.api.Test;
import seminars.third.tdd.User;
import seminars.third.tdd.UserRepository;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class UserRepositoryTests {
    @Test
    void testLogOutNonAdmin() {
        User andy = new User("Andy", "123", true);
        User bobby = new User("Bobby", "pass", false);
        andy.authenticate("Andy", "123");
        bobby.authenticate("Bobby", "pass");

        UserRepository repo = new UserRepository();

        repo.addUser(andy);
        repo.addUser(bobby);

        repo.logOutUsers();

        assertThat(andy.isAuthorized()).isTrue();
        assertThat(bobby.isAuthorized()).isFalse();
    }
}
