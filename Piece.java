/**  
 * Initialize a room with a maximum of 4 doors
 * @author Quillard Guillaume
 * @version 1.0 du 16/01/2024
**/

public class Piece {
	public static String[] tabDir = {"Nord", "Ouest", "Sud", "Est"};

	private String nom;
	private boolean[] ouvertures = new boolean[6];

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
		boolean[] tempo = new boolean[4];
		if(this.ouvertures[4])
		{
			for (int i = 0; i < tempo.length; i++)
			{
				tempo[i] = ouvertures[i];
			}

			return Convertion.tab2Entier(tempo);
		}

		if(this.ouvertures[5])
		{
			for (int i = 0; i < tempo.length; i++)
			{
				tempo[i] = ouvertures[i];
			}

			return Convertion.tab2Entier(tempo);
		}

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

	public void setOuverture(int valeur)
	{
		this.ouvertures = Convertion.entier2Tab(valeur, ouvertures.length);
	}

	public boolean getDepart()
	{
		return this.ouvertures[4];
	}

	public boolean getArrivee()
	{
		return this.ouvertures[5];
	}

	public String toString()
	{
		String chaine;
		chaine = "";

		if(this.getDepart())
		{
			chaine += "Il s'agit de la case de depart\n";
		}

		if(this.getArrivee())
		{
			chaine += "Il s'agit d'une case d'arrive\n";
		}

		if(getValOuvertures() < 10)
		{
			chaine += " " + getValOuvertures();
		}
		else
		{
			chaine += getValOuvertures();
		}

		chaine += " " + this.nom + "   ==> ";

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
			case 'O' -> indice = 1;
			case 'S' -> indice = 2;
			case 'E' -> indice = 3;
		}

		return indice;
	}

	public boolean equals(Piece piece)
	{
		if(this.nom == piece.nom && this.ouvertures == piece.ouvertures)
		{
			return true;
		}

		return false;
	}
}
