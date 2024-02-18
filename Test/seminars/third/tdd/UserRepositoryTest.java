package seminars.third.tdd;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {

    @Test
    void deleteAllnotAdmin() {
        UserRepository u = new UserRepository();
        List list = new ArrayList<>();
        list.add(new User("user0", "ffdd"));
        u.setData(list);
        u.addUser(new User("user1", "123"));
        u.addUser(new User("user2", "455"));
        u.addUser(new User("user3", "fff"));
        u.addUser(new User("user4", "ghgh"));
        u.addUser(new User("user5", "ffdd"));
        u.getData().get(0).setAdmin();
        u.getData().get(1).setAdmin();

        u.logOutExceptAdministrator();

        assertThat(u.getData().size()).isEqualTo(4);
    }
}