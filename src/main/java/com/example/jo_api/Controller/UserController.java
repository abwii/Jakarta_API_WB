package com.example.jo_api.Controller;

import com.example.jo_api.Entity.User;
import com.example.jo_api.Repository.UserRepository;
import com.example.jo_api.Service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/create")
    public User createUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @GetMapping("/get/{id}")
    public User getUser(@PathVariable Long id){
        return userService.getUser(id);
    }

    @PutMapping("/update/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user){
        return userService.updateUser(id, user);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(Long id){
        return userService.deleteUser(id);
    }

    @GetMapping("/all")
    public List<User> getUsers(){
        return userService.getUsers();
    }

}
