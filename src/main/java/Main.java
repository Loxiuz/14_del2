public class Main {
    public static void main(String[] args){

        final int MAKS_POINT = 3000, START_POINT = 1000;

        Spiller spiller1 = new Spiller();
        spiller1.setStartPoint(START_POINT);

        Spiller spiller2 = new Spiller();
        spiller2.setStartPoint(START_POINT);

        //Fortsættende løkke indtil en spiller får maks antal point eller højere
        while(spiller1.getKonto().pengeTotal < MAKS_POINT &&
                spiller2.getKonto().pengeTotal < MAKS_POINT){

            Felter spiller1_braet = new Felter(spiller1);
            System.out.println("Spiller 1 slog-----> " + spiller1_braet.kast);
            System.out.println("Saldo--------------> " + spiller1.getKonto().pengeTotal + " Point");
            System.out.println();

            Felter spiller2_braet = new Felter(spiller2);
            System.out.println("Spiller 2 slog-----> " + spiller2_braet.kast);
            System.out.println("Saldo--------------> " + spiller2.getKonto().pengeTotal + " Point");
            System.out.println();
        }




    }
}
