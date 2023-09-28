public class Aufgabe13 {
    public static void main(String[] args) {

//        int age = 18;
//        boolean withAdult = true;
//        boolean VIP = true;
//
//        enterFestivalWhichBracelet(age, withAdult);
//        enterVip(age, withAdult, VIP);


/////////////////////////////////////////////////////////////////////////////////////////////////////
//Das ist der verbesserte Code ohne Methode(n)
//
        int age = 4;
        boolean withAdult = true;
        boolean VIP = true;
        String answer = "";
        String answer2= "";

        if (age < 4) {
            answer = "du darfst nicht eintreten";
        } else {
            if (age < 16 && withAdult) {
                answer = "du darfst eintreten, hast eine Begleitperson mit, dafür bekommst du ein ROTES Band";
            } else if (age == 16 || age == 17) {
                answer = "du darfst eintreten, keinen Alkohol trinken, dafür bekommst du ein GELBES Band";
            } else if (age > 17) {
                answer = "du darfst eintreten, Alkohol trinken, dafür bekommst du ein grünes Band";
            }
         //   System.out.println(answer);

            if ((age > 3 && withAdult && VIP) || (age > 15 && VIP)) {
                answer2 = "du bekommst ein GOLDENES Band dazu und darfst in den VIP-Bereich";
            } else {
                answer2 = "kein GOLDENES Band dazu und darfst nicht in den VIP-Bereich";
            }
            answer = answer + "\n"  +   answer2;
        }
        System.out.println(answer);

        // String myString = "Guten Tag ";
        // myString = myString + " Herr XYZ";
        // oder myString += "Herr XYZ";

///////////////////////////////////////////////////////////////////////////////////////////////
// Das ist der zu verbessernde Code
//
//        if (age >= 18) {
//            System.out.println("Grünes Band");
//            if (VIP == true) {
//                System.out.println("Goldenes Band dazu!");
//            } else {
//                System.out.println("Kein goldenes Band dazu!");
//            }
//        }
//        if (age >= 16 && age < 18) {
//            System.out.println("Gelbes Band");
//            if (VIP == true) {
//                System.out.println("Goldenes Band dazu!");
//            } else {
//                System.out.println("Kein goldenes Band dazu!");
//            }
//        }
//        if (age >= 4 && age < 16) {
//            if (withAdult == true) {
//                System.out.println("Rotes Band");
//                if (VIP == true) {
//                    System.out.println("Goldenes Band dazu!");
//                } else {
//                    System.out.println("Kein goldenes Band dazu!");
//                }
//            } else if (withAdult == false) {
//                System.out.println("Kein Zutritt");
//            }
//        }
//        if (age < 4) {
//            System.out.println("Kein Zutritt");
//        }

    }

    //////////////////////////////////////////////////////////////////////////////////
    //METHODEN

    static void enterFestivalWhichBracelet(int age, boolean withAdult) {
        String answer = "";

        if (age < 4) {
            answer = "du darfst nicht eintreten";
        } else if (age < 16 && withAdult) {
            answer = "du darfst eintreten, hast eine Begleitperson mit, dafür bekommst du ein ROTES Band";
        } else if (age == 16 || age == 17) {
            answer = "du darfst eintreten, keinen Alkohol trinken, dafür bekommst du ein GELBES Band";
        } else if (age > 17) {
            answer = "du darfst eintreten, Alkohol trinken, dafür bekommst du ein grünes Band";
        }
        System.out.println(answer);
    }

    static void enterVip(int age, boolean withAdult, boolean VIP) {
        String answer = "";
        if (age < 4) {
            System.out.println("");
        } else if ((age > 3 && withAdult && VIP) || (age > 15 && VIP)) {
            answer = "du bekommst ein GOLDENES Band dazu und darfst in den VIP-Bereich";
        } else {
            answer = "kein GOLDENES Band, kein Zutritt in den Vip-Bereich";
        }
        System.out.println(answer);
    }
}
