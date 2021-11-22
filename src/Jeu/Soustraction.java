package Jeu;

import java.util.InputMismatchException;
import java.util.Scanner;

import Exception.PasDeNegative;



public class Soustraction  {

    private static int scoreS=0;
    private static int meilleurScoreS;


    public static int getMeilleurScoreS() {
        return meilleurScoreS;
    }

    public static void setMeilleurScoreS(int meilleurScoreS) {
        Soustraction.meilleurScoreS = meilleurScoreS;
    }

    Scanner sc = new Scanner(System.in);



    public static void soustraction1() throws PasDeNegative{



        for(int i = 0;i<11;i++){
            Scanner sc = new Scanner(System.in);


            int num1 = (int) (Math.random() * 100);
            int num2 = (int) (Math.random() * 100);

            if (num1<num2){
                int cal = num1;
                num1 = num2;
                num2 = cal;
            }
            System.out.println( num1 + " - " + num2 + " =");

            try
            {
                System.out.println("Votre reponse:");

                int res = sc.nextInt();
                if (res < 0) throw new PasDeNegative(res);


                boolean isCorrect = res == (num1 - num2);
                if (isCorrect == true) {

                    System.out.println("BONNE REPONSE");
                    scoreS++;


                } else  {
                    System.out.println("NON");

                }
            }
            catch(InputMismatchException exception)
            {

                System.out.println("Votre réponse ne sera pas être prise en compte");
            }




        }
        System.out.println("score eleve : "+scoreS);

        if (scoreS>meilleurScoreS) {

            System.out.println("NEW SCORE: "+scoreS);
            meilleurScoreS+=scoreS;
        }
        else {
            System.out.println("le meilleur score est toujour de: "+meilleurScoreS);
        }

    }



}
