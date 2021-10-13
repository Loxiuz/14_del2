import java.util.Scanner;

public class Felter {


    public static int braet(){

        int die1, die2, tsum, point = 1000;

        Scanner scan = new Scanner(System.in);

        while(point < 3000){

            System.out.print("Tryk enter for at rulle: ");
            System.out.println();
            scan.nextLine();

            die1 = (int)(Math.random()*6+1);
            die2 = (int)(Math.random()*6+1);
            tsum = die1 + die2;

            System.out.println("Terning 1: " + die1);
            System.out.println("Terning 2: " + die2);
            System.out.println("Sum: " + tsum);
            System.out.println();

        //int sum = 2;
            switch (tsum){
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
                case 6:
                    System.out.println("Den Befæstede By");
                    point = point + 180;
                    break;
                case 7:
                    System.out.println("Kloster");
                    break;
                case 8:
                    System.out.println("Den Sorte Hule");
                    point = point - 70;
                    break;
                case 9:
                    System.out.println("Bjerghytterne");
                    point = point + 60;
                    break;
                case 10:
                    System.out.println("Varulv-Muren");
                    point = point - 80;
                    break;
                case 11:
                    System.out.println("Hullet");
                    point = point - 50;
                    break;
                case 12:
                    System.out.println("Guldminen");
                    point = point + 650;
                    break;
            }

            System.out.println("Point: " + point);
            System.out.println();

        }

        return point;
    }


}
