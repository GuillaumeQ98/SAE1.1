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

		frame.setSize     ("A COMPLETER" );
		frame.setLocation (   10,   10   );
		frame.setTitle    ( /* A compléter */  );
		frame.setVisible  ( true         );
	}


	public int     setNbLigne        () { /* A compléter */   }
	public int     setNbColonne      () { /* A compléter */   }
	public int     setLargeurImg     () { /* A compléter */   }
	public String  setFondGrille     () { /* A compléter */   }

	public String setImage ( int ligne, int colonne, int couche)
	{
		String rep = "./images/";
		String sImage=null;

		if ( couche==0 )
		{
			/* A compléter */
		}

		return sImage;
	}

	public static void main(String[] a)
	{
		new Controleur();
	}

}