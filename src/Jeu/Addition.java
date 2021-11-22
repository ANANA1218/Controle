package Jeu;



import java.util.InputMismatchException;
import java.util.Scanner;


public class Addition {



    static Scanner sc = new Scanner(System.in);
    private static int scoreA=0;
    private static int meilleurScoreA=5;


    public static int getMeilleurScoreA() {
        return meilleurScoreA;
    }


    public static void setMeilleurScoreA(int meilleurScoreA) {
        Addition.meilleurScoreA = meilleurScoreA;
    }



    public static void choixCalcul(){
        System.out.println("Faite un choix:");
        System.out.println("[1] Calcul a  2 chiffre");
        System.out.println("[2] Calcul a  3 chiffre");
        System.out.println("[3] Calcul a  4 chiffre");
        char choix = sc.next().charAt(0);


        switch(choix){
            case '1':
                addition2();
                break;
            case '2':

                addition3();
                break;
            case '3':

                addition4();
                break;

            default:
                System.out.println("Choix incorrect");
                break;
        }



    }


    public static void addition2() {



        for(int i = 0;i<11;i++){
            Scanner sc = new Scanner(System.in);


            int num1 = (int) (Math.random() * 100);
            int num2 = (int) (Math.random() * 100);


            System.out.println( num1 + " + " + num2 + " =");

            try
            {
                System.out.println("Votre reponse : ");

                int res = sc.nextInt();
                boolean isCorrect = res == (num1 + num2);
                if (isCorrect == true) {

                    System.out.println("BONNE REPONSE");
                    scoreA++;


                } else  {
                    System.out.println("NON");

                }
            }
            catch(InputMismatchException exception)
            {

                System.out.println("Votre réponse ne sera pas être prise en compte");
            }


        }
        System.out.println("score eleve : "+scoreA);

        if (scoreA>meilleurScoreA) {

            System.out.println("NEW SCORE: "+scoreA);
            meilleurScoreA+=scoreA;
        }
        else {
            System.out.println("le meilleur score est toujour de: "+meilleurScoreA);
        }
    }



    public static void addition3() {


        for(int i = 0;i<11;i++){
            Scanner sc = new Scanner(System.in);


            int num1 = (int) (Math.random() * 1000);
            int num2 = (int) (Math.random() * 1000);

            System.out.println( num1 + " + " + num2 + " = ");


            try
            {
                System.out.println("Votre reponse : ");

                int res = sc.nextInt();
                boolean isCorrect = res == (num1 + num2);
                if (isCorrect == true) {

                    System.out.println("BONNE REPONSE");
                    scoreA++;


                } else  {
                    System.out.println("NON");

                }
            }
            catch(InputMismatchException exception)
            {

                System.out.println("Votre réponse ne sera pas être prise en compte");
            }



        }
        System.out.println("score eleve : "+scoreA);

        if (scoreA>meilleurScoreA) {

            System.out.println("NEW SCORE: "+scoreA);
            meilleurScoreA+=scoreA;
        }
        else {
            System.out.println("le meilleur score est toujour de: "+meilleurScoreA);
        }
    }
    public static void addition4() {


        for(int i = 0;i<11;i++){
            Scanner sc = new Scanner(System.in);


            int num1 = (int) (Math.random() * 10000);
            int num2 = (int) (Math.random() * 10000);



            System.out.println( num1 + " + " + num2 + " =");



            try
            {
                System.out.println("Votre reponse");

                int res = sc.nextInt();
                boolean isCorrect = res == (num1 + num2);
                if (isCorrect == true) {

                    System.out.println("BONNE REPONSE");
                    scoreA++;


                } else  {
                    System.out.println("NON");

                }
            }
            catch(InputMismatchException exception)
            {

                System.out.println("Votre réponse ne sera pas être prise en compte");
            }



        }
        System.out.println("score eleve : "+scoreA);

        if (scoreA>meilleurScoreA) {

            System.out.println("NEW SCORE: "+scoreA);
            meilleurScoreA+=scoreA;
        }
        else {
            System.out.println("le meilleur score est toujour de: "+meilleurScoreA);
        }
    }

}



