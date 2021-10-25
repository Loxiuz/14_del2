import java.util.Scanner;

public class RafleBaeger {

    public static int KastSum(){

        Scanner scan = new Scanner(System.in);

        System.out.print("Tryk 'enter' for at rulle terninger: ");
        scan.nextLine();

        int tsum;

        Terning tern1 = new Terning();
        Terning tern2 = new Terning();

        tsum = tern1.eyes + tern2.eyes;

        System.out.println("Terning 1: " + tern1);
        System.out.println("Terning 2: " + tern2);
        System.out.println("Sum: " + tsum);
        System.out.println();

        return tsum;
    }
}
