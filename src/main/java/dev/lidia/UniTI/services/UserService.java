package dev.lidia.UniTI.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import dev.lidia.UniTI.models.User;

@Service
public class UserService {

    public List<User> findAll() {

        List<User> users = new ArrayList<>();

        User Sara16 = new User(1L, "Sara16", "ps123");
        User marioD = new User(2L, "marioD", "ps234");
        User laia3 = new User(3L, "laia3", "ps345");
        User meritxell_m = new User(4L, "meritxell_m", "ps456");

        users.add(Sara16);
        users.add(marioD);
        users.add(laia3);
        users.add(meritxell_m);

        return users;
    }

}
