public class Konto {
    int pengeTotal;

    int startPoint;


    public Konto(int pengetotal) {
        pengeTotal = pengetotal;
    }

    public Konto() {
        int startPoint = 1000;

    }

    void display() {
        System.out.println(pengeTotal);
    }

    public void nyTotal(int penge){
        pengeTotal += penge;
    }


     {

    }
}
