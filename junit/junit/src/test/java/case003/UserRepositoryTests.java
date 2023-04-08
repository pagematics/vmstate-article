package case003;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class UserRepositoryTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testSaveUser() {
        User user = new User();
        user.setUsername("john");
        user.setEmail("john@example.com");
        userRepository.save(user);
        assertNotNull(user.getId());
    }

    @Test
    public void testFindAllUsers() {
        List<User> users = userRepository.findAll();
        assertEquals(0, users.size());
        User user = new User();
        user.setUsername("john");
        user.setEmail("john@example.com");
        userRepository.save(user);
        users = userRepository.findAll();
        assertEquals(1, users.size());
    }

}

