package Exception;

public class PasDeNegative  extends Exception{

    /**
     *
     */
    private static final long serialVersionUID = 1L;


    int valeur;

    public PasDeNegative(int val)
    {
        valeur = val;
    }

    public String toString()
    {
        return valeur + " pas de reponse negative";
    }



}
