import org.junit.jupiter.api.Test;

class MathRandomTest {

    @Test
    void kastSum() {

        int tern1;
        int tern2;

        int en = 0;
        int to = 0;
        int tre = 0;
        int fire = 0;
        int fem = 0;
        int seks = 0;
        int syv = 0;
        int otte = 0;
        int ni = 0;
        int ti = 0;
        int elleve = 0;
        int tolv = 0;

        int kast = 0;

        while (kast < 1000) {
            kast++;
            tern1 = (int) (Math.random() * 6 + 1);
            tern2 = (int) (Math.random() * 6 + 1);
            tsum = tern1 + tern2;

            if (tsum == 2) {
                to++;}

            if (tsum == 3) {
                tre++;}

            if (tsum == 4) {
                fire++;}

            if (tsum == 5) {
                fem++;}

            if (tsum == 6) {
                seks++;}

            if (tsum == 7) {
                syv++;}

            if (tsum == 8) {
                otte++;}

            if (tsum == 9) {
                ni++;}

            if (tsum == 10) {
                ti++;}

            if (tsum == 11) {
                elleve++;}

            if (tsum == 12) {
                tolv++;}
        }

        System.out.println("Efter 1000 kast var der sum på:");
        System.out.println("2 = " + to);
        System.out.println("3 = " + tre);
        System.out.println("4 = " + fire );
        System.out.println("5 = " + fem);
        System.out.println("6 = " + seks);
        System.out.println("7 = " + syv);
        System.out.println("8 = " + otte);
        System.out.println("9 = " + ni);
        System.out.println("10 = " + ti);
        System.out.println("11 = " + elleve);
        System.out.println("12 = " + tolv);


    }
}