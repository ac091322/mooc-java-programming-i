
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();

        ArrayList<Game> matches = readFromFile(file);
        System.out.println("Team:");
        String team = scan.nextLine();

        // ArrayList<Game> gamesOfATeam = new ArrayList<>();
        // for (Game match : matches) {
        // if (team.equals(match.getHomeTeam()) || team.equals(match.getVisitingTeam())) {
        // gamesOfATeam.add(match);
        // }
        // }
        // System.out.println(gamesOfATeam);
        // System.out.println("Games: " + gamesOfATeam.size());
        int games = 0;
        int wins = 0;
        int losses = 0;

        for (Game game : matches) {
            if (game.containsTeam(team)) {
                games += 1;

                if (game.isWinner(team)) {
                    wins += 1;
                } else {
                    losses += 1;
                }
            }
        }

        // for (Game game : gamesOfATeam) {
        // if (game.isWinner(team)) {
        // wins += 1;
        // }
        // }
        // System.out.println("Wins: " + wins);
        // use the number of games played - the number of wins to get the number of losses
        // System.out.println("Losses: " + (gamesOfATeam.size() - wins));
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

    public static ArrayList<Game> readFromFile(String file) {
        ArrayList<Game> matches = new ArrayList<>();

        try ( Scanner reader = new Scanner(Paths.get(file))) {

            while (reader.hasNextLine()) {
                String line = reader.nextLine();

                // check for empty lines in the file
                if (line.isEmpty()) {
                    continue;
                }

                String[] splitLine = line.split(",");

                String homeTeam = splitLine[0];
                String visitingTeam = splitLine[1];
                int homePoints = Integer.valueOf(splitLine[2]);
                int visitingPoints = Integer.valueOf(splitLine[3]);

                matches.add(new Game(homeTeam, visitingTeam, homePoints, visitingPoints));
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return matches;
    }
}
