package Runner;

import Service.UserDAOService;
import entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

/**
 *  User service runner
 */

public class UserDAOServiceRunner implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(UserDAOServiceRunner.class);

    @Autowired
    private UserDAOService userDAOService;

    @Override
    public void run(String... args) throws Exception {
        User adminUser = new User("AdminUser", "Admin");
        long userInsert = userDAOService.insert(adminUser);
        log.info("User is created" + userInsert);
    }
}
