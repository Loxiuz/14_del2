public class Felter{


    int kast = RafleBaeger.KastSum();

    public Felter(Spiller spiller){

        //"Bræt" med egenskaber
            switch(kast){ // Terningernes sum der afgører placeringen på brættet
                case 2:
                    System.out.println("-----Tårn");
                    spiller.addToTotal(250);
                    break;
                case 3:
                    System.out.println("-----Krater");
                    spiller.addToTotal(-100);
                    break;
                case 4:
                    System.out.println("-----Templets Porte");
                    spiller.addToTotal(100);
                    break;
                case 5:
                    System.out.println("-----Den Kolde Ørken");
                    spiller.addToTotal(20);
                    break;
                case 6:
                    System.out.println("-----Den Befæstede By");
                    spiller.addToTotal(180);
                    break;
                case 7:
                    System.out.println("-----Kloster");
                    break;
                case 8:
                    System.out.println("-----Den Sorte Hule");
                    spiller.addToTotal(70);
                    break;
                case 9:
                    System.out.println("-----Bjerghytterne");
                    spiller.addToTotal(60);
                    break;
                case 10:
                    System.out.println("-----Varulv-Muren");
                    spiller.addToTotal(80);
                    break;
                case 11:
                    System.out.println("-----Hullet");
                    spiller.addToTotal(50);
                    break;
                case 12:
                    System.out.println("-----Guldminen");
                    spiller.addToTotal(650);
                    break;
            }



    }


}
