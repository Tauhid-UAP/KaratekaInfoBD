package com.example.karatekainfobd;

import java.sql.Date;

public class Karateka {

    private String name, gender;
    private short day, month, year;
    private String club, team;
    private Date dateOfBirth;

    public Karateka(String name, String gender, short day, short month, short year, String club, String team){

        this.name=name;
        this.gender=gender;
        this.day=day;
        this.month=month;
        this.year=year;
        this.club=club;
        this.team=team;

    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public short getDay() {
        return day;
    }

    public short getMonth() {
        return month;
    }

    public short getYear() {
        return year;
    }

    public String getClub() {
        return club;
    }

    public String getTeam() {
        return team;
    }

}
