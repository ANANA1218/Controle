package Jeu;
import java.util.Scanner;


import Exception.PasDeNegative;
import principal.Eleve;



public class Jeu {

    public Soustraction soustraction1;
    public Multiplication Multiplication1;
    public  Addition choixCalcul;

    Scanner sc = new Scanner(System.in);

    private Eleve eleve1;
    private Eleve eleve2;
    private Eleve eleve3;

    public Jeu() {

        eleve1 = new Eleve();
        eleve2 = new Eleve();
        eleve3 = new Eleve();
    }


    public Eleve getEleve1() {
        return eleve1;
    }


    public void setEleve1(Eleve eleve1) {
        this.eleve1 = eleve1;
    }

    public Eleve getEleve2() {
        return eleve2;
    }

    public void setEleve2(Eleve eleve2) {
        this.eleve2 = eleve2;
    }

    public Eleve getEleve3() {
        return eleve3;
    }


    public void setEleve3(Eleve eleve3) {
        this.eleve3 = eleve3;
    }

    public void choixjeu() {




        System.out.println("veuillez entre votre nom");
        String getNom = sc.nextLine();
        System.out.println("bonjour "+getNom);


        System.out.println("Faite un choix:");
        System.out.println("[1] Soustraction");
        System.out.println("[2] Multiplication");
        System.out.println("[3] Addition");
        char choix = sc.next().charAt(0);


        switch(choix){
            case '1':


                try {
                    Soustraction.soustraction1();
                } catch (PasDeNegative e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

                break;
            case '2':

                Multiplication.multiplication1();
                break;
            case '3':

                Addition.choixCalcul();
                break;

            default:

                System.out.println("Choix Incorrect ");


                break;
        }



    }




}
