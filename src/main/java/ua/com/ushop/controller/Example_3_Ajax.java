package ua.com.ushop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ua.com.ushop.entity.User;
import ua.com.ushop.service.UserService;

import java.util.List;

@RestController
public class Example_3_Ajax {
@Autowired
private UserService userService;
    @PostMapping("/saveUser")
    public User saveUser(@RequestBody  User user){
        System.out.println(user);
        userService.save(user);
        return user;
    }

    @GetMapping("/show")
    public List<User> show(){
        return userService.findAll();
    }
}
