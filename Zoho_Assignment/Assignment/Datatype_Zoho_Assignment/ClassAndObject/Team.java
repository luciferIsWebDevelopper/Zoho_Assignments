// package Assignment.ClassAndObject;

import java.util.ArrayList;

public class Team {
    public String teamName;
    public String city;
    public String division;
    public ArrayList<Player> res = new ArrayList<>();
    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public ArrayList<Player> getRes() {
        return res;
    }

    public void setRes(ArrayList<Player> res) {
        this.res = res;
    }
    public void playGame() {
        System.out.println("The Team is Playing");
    }

    public void hireCoach() {
        System.out.println("The Coach has hired Successfully");
    }

    public void addPlayer(Player player) {
        res.add(player);
    }
}
