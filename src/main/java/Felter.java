public class Felter {


    public static int braet(){

        int die1, die2, tsum;
        die1 = (int)(Math.random()*6+1);
        die2 = (int)(Math.random()*6+1);

        int point = 1000;

        tsum = die1 + die2;

        System.out.println("Terning 1: " + die1);
        System.out.println("Terning 2: " + die2);
        System.out.println("Sum: " + tsum);

        //int sum = 2;
        switch (tsum) {
            case 2:
                System.out.println("Tårn");
                point = point + 250;
                break;
            case 3:
                System.out.println("Krater");
                point = point - 100;
                break;
            case 4:
                System.out.println("Templets Porte");
                point = point + 100;
                break;
            case 5:
                System.out.println("Den Kolde Ørken");
                point = point - 20;
                break;
        }


        return point;
    }


}
