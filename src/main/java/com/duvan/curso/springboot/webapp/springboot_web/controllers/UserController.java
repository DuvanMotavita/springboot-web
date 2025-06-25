package com.duvan.curso.springboot.webapp.springboot_web.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.duvan.curso.springboot.webapp.springboot_web.controllers.models.User;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
public class UserController {
    
    @GetMapping("/details")
    public String details(Model model) {
         User user = new User("Duvan", "Motavita",null);
         user.setEmail("duvanmotavita@gmail.com");
        model.addAttribute("title", "Hola Mundo Spring Boot");
        model.addAttribute("user", user);
        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model) {
        model.addAttribute("title", "Lista de Usuarios!");
        return "list";
    }
    @ModelAttribute("users")
    public List<User> usersModel(){
        return Arrays.asList(
            new User("pepa", "pig",null),
            new User("pepa", "Duvan","duvan@correo.com"),
            new User("Juan", "pig",null),
            new User("pepa", "sari","sari@correo.com"));
        }
    

}
