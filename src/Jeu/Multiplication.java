package Jeu;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Multiplication extends Jeu {


    private static int scoreM=0;
    private static int meilleurScoreM;
    private Jeu jeu1;
    Scanner sc = new Scanner(System.in);


    public static int getMeilleurScoreM() {
        return meilleurScoreM;
    }



    public static void setMeilleurScoreM(int meilleurScoreM) {
        Multiplication.meilleurScoreM = meilleurScoreM;
    }



    public static void multiplication1() {



        for(int i = 0;i<11;i++){
            Scanner sc = new Scanner(System.in);


            int num1 = (int) (Math.random() * 30);
            int num2 = (int) (Math.random() * 30);


            System.out.println( num1 + " x " + num2 + " =");


            try
            {
                System.out.println("Votre reponse: ");

                int res = sc.nextInt();
                boolean isCorrect = res == (num1 * num2);
                if (isCorrect == true) {

                    System.out.println("BONNE REPONSE");
                    scoreM++;


                } else  {
                    System.out.println("NON");

                }
            }
            catch(InputMismatchException exception)
            {

                System.out.println("Votre réponse ne sera pas être prise en compte");
            }

        }
        System.out.println("score eleve : "+scoreM);
        if (scoreM>meilleurScoreM) {

            System.out.println("NEW SCORE: "+scoreM);
            meilleurScoreM+=scoreM;
        }
        else {
            System.out.println("le meilleur score est toujour de: "+meilleurScoreM);
        }
    }

}
