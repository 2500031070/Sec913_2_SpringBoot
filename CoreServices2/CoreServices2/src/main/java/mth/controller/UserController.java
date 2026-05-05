package mth.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import mth.models.Users;
import mth.services.UsersService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UsersService US;

    @PostMapping("/signup")
    public Object signup(@RequestBody Users U) {
        return US.signup(U);
    }

    @PostMapping("/signin")
    public Object signin(@RequestBody Map<String, Object> data) {
        return US.signin(data);
    }

    @GetMapping("/todos")
    public Object getTodos() {
        RestTemplate rt = new RestTemplate();
        return rt.getForObject("https://dummyjson.com/todos", Object.class);
    }
}