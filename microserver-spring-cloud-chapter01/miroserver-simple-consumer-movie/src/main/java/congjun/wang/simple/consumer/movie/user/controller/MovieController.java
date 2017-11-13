package congjun.wang.simple.consumer.movie.user.controller;

import congjun.wang.simple.consumer.movie.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/user/{id}")
    public User findUserById(@PathVariable Long id){
        User user = restTemplate.getForObject("http://localhost:8000/"+id, User.class);
        return user;
    }

}
