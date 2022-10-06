package com.example.sProject.api;


import com.example.sProject.bussines.UserService;
import com.example.sProject.entities.User;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import java.util.List;
import java.util.Optional;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class userController {

    private final UserService userService;

    @GetMapping
    public ResponseEntity<Optional<User>> getUser(int id){
        return new ResponseEntity<>(this.userService.getUser(id),OK);
    }

    @GetMapping(value = "/getUserByName")
    public ResponseEntity<Optional<List<User>>> getUserByFirstname(String name){
        return new ResponseEntity<>(this.userService.getUserByFirstname(name),OK);
    }

    @PostMapping(value = "/add")
    public ResponseEntity<?> add(@RequestBody User user){
        return ResponseEntity.ok(this.userService.addUser(user));
    }



}
