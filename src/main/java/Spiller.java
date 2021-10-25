public class Spiller {


    Konto konto = new Konto();
// mangler Declaration of state/Properties.
// mangler en constructor " objekt"
int startPoint ;

    public void setStartPoint(int startPoint) {
        this.startPoint = startPoint;

    }
    // Declaration of Actions " behavior"
    public Spiller(int startPoint)
    {   int setTotal;
        konto.nyTotal(startPoint);
    }

    // Declaration of Actions.
    // Instance method.
    public void addToTotal(int points) {
        konto.nyTotal(points);
    }

    public Konto getKonto() {
        return konto;
    }


}
