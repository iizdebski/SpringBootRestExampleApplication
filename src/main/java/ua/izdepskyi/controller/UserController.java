package ua.izdepskyi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ua.izdepskyi.entity.User;
import ua.izdepskyi.entity.request.AddUserRequest;
import ua.izdepskyi.repository.UserRepository;

import java.util.List;

@RestController
public class UserController {

    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<User> findAllUsers(){
        return userRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addUser(@RequestBody AddUserRequest addUserRequest){
       User user = new User();
       user.setName(addUserRequest.getName());
       user.setSurname(addUserRequest.getSurname());
       userRepository.save(user);
    }
}