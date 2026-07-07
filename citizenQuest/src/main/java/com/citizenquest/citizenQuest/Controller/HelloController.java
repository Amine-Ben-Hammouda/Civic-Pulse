package com.citizenquest.citizenQuest.Controller;

import com.citizenquest.citizenQuest.Model.Citizen;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HelloController {

    @GetMapping ("/")
    public String Homepage(){
        return "Welcome to Civic-Pulse ";

    }
    @GetMapping ("/status")
    public String serverStatus(){
        return " the Server is Running. Quest system is running. ";

    }
   @GetMapping("/api/version")
    public String getVersion() {
        return "CitizenQuest v0.0.1";
    }
    


}
