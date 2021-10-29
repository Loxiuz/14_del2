public class Konto {
    int pengeTotal;

    public boolean addPoint(int penge){
        int tjekBalance = pengeTotal + penge;

        if(tjekBalance<0){
            pengeTotal=0;
            return false;
        }
        else {
            pengeTotal += penge;
            return true;
        }
    }


}



