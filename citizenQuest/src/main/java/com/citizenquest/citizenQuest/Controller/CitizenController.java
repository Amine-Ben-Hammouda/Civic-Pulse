package com.citizenquest.citizenQuest.Controller;

import com.citizenquest.citizenQuest.Model.Citizen;
import com.citizenquest.citizenQuest.Repository.CitizenRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/citizens")
public class CitizenController {

    private final CitizenRepository repository;

    public CitizenController(CitizenRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Citizen> getAllCitizens(){
        return repository.findAll();
    }
    @PostMapping
    public Citizen createCitizens(@RequestBody Citizen citizen){
        return repository.save(citizen);
    }


}