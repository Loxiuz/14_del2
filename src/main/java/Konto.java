public class Konto {
    int pengeTotal;

    void display() {
        System.out.println(pengeTotal);
    }

    public void addPoint(int penge){
        pengeTotal += penge;
        if(pengeTotal<0){
            pengeTotal=0;
        }
    }


}



