/**  
 * GUI version for Dedale
 * @author Quillard Guillaume
 * @version 1.0 du 16/01/2024
**/

import ihmgui.FrameGrille;

import javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder;

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
		return 100;
	}

	public String  setFondGrille()
	{
		return "./images/fond.png";
	}

	public String setImage ( int ligne, int colonne, int couche)
	{
		String rep = "./images/";
		String sImage=null;
		int valeur;

		//System.out.println("Image coord " + colonne + ligne);
		
		
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
			
		}

		

		if(couche == 1)
		{
			couche++;
			if(metier.getSymboleHero(ligne, colonne) == 's' && metier.getDirection() == 'N') sImage = rep + "dw_n.png";
			if(metier.getSymboleHero(ligne, colonne) == 's' && metier.getDirection() == 'O') sImage = rep + "dw_o.png";
			if(metier.getSymboleHero(ligne, colonne) == 's' && metier.getDirection() == 'S') sImage = rep + "dw_s.png";
			if(metier.getSymboleHero(ligne, colonne) == 's' && metier.getDirection() == 'E') sImage = rep + "dw_e.png";
			
			/*if(metier.getPiece(ligne, colonne).getArrivee()) sImage = rep + "arrivee.png";
			if(metier.getPiece(ligne, colonne).getDepart()) sImage = rep + "depart.png";*/
			
		}

		if(couche == 2)
		{
			if(metier.getPiece(ligne, colonne).getArrivee()) sImage = rep + "arrivee.png";
			if(metier.getPiece(ligne, colonne).getDepart()) sImage = rep + "depart.png";

			if(metier.getPiece(ligne, colonne).getArrivee()) sImage = rep + "arrivee.png";
		}

		return sImage;
	}

	public void jouer(String touche)
	{
		if ( touche.equals ( "CR-Z" ) ) System.out.println ( "Pourquoi voulez-vous annuler ? " );
		if ( touche.equals ( "FL-H" ) ) metier.Deplacer ( 'N' );
		if ( touche.equals ( "FL-G" ) ) metier.Deplacer ( 'O' );
		if ( touche.equals ( "FL-B" ) ) metier.Deplacer ( 'S' );
		if ( touche.equals ( "FL-D" ) ) metier.Deplacer ( 'E' );
		if ( touche.equals ( "A")     ) System.out.println ( "Vous avez appuyer sur [A]" );

		frame.majIHM();
	}

	public static void main(String[] a)
	{
		new Controleur();
	}

}