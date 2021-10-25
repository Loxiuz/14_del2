public class Felter{


    public Felter(Spiller spiller){

        //"Bræt" med egenskaber
            switch(RafleBaeger.KastSum()){ // Terningernes sum der afgører placeringen på brættet
                case 2:
                    System.out.println("Tårn");
                    spiller.addToTotal(250);
                    break;
                case 3:
                    System.out.println("Krater");
                    spiller.addToTotal(-100);
                    break;
                case 4:
                    System.out.println("Templets Porte");
                    spiller.addToTotal(100);
                    break;
                case 5:
                    System.out.println("Den Kolde Ørken");
                   // point = point - 20;
                    break;
                case 6:
                    System.out.println("Den Befæstede By");
                  //  point = point + 180;
                    break;
                case 7:
                    System.out.println("Kloster");
                    break;
                case 8:
                    System.out.println("Den Sorte Hule");
                  //  point = point - 70;
                    break;
                case 9:
                    System.out.println("Bjerghytterne");
                  //  point = point + 60;
                    break;
                case 10:
                    System.out.println("Varulv-Muren");
                  //  point = point - 80;
                    break;
                case 11:
                    System.out.println("Hullet");
                 //   point = point - 50;
                    break;
                case 12:
                    System.out.println("Guldminen");
                 //   point = point + 650;
                    break;
            }


            System.out.println("Point: ");
            System.out.println();



    }


}
