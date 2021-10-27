public class Felter{

    public String feltNavn;

    public int felt = Spiller.Kast();

    public Felter (Spiller spiller){


        //"Bræt" med egenskaber
            switch(felt){ // Terningernes sum der afgører placeringen på brættet
                case 2:
                    feltNavn = "-----Tårn";
                    spiller.addToTotal(250);
                    break;
                case 3:
                    feltNavn = "-----Krater";
                    spiller.addToTotal(-100);
                    break;
                case 4:
                    feltNavn = "-----Templets Porte";
                    spiller.addToTotal(100);
                    break;
                case 5:
                    feltNavn = "-----Den Kolde Ørken";
                    spiller.addToTotal(20);
                    break;
                case 6:
                    feltNavn = "-----Den Befæstede By";
                    spiller.addToTotal(180);
                    break;
                case 7:
                    feltNavn = "-----Kloster";
                    break;
                case 8:
                    feltNavn = "-----Den Sorte Hule";
                    spiller.addToTotal(70);
                    break;
                case 9:
                    feltNavn = "-----Bjerghytterne";
                    spiller.addToTotal(60);
                    break;
                case 10:
                    feltNavn = "-----Varulv-Muren";
                    spiller.addToTotal(80);
                    break;
                case 11:
                    feltNavn = "-----Hullet";
                    spiller.addToTotal(50);
                    break;
                case 12:
                    feltNavn = "-----Guldminen";
                    spiller.addToTotal(650);
                    break;
            }


     }


}
