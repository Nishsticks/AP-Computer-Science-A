package src.Sports;

public class Baseball extends SportsTeam {
    int homeruns;
    int RBI;
    int errors;

    public Baseball(String name) {
        super(name);
        homeruns = 0;
        RBI = 0;
        errors = 0;
    }
    public Baseball(String names, int games, int won, int lost, int tie, int hr, int R, int err) {
        super(names, games, won, lost, tie);
        homeruns = hr;
        RBI = R;
        errors = err;
    }

    public double homeRunsPerGame() {
        return homeruns / super.getGames();
    }
    public double rbisPerGame() {
        return RBI / super.getGames();
    }
    public double errorsPerGame() {
        return errors / super.getGames();
    }

    public String toString() {
        return super.toString() + " " + homeruns + " homeruns " + RBI + " RBIs, " + errors + " errors. ";
    }
}
