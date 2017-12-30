package congjun.wang.simple.provider.user.controller;

import congjun.wang.simple.provider.user.entity.User;
import congjun.wang.simple.provider.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findUserById(@PathVariable Long id){
        User user = userRepository.findOne(id);
        return user;
    }
}
