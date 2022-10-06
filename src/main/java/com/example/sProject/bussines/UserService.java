package com.example.sProject.bussines;


import com.example.sProject.entities.User;
import com.example.sProject.repository.UserDao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {

    private final UserDao userDao;


    public Optional<User> getUser(int id){
        return this.userDao.findById(id);
    }

    public Optional<List<User>> getUserByFirstname(String name){
        return this.userDao.findByFirstname(name);
    }

    public User addUser(User user) {

        return this.userDao.save(user);
    }


}

