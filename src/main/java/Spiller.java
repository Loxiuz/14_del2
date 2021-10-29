public class Spiller {


    public Konto konto = new Konto();

    int startPoint ;

    public void setStartPoint(int startPoint) {
        this.startPoint = startPoint;
        konto.addPoint(startPoint);
    }

    public Spiller(){konto.addPoint(startPoint);}

    public void addToTotal(int points) {
        konto.addPoint(points);
    }

    public Konto getKonto() {
        return konto;
    }

    public static int Kast(){
        return RafleBaeger.KastSum();
    }
}
