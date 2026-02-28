package com.citizenquest.citizenQuest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping ("/")
    public String Homepage(){
        return "Welcome to Civic-Pulse ";

    }
    @GetMapping ("/Status")
    public String serverStatus(){
        return " the Server is Running. Quest system is running. ";

    }


}
