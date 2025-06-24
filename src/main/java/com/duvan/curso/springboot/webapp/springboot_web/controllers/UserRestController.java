package com.duvan.curso.springboot.webapp.springboot_web.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.duvan.curso.springboot.webapp.springboot_web.controllers.models.User;
import com.duvan.curso.springboot.webapp.springboot_web.controllers.models.dto.UserDto;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api")
public class UserRestController {
    
    @GetMapping("/details")
    public UserDto details(Model model) {
        UserDto userDto = new UserDto();
        User user = new User("Duvan", "Motavita",null);
        userDto.setUser(user);
        userDto.setTitle("Hola Mundo Spring Boot");
        // Map<String, Object> body = new HashMap<>();
        // body.put("title", "Hola Mundo Spring Boot");
        // body.put("user", user);
        return userDto;
    }
    @GetMapping("/list")    
    public List<User> list(){
        User user = new User("Duvan", "Motavita",null);
        User user2 = new User("Pepe", "Doe",null);
        User user3= new User("Sari", "Motavita",null);

        List<User> users = Arrays.asList(user,user2,user3);
        // List<User> users = new ArrayList<>();
        // users.add(user);
        // users.add(user2);
        // users.add(user3);

        return users;

    }


}
 