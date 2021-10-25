
import java.util.Random;
// This class models a die (dansk: Terning)
// Written by Peter J.
public class Die {
    private Random random;   // Used for generation of random numbers
    private int eyes;        // Number of eyes shown
    private int sides;       // Number of sides

    // Constructor for Die objects
    public Die(int noOfSides) {
        if(noOfSides < 2) {
            System.out.println("A die must have at least two sides");
        }
        else {
            sides = noOfSides;
            random = new Random();
            roll();
        }
    }
    //Obtain a new number of eyes for this die
    public void roll() {
        eyes = random.nextInt(sides) + 1;
    }

    // We are not interested in starting out with a die with 0 sides; that necessitates
    // That we add by one, to begin with.

    //Return the number of eyes shown by this die
    public int getEyes() {
        return eyes;
    }
}
