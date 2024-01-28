package Labs.Barca;

import java.util.*;
import java.io.*;

public class Barca {
    
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        
        File file = new File("Barca/Barca.txt");
        
        Scanner in = new Scanner(file);
        
        StringBuilder finale = new StringBuilder();
        
        while(in.hasNext()){
            finale.append(in.nextLine());
        }
        
        System.out.print("Enter team: ");
        String team = input.next();
        
        boolean found = true;
        int awayWins = 0;
        int homeWins = 0;
        int goals;
        int conceded;
        int totalGoals = 0;
        int totalConceded = 0;
        int win = 0;
        int loss = 0;
        int draw = 0;
        int points = 0;
        
        String[] matches = finale.toString().split(",");

        for (String s : matches) {
            String[] match = s.split(" ");
            if (match[0].equalsIgnoreCase(team)) {
                goals = Integer.parseInt(match[1]);
                totalGoals += goals;
                conceded = Integer.parseInt(match[3]);
                totalConceded += conceded;
                if (goals > conceded) {
                    win++;
                    homeWins++;
                    points += 3;
                } else if (goals == conceded) {
                    draw++;
                    points++;
                } else loss++;

            } else if (match[2].equalsIgnoreCase(team)) {
                goals = Integer.parseInt(match[3]);
                totalGoals += goals;
                conceded = Integer.parseInt(match[1]);
                totalConceded += conceded;
                if (goals > conceded) {
                    win++;
                    awayWins++;
                    points += 3;
                } else if (goals == conceded) {
                    draw++;
                    points++;
                } else loss++;
            }


        }
        
        if (!found)
            System.out.println("Team entered not found! ");
        else{
            System.out.println("number of wins = " + win);
            System.out.println("number of draws = " + draw);
            System.out.println("number of defeats = " + loss);
            System.out.println("goals scored = " + totalGoals);
            System.out.println("goals conceded = " + totalConceded);
            System.out.println("number of points = " + points);
            System.out.println("home wins = " + homeWins);
            System.out.println("home win percentage = " + (double)(homeWins)/win*100);
            System.out.println("away wins = " + awayWins);
            System.out.println("away win percentage = " + (double)(awayWins)/win*100);
        }
        
        in.close();
        
    }
    
}
