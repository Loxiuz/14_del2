import java.util.Scanner;

public class terninger{

    public static int ToKastSum(){

        Scanner scan = new Scanner(System.in);

        System.out.print("Tryk 'enter' for at rulle terninger: ");
        scan.nextLine();

        int die1, die2, tsum;

        die1 = (int)(Math.random()*6+1);
        die2 = (int)(Math.random()*6+1);

        tsum = die1 + die2;

        System.out.println("Terning 1: " + die1);
        System.out.println("Terning 2: " + die2);
        System.out.println("Sum: " + tsum);
        System.out.println();

        return tsum;
    }
}
