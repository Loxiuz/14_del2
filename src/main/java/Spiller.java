public class Spiller {


    Konto konto = new Konto();
// mangler Declaration of state/Properties.
// mangler en constructor " objekt"
int startPoint ;

    public void setStartPoint(int startPoint) {
        this.startPoint = startPoint;
        konto.addPoint(startPoint);
    }
    // Declaration of Actions " behavior"
    public Spiller()
    {   int setTotal;
        konto.addPoint(startPoint);
    }

    // Declaration of Actions.
    // Instance method.
    public void addToTotal(int points) {
        konto.addPoint(points);
    }

    public Konto getKonto() {
        return konto;
    }


}
