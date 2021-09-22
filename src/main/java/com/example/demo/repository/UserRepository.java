package com.example.demo.repository;

import com.example.demo.service.Authorities;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class UserRepository {
    public List<User> userRepository = Arrays.asList(new User("Sanya90", "90"));

    public List<Authorities> getUserAuthorities(String login, String password) {
        for (User user : userRepository) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                return Arrays.asList(Authorities.values());
            }
        }
        return new ArrayList<>();
    }
}
