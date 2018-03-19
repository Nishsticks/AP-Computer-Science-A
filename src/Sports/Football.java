package src.Sports;

public class Football extends SportsTeam{

    private int touchdowns;
    private int interceptions;

    public Football(String name)
    {
        super(name);
        touchdowns=0;
        interceptions=0;
    }

    public Football(String names, int games, int won, int lost, int tie, int td, int intercept)
    {
        super(names, games, won, lost, tie);
        touchdowns = td;
        interceptions = intercept;
    }

    public double touchDownsPerGame() {
        return touchdowns / super.getGames();
    }
    public double interceptionsPerGame() {
        return interceptions / super.getGames();
    }
    public String toString() {
        return super.toString() + " " + touchdowns + " touchdowns " + interceptions + " interceptions.";
    }



}
