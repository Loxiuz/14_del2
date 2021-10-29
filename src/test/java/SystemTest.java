import org.junit.jupiter.api.Test;


class SystemTest {

    Spiller testSpiller = new Spiller();
    int testSaldo;

    // Test af systemet og spillets gang
    @Test
    void main() {
        testSpiller.setStartPoint(1000);

        while(testSaldo < 3000) {
            Felter braet = new Felter(testSpiller);
            testSaldo = testSpiller.getKonto().pengeTotal;

            System.out.println("Spiller " + "slog_____" + braet.felt);
            System.out.println(braet.feltBeskrivelse);
            System.out.println("Saldo_______________" + testSaldo + " Point");
            System.out.println();


        }
        System.out.print("Spiller vinder med " + testSaldo + " point");

    }
}