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

            if (tern1 == 1) {
                en++;}

            if (tern1 == 2) {
                to++;}

            if (tern1 == 3) {
                tre++;}

            if (tern1 == 4) {
                fire++;}

            if (tern1 == 5) {
                fem++;}

            if (tern1 == 6) {
                seks++;}

            if (tern2 == 1) {
                syv++;}

            if (tern2 == 2) {
                otte++;}

            if (tern2 == 3) {
                ni++;}

            if (tern2 == 4) {
                ti++;}

            if (tern2 == 5) {
                elleve++;}

            if (tern2 == 6) {
                tolv++;}
        }

        System.out.println("Efter 1000 kast var der:");
        System.out.println(en + " enere");
        System.out.println(to + " toere");
        System.out.println(tre + " treere");
        System.out.println(fire + " firere");
        System.out.println(fem + " femmere");
        System.out.println(seks + " seksere");
        System.out.println(syv + " syvere");
        System.out.println(otte + " ottere");
        System.out.println(ni + " niere");
        System.out.println(ti + " tiere");
        System.out.println(elleve + " elvere");
        System.out.println(tolv + " tolvere");

    }
}