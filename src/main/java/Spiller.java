public class Spiller {
    Konto konto = new Konto();

    public Spiller(int startPoint) {
        konto.setTotal(startPoint);
    }
    public void addToTotal(int points) {
        konto.nyTotal(points);
    }

    public Konto getKonto() {
        return konto;
    }
}
