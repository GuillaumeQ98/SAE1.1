/**  
 * Initialize a room with a maximum of 4 doors
 * @author Quillard Guillaume
 * @version 1.0 du 16/01/2024
**/

public class Piece {
	public static String[] tabDir = {"Nord", "Ouest", "Sud", "Est"};

	private String nom;
	private boolean[] ouvertures = new boolean[4];

	public Piece(int valeur)
	{
		this(valeur, "");
	}

	public Piece(int valeur, String nom)
	{
		this.nom = nom;
		this.ouvertures = Convertion.entier2Tab(valeur, ouvertures.length);
	}

	public int getValOuvertures()
	{
		return Convertion.tab2Entier(this.ouvertures);
	}

	public boolean getOuverture(char dir)
	{
		boolean tempo;
		
		tempo = true;
		switch( dir )
		{
			case 'N' -> tempo = this.ouvertures[0];
			case 'O' -> tempo = this.ouvertures[1];
			case 'S' -> tempo = this.ouvertures[2];
			case 'E' -> tempo = this.ouvertures[3];
		}
		return tempo;
	}

	public String toString()
	{
		String chaine;
		chaine = "";

		if(getValOuvertures() < 10)
		{
			chaine += " " + getValOuvertures();
		}
		else
		{
			chaine += getValOuvertures();
		}

		chaine += this.nom + "   ==> ";

		chaine += "Nord(" + indiceDir('N') + ") :" + getOuverture('N');
		chaine += " Ouest(" + indiceDir('O') + ") :" + getOuverture('O');
		chaine += " Sud(" + indiceDir('S') + ") :" + getOuverture('S');
		chaine += " Est(" + indiceDir('E') + ") :" + getOuverture('E');

		return chaine;
	}

	public static int indiceDir(char dir)
	{
		int indice;

		indice = -1;

		switch( dir )
		{
			case 'N' -> indice = 0;
			case 'E' -> indice = 1;
			case 'S' -> indice = 2;
			case 'O' -> indice = 3;
		}

		return indice;
	}
}
