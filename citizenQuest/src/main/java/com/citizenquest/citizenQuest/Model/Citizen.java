package com.citizenquest.citizenQuest.Model;

public class Citizen {
    private String id ;
    private String Username;
    private String City;
    private int xp;
    private int level;

    public Citizen(String id, String username, String city, int xp, int level) {
        this.id = id;
        Username = username;
        City = city;
        this.xp = xp;
        this.level = level;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return Username;
    }

    public String getCity() {
        return City;
    }

    public int getXp() {
        return xp;
    }

    public int getLevel() {
        return level;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public void setCity(String city) {
        City = city;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
