import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final int MIN_POINT = 3000; //  Point for at vinde
        final int START_POINT = 1000; // Antal point når man starter

        Spiller spiller1 = new Spiller();
        spiller1.setStartPoint(START_POINT);

        Spiller spiller2 = new Spiller();
        spiller2.setStartPoint(START_POINT);

        Scanner scan = new Scanner(System.in);

        int i = 0, spillerNr = 0, saldo = 0;
        Felter braet;

        //Fortsættende løkke indtil en spiller får minimum point for sejr eller højere
        while (spiller1.getKonto().pengeTotal < MIN_POINT &&
                spiller2.getKonto().pengeTotal < MIN_POINT) {

           // System.out.print("Kast terninger (enter)"); scan.nextLine();
            System.out.println();

            //Skifter tur og spiller ud fra lige og ulige tal.
            if (i % 2 == 0) {  // Lige tal
                braet = new Felter(spiller1);
                spillerNr = 1;
                saldo = spiller1.getKonto().pengeTotal;
            } else {  // Ulige tal
                braet = new Felter(spiller2);
                spillerNr = 2;
                saldo = spiller2.getKonto().pengeTotal;
            }

            System.out.println(braet.feltNavn + " [" + braet.feltPoint + " point]");
            System.out.println("Spiller " + spillerNr + " slog_____" + braet.felt);
            System.out.println("Saldo_______________" + saldo + " Point");
            System.out.println();

            i++;
        }

        System.out.print("Spiller " + spillerNr + " vinder ");
        System.out.println("med " + saldo + " point!");
    }
}
