public class Piece {
    public static String[] tabDir = {"Nord", "Ouest", "Sud", "Est"};

    String nom;
    boolean ouvertures;

    public Piece(int Valeur)
    {
        
    }

    public Piece(int Valeur, String nom)
    {

    }

    public int getValOuvertures()
    {
        return 1;
    }

    public boolean getOuverture(char dir)
    {
        return true;
    }

    public String toString()
    {
        String chaine;
        chaine = "";

        return chaine;
    }

    public static int indiceDir(char dir)
    {
        return 1;
    }
}
