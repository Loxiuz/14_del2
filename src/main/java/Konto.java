public class Konto {
    int pengeTotal;

    void display() {
        System.out.println(pengeTotal);
    }

    public boolean addPoint(int penge){
        int tjekPenge = pengeTotal + penge;

        if(tjekPenge<0){
            pengeTotal=0;
            return false;
        }
        else {
            pengeTotal += penge;
            return true;
        }
    }


}



