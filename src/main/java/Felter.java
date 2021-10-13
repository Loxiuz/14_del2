public class Felter {


    public static int braet(){

        int point = 1000;

        while(point < 3000){

         int tsum = Terning.Die();

        //"Bræt" med egenskaber
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
