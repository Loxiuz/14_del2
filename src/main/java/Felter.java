public class Felter{

    public String feltNavn, feltPoint;

    public int felt = Spiller.Kast();

    public Felter (Spiller spiller){


        //"Bræt" med egenskaber
            switch(felt){ // Terningernes sum der afgører placeringen på brættet
                case 2:
                    feltNavn = "-----Tårn";
                    spiller.addToTotal(250);
                    feltPoint = "250";
                    break;
                case 3:
                    feltNavn = "-----Krater";
                    spiller.addToTotal(-100);
                    feltPoint = "-100";
                    break;
                case 4:
                    feltNavn = "-----Templets Porte";
                    spiller.addToTotal(100);
                    feltPoint = "+100";
                    break;
                case 5:
                    feltNavn = "-----Den Kolde Ørken";
                    spiller.addToTotal(-20);
                    feltPoint = "-20";
                    break;
                case 6:
                    feltNavn = "-----Den Befæstede By";
                    spiller.addToTotal(180);
                    feltPoint = "+180";
                    break;
                case 7:
                    feltNavn = "-----Kloster";
                    feltPoint = "Ingen";
                    break;
                case 8:
                    feltNavn = "-----Den Sorte Hule";
                    spiller.addToTotal(-70);
                    feltPoint = "-70";
                    break;
                case 9:
                    feltNavn = "-----Bjerghytterne";
                    spiller.addToTotal(60);
                    feltPoint = "+60";
                    break;
                case 10:
                    feltNavn = "-----Varulv-Muren";
                    spiller.addToTotal(-80);
                    feltPoint = "-80";
                    break;
                case 11:
                    feltNavn = "-----Hullet";
                    spiller.addToTotal(-50);
                    feltPoint = "-50";
                    break;
                case 12:
                    feltNavn = "-----Guldminen";
                    spiller.addToTotal(650);
                    feltPoint = "+650";
                    break;
            }


     }


}
