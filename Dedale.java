/*
 * Make a room with Piece
 * @author Quillard Guillaume
 * @version 1.0 du 16/01/2024
 */

public class Dedale
{
	private Piece[][] tabPiece;

	public Dedale ()
	{
		this.tabPiece = this.initPiece();
	}


	private Piece getPieceAdj ( int lig, int col, char dir )
	{
		Piece tempo = null;

		if(lig < 0 || lig >= tabPiece.length || col < 0 || col >= tabPiece.length)
		{
			return null;
		}

		if(tabPiece[lig][col].getOuverture(dir))
		{
			
			switch (dir) {
				case 'N' -> tempo = tabPiece[lig-1][col];
				case 'O' -> tempo = tabPiece[lig][col-1];
				case 'S' -> tempo = tabPiece[lig+1][col];
				case 'E' -> tempo = tabPiece[lig][col+1];
			}
		}

		return tempo;
	}

	public boolean estValide()
	{
		/* A compléter dans l'exercice 5 */

		return true;
	}

	public int   getNbLigne  () 
	{ 
		return tabPiece.length;
	}

	public int   getNbColonne() 
	{
		return tabPiece.length;
	}

	public Piece getPiece (int lig, int col)
	{
		return tabPiece[lig][col];
	}


	private Piece[][] initPiece()
	{
		Piece[][] dedale;

		dedale = new Piece[tabPiece.length][tabPiece.length];


		return dedale;
	}

}