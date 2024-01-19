/**  
 * Initialize a room with a maximum of 4 doors
 * @author Quillard Guillaume
 * @version 1.0 du 16/01/2024
**/

public class Piece {
	public static String[] tabDir = {"Nord", "Ouest", "Sud", "Est"};

	private String nom;
	private boolean[] ouvertures = new boolean[4];

	public Piece(int Valeur)
	{
		this(Valeur, "");
	}

	public Piece(int Valeur, String nom)
	{
		ouvertures = 
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
