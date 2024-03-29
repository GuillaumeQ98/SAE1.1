/*
 * Make a room with Piece
 * @author Quillard Guillaume
 * @version 1.0 du 16/01/2024
 */


public class Dedale
{
	private Piece[][] tabPiece;
	private Piece pieceHeros;
	private int posLig;
	private int posCol;
	private char direction;

	private int posLigDepart, posColDepart;
	private int posLigArrivee, posColArrive;

	public Dedale ()
	{
		tabPiece = new Piece[5][5];
		this.tabPiece = this.initPiece();
		pieceHeros = new Piece(1,"Hero");
		this.posLig = 1;
		this.posCol = 1;
		this.tabPiece[posLig][posCol] = pieceHeros;
		this.direction = 'S';

		this.posColArrive = this.posColDepart = this.posLigArrivee = this.posLigDepart = -1;
	}


	private Piece getPieceAdj ( int lig, int col, char dir )
	{
		Piece tempo = null;

		if(lig < 0 || lig > tabPiece.length || col < 0 || col > tabPiece.length)
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

	public String validite()
	{
		String  valide;
		char    orient, orientAdj, tempo;
		char[] pbOrient = new char[4];
		boolean noPbOrient;

		valide = "";
		orient = 'N';
		orientAdj = 'S';
		pbOrient[0] = 'a';
		noPbOrient = true;

		for(int i = 0; i < this.tabPiece.length; i++)
		{
			pbOrient[0] = 'a';
			pbOrient[1] = 'a';
			pbOrient[2] = 'a';
			pbOrient[3] = 'a';

			for(int j = 0; j < this.tabPiece.length; j++)
			{
				orient = 'N';

				if(getPiece(i,j).getOuverture(orient))
				{
					orientAdj = 'S';

					if(getPieceAdj(i, j, orient).getOuverture(orientAdj))
					{
						noPbOrient = true;
					}
					else
					{
						noPbOrient = false;
						pbOrient[0] = 'N';
					}
				}

				orient = 'O';

				if(getPiece(i,j).getOuverture(orient))
				{
					orientAdj = 'E';

					if(getPieceAdj(i, j, orient).getOuverture(orientAdj))
					{
						noPbOrient = true;
					}
					else
					{
						noPbOrient = false;
						pbOrient[1] = 'O';
					}
				}

				orient = 'S';

				if(getPiece(i,j).getOuverture(orient))
				{
					orientAdj = 'N';

					if(getPieceAdj(i, j, orient).getOuverture(orientAdj))
					{
						noPbOrient = true;
					}
					else
					{
						noPbOrient = false;
						pbOrient[2] = 'S';
					}
				}

				orient = 'E';

				if(getPiece(i,j).getOuverture(orient))
				{
					orientAdj = 'O';

					if(getPieceAdj(i, j, orient).getOuverture(orientAdj))
					{
						noPbOrient = true;
					}
					else
					{
						noPbOrient = false;
						pbOrient[3] = 'E';
					}
				}

				valide += "Piece[" + i + "]" + "[" + j + "]  " + getPiece(i, j).getValOuvertures();
			
				if(noPbOrient)
				{
					valide += "   OK\n"; 
				}
				else
				{
					valide += "\n		pb avec piece situee au ";
				
					for(int k = 0; k < pbOrient.length; k++)
					{
						tempo = pbOrient[k];

						switch (tempo)
						{
							case 'N' -> valide += "Nord";
							case 'O' -> valide += "Ouest";
							case 'S' -> valide += "Sud";
							case 'E' -> valide += "Est";
						}
					}

					valide += "\n";
				}	
			}
			
			
		}
		

		return valide;
	}

	public int   getNbLigne  () 
	{ 
		return tabPiece.length;
	}

	public int   getNbColonne() 
	{
		return tabPiece[0].length;
	}

	public Piece getPiece (int lig, int col)
	{
		return tabPiece[lig][col];
	}

	public char getSymboleHero(int lig, int col)
	{
		if(this.getPiece(lig, col).equals(pieceHeros)) return 's';

		return ' ';
	}

	private Piece[][] initPiece()
	{
		Piece[][] dedale;
		int[][]   tabNumPiece = {{0, 12, 14, 6, 0}, {0, 1+16, 5, 1, 0}, {8, 10, 15, 10, 2}, {0, 32+4, 5, 4, 0}, {0, 9, 11, 3, 0}};

		char nom = 'A';

		dedale = new Piece[tabPiece.length][tabPiece.length];

		for(int i = 0; i < dedale.length; i++)
		{
			//System.out.println("i" +i);
			for(int j = 0; j < dedale.length; j++)
			{
				//System.out.println("j" +j);
				dedale[i][j] = new Piece(tabNumPiece[i][j], nom + "");
				nom++;

				
			}
		}

		
		

		return dedale;
	}

	private Position recherchePosition(Piece p)
	{
		Position pos = new Position(0, 0);
		for (int i = 0; i < tabPiece.length; i++)
		{
			for(int j = 0; j < tabPiece[0].length; j++)
			{
				if(p.equals(pieceHeros))
				{
					pos.setLig(i);
					pos.setCol(j);
					
					return pos;
				}
			}	
		}
		
		return new Position(-1, -1);
	}

	public boolean Deplacer(char orient)
	{

		boolean deplacer = false;

		

		if(pieceHeros.getOuverture(orient) && orient == this.direction)
		{
			switch (orient)
			{
				case 'N' -> this.posLig--;
				case 'O' -> this.posCol--;
				case 'S' -> this.posLig++;
				case 'E' -> this.posCol++;
			}

			this.pieceHeros.setOuverture(tabPiece[posLig][posCol].getValOuvertures());
			this.tabPiece = initPiece();
			this.tabPiece[posLig][posCol] = pieceHeros;

			//if(posLig == 1 && posCol == 1) pieceHeros = new Piece(17, "Hero");

			//if(posLig == 3 && posCol == 1) pieceHeros = new Piece(36, "Hero");
		
			deplacer = true;

		}

		this.direction = orient;

		return deplacer;
	}

	public char getSymbole (int lig, int col )
	{
		if ( this.tabPiece[lig][col].getDepart () ) return 'D';
		if ( this.tabPiece[lig][col].getArrivee() ) return 'A';

		return ' ';
	}

	public char getDirection()
	{
		return this.direction;
	}

}
