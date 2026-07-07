package com.citizenquest.citizenQuest.Model;

import java.time.LocalDate;

import jakarta.persistence.*;
@Entity
@Table (name = "Citizen")
public class Citizen {
    public Citizen(long l, String amineBenHammouda, String sousse, int i, int i1) {
    }

    @Id
    @Column (name = "Id")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id ;

    @Column (name = "first_name")
    private String firstName;

    @Column (name = "last_name")
    private String lastName;

    @Column (name = "user_name")
    private String userName;

    @Column (name = "email")
    private String email;

    @Column (name = "password_hash")
    private String passwordHash;

    @Column (name = "phone_number")
    private String phoneNumber;

    @Column (name = "city")
    private String city;

    @Column (name = "xp")
    private Integer xp;
    
    @Column (name = "level")
    private Integer level;

    @Column (name = "point_balance")
    private Integer pointsBalance ;

    @Column (name = "birth_date")
    private LocalDate dateOfBirth;

    public Citizen(Long id, String firstName, String lastName, String userName, String email, String passwordHash, String phoneNumber, String city, Integer xp, Integer level, Integer pointsBalance, LocalDate dateOfBirth) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
        this.passwordHash = passwordHash;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.xp = xp;
        this.level = level;
        this.pointsBalance = pointsBalance;
        this.dateOfBirth = dateOfBirth;
    }

    public Citizen() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getXp() {
        return xp;
    }

    public void setXp(Integer xp) {
        this.xp = xp;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getPointsBalance() {
        return pointsBalance;
    }

    public void setPointsBalance(Integer pointsBalance) {
        this.pointsBalance = pointsBalance;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
