package br.com.pinotti.events.controller;

import br.com.pinotti.events.model.User;
import br.com.pinotti.events.service.IUserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private IUserService service;

    public UserController(IUserService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<User> addUser(@RequestBody User user) {

        return ResponseEntity
                .status(201)
                .body(service.addUser(user));
    }
}