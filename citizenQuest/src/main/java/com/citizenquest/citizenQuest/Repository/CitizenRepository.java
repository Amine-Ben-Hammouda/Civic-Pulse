package com.citizenquest.citizenQuest.Repository;

import com.citizenquest.citizenQuest.Model.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitizenRepository extends JpaRepository <Citizen, Long> {

}
