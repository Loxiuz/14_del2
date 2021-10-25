//package com.company;

//This class models a DieCup
// written by peter J.
public class DieCup {
    private Die[] dice;   // Array of dice
    private int maxEyes;
    private final static int MAX_DICES = 100;

    // Maximum number of eyes up to now
    //Constructor for dieCup objects
    public DieCup(Die[] newDice) {
        if(newDice.length < 1) {
            System.out.println("There must be at least one die");
        }
        else {
            dice = new Die[MAX_DICES];
        }
    }
    //Obtain a new number of eyes for all dies
    public void newNum() { // this method was called roll(), but there is another method with
        for(Die die : dice) { // such a name. Therefore I had to change that.
            die.roll();
        }
        int eyes = getEyes();
        if(eyes > maxEyes) {
            maxEyes = eyes;
        }
    }
    //Return the sum of the number of eyes shown by all dies
    public int getEyes() {
        int eyes = 0;
        for(Die die : dice) {
            eyes = eyes + die.getEyes();
        }
        return eyes;
    }
    //Return the maximal number of eyes shown up to now
    public int getMaxEyes() {
        return maxEyes;
    }
    //Reset the maximal number of eyes shown up to now
    public void resetMaxEyes() {
        maxEyes = 0;
    }
}
