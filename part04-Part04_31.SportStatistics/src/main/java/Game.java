/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alanchang
 */
public class Game {

    private final String homeTeam;
    private final String visitingTeam;
    private final int homePoints;
    private final int visitingPoints;

    public Game(String homeTeam, String visitingTeam, int homePoints, int visitingPoints) {
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.homePoints = homePoints;
        this.visitingPoints = visitingPoints;
    }

    public String getHomeTeam() {
        return this.homeTeam;
    }

    public String getVisitingTeam() {
        return this.visitingTeam;
    }

    public boolean containsTeam(String team) {
        return homeTeam.equals(team) || visitingTeam.equals(team);
    }

    public boolean isWinner(String team) {
        return (homeTeam.equals(team) && homePoints > visitingPoints || visitingTeam.equals(team) && visitingPoints > homePoints);
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %d, %d", this.homeTeam, this.visitingTeam, this.homePoints, this.visitingPoints);
    }
}
