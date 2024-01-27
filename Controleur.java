import ihmgui.FrameGrille;
import ihmgui.Controle;

public class Controleur extends Controle
{
	private Dedale      metier;
	private FrameGrille frame;

	public Controleur()
	{
		this.metier = new Dedale();
		this.frame  = new FrameGrille ( this );

		frame.setSize     ( 600, 600 );
		frame.setLocation (   10,   10   );
		frame.setTitle    ( "Dedale" );
		frame.setVisible  ( true         );
	}


	public int     setNbLigne()
	{
		return metier.getNbLigne();
	}

	public int     setNbColonne()
	{
		return metier.getNbColonne();
	}

	public int     setLargeurImg()
	{
		return 600;
	}

	public String  setFondGrille()
	{
		return "./images/fond.png";
	}

	public String setImage ( int ligne, int colonne, int couche)
	{
		String rep = "./images/";
		String sImage=null;

		System.out.println("Image coord " + colonne + ligne);
		if ( couche==0 )
		{
					if(metier.getPiece(ligne, colonne).getValOuvertures() < 10)
					{
						sImage = rep + "P0" + metier.getPiece(ligne, colonne).getValOuvertures() + ".png";
					}
					else
					{
						sImage = rep + "P" + metier.getPiece(ligne, colonne).getValOuvertures() + ".png";
					}
					System.out.println(sImage);
					
			
		}

		return "./images/P09.png";
	}

	public static void main(String[] a)
	{
		new Controleur();
	}

}