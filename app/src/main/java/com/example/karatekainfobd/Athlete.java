package com.example.karatekainfobd;

public class Athlete extends Karateka {

    private double height, weight, reach;
    private String kataEvent, kumiteEvent;
    private int wins, losses, draws;

    public Athlete(String name, String gender, short day, short month, short year, double height, double weight, double reach, String club, String team, String kataEvent, String kumiteEvent, int wins, int losses, int draws){

        super(name, gender, day, month, year, club, team);

        this.height=height;
        this.weight=weight;
        this.reach=reach;
        this.kataEvent=kataEvent;
        this.kumiteEvent=kumiteEvent;
        this.wins=wins;
        this.losses=losses;
        this.draws=draws;

    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public double getReach() {
        return reach;
    }

    public String getKataEvent(){ return kataEvent; }

    public String getKumiteEvent(){ return kumiteEvent; }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public int getDraws() {
        return draws;
    }

}