package com.codeup;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @GetMapping("users/all")
    public String getAllUsers(){

        List<User> listOfUsers = new ArrayList<>();



        return "users";
    }

}
