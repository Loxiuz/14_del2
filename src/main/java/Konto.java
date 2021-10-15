public class Konto {
    int pengeTotal;

    public Konto(int pengetotal) {
        pengeTotal = pengetotal;
    }

    void display() {
        System.out.println(pengeTotal);
    }

    public void nyTotal(int penge){
        pengeTotal += penge;
    }

}



