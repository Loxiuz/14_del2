public class Felter{

    public String feltBeskrivelse;

    public int felt = Spiller.Kast();

    public Felter (Spiller spiller){

        //"Bræt" med egenskaber
            switch(felt){ // Terningernes sum der afgører placeringen på brættet
                case 2: spiller.konto.addPoint(250);
                    feltBeskrivelse = "\tTårn \t\t+250\n" +
                            "Du er havnet i et tårn med en masse værdifulde genstande! \n" +
                            "Ingen ville lægge mærke til at der manglede noget… \uD83D\uDE42 \n" +
                            "Du har tjent 250kr.";
                    break;

                case 3: spiller.konto.addPoint(-100);
                    feltBeskrivelse = "Krater \t\t-100\n" +
                            "WOOOOW du faldt ned i et krater!!!! \n" +
                            "Heldigvis er der nogen til at hjælpe dig op. \n" +
                            "Det krævede dog 100 kr at få sat dem igang.";
                    break;

                case 4: spiller.konto.addPoint(100);
                    feltBeskrivelse = "Templets Porte\t\t+100\n" +
                            "Et kæmpe palads er for øjnene af dig. \n" +
                            "Du står ved portene, men bliver ikke lukket ind. \n" +
                            "På vej væk derfra finder du dog 100kr!";
                    break;

                case 5: spiller.konto.addPoint(-20);
                    feltBeskrivelse = "Den Kolde Ørken\t \t-20\n" +
                            "Du er strandet i den kolde ørken. \n" +
                            "I desperation efter mad og drikke,\n" +
                            "slugte du en 20'er.";
                    break;

                case 6: spiller.konto.addPoint(180);
                    feltBeskrivelse = "Den Befæstede By\t\t+180 \n" +
                            "Du tog et job i den befæstede by og tjente 180.";
                    break;

                case 7:
                    feltBeskrivelse = "Kloster \t\t0\n" +
                            "Efter lang tids rejsen, er du kommet til et kloster. \n" +
                            "Munkene lukker dig ind og giver dig mad og ly for natten.";
                    break;

                case 8: spiller.addToTotal(-70);
                    feltBeskrivelse = "Den Sorte Hule \t\t-70";
                    break;

                case 9: spiller.konto.addPoint(60);
                    feltBeskrivelse = "Bjerghytterne\t\t+60";
                    break;

                case 10: spiller.konto.addPoint(-80);
                    feltBeskrivelse = "Varulv-Muren        -80\n" +
                            "Ved en lang og høj mur hører du hylen i det fjerne… \n" +
                            "DU ER HAVNET VED VAREULV-MUREN!!! \n" +
                            "I din hast væk falder du og mister 80 kr, \n" +
                            "men du får rejst dig og løber videre. \n" +
                            "Skynd dig at kaste igen!";
                    break;

                case 11: spiller.konto.addPoint(-50);
                    feltBeskrivelse = "Hullet\t\t-50\n" +
                            "Du kom til at kigge op mens du gik og nu faldt du ned i et hul… \n" +
                            "Du tabte en 50'er.";
                    break;

                case 12: spiller.konto.addPoint(650);
                    feltBeskrivelse = "Guldminen\t\t+650 \n" +
                            "JACKPOT! Du fandt en guldmine! \n" +
                            "Du fylder lommerne og en masse andet med guld\n" +
                            "og får det solgt for 650kr.";
                    break;
            }

     }


}
