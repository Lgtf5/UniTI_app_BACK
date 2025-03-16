package dev.lidia.UniTI.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.lidia.UniTI.models.User;
import dev.lidia.UniTI.services.UserService;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping (path = "api/v1")
public class UserController {

    private UserService service;

    public UserController (UserService service) {
        this.service = service;
    }

    @GetMapping("/users")
    public List <User> index() { 

        return service.findAll();
        
        /* List<Users> users = new ArrayList<>();

        Service Sara16 = new User (1L, "Sara16", "ps123");
        Service marioD = new User (2L, "marioD", "ps234");
        Service laia3 = new User (3L, "laia3", "ps345");
        Service meritxell_m = new User (4L, "meritxell_m", "ps456");

        users.add (Sara16);
        users.add (marioD);
        users.add (laia3);
        users.add (meritxell_m);

        return users;
    } */
    }
    
}
