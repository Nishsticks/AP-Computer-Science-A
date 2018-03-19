package src.Sports;

public class SportsTeam
{
    private String name;
    private int games;
    private int won;
    private int lost;
    private int ties;


    public SportsTeam(String Tname)
    {
        name = Tname;
        games=0;
        won=0;
        lost = 0;
        ties=0;
    }

    public SportsTeam(String Tname, int numGames, int gamesWon, int gamesLost, int gamesTied)
    {
        name = Tname;
        games = numGames;
        won = gamesWon;
        lost = gamesLost;
        ties = gamesTied;
    }

    public int getWinningPercentage() {
        return won / games * 100;
    }

    public String getName() {
        return name;
    }

    public int getGames() {
        return games;
    }

    public int getWon() {
        return won;
    }

    public int getLost() {
        return lost;
    }

    public int getTied() {
        return ties;
    }

    public void playGame(String str) {
        if (str.equals("W"))
        {
            won++;
        }
        if (str.equals("L"))
        {
            lost++;
        }
        else
            ties++;
    }

    public String toString() {
        return name + ": " + won + " won, " + lost + " lost, " + ties + " ties, ";
    }
}
