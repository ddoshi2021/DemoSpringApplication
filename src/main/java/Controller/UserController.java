package Controller;

import entity.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public class UserController {

    @RequestMapping("/user")
    public User getUser(@RequestParam(value = "name", defaultValue = "Spring Boot", required = false) String name,
                            @RequestParam(value = "chapterCount", defaultValue = "2", required = false) String role
    ) {
        return new User(name, role );
    }

    @RequestMapping(method = RequestMethod.POST,value = "/insert/user")
    public String postUser(@RequestBody User user){
        return "Your name "+ user.getUserName() + " with " + user.getRole() + "User saved successfuly.";
    }
}
