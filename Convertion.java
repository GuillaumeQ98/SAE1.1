/**  
 * Convert integer value to a boolean array and a boolean 
 * array to a integer value
 * @author Quillard Guillaume
 * @version 1.0 du 16/01/2024
**/

import java.lang.Math;

public class Convertion {
	public static final int TAILLE_TAB = 4; 
    
    public static boolean[] entier2Tab(int valeur, int nbElt)
	{
		boolean[] tab = new boolean[nbElt];

		for(int i = 0; i < nbElt; i++)
		{
			if(valeur % 2 == 0)
			{
				tab[i] = false;
			}
			else
			{
				tab[i] = true;
			}

			valeur = valeur / 2;
		}

		return tab;
	}

	public static int tab2Entier(boolean tab[])
	{
		int valeur;

		valeur = 0;
		for(int i = 0 ; i < tab.length ; i++)
		{
			if(tab[i])
			{
				valeur += Math.pow(2, i);
			}
		}

		return valeur;
	}

	public static String enChaine(boolean tab[])
	{
		String chaine;

		chaine = "+";

		for (int i = 0; i < tab.length; i++) 
		{
			chaine += "-----+";
		}

		chaine += "\n|";

		for (int i = 0; i < tab.length; i++)
		{
			if(tab[i])
			{
				chaine += "true |";
			}
			else
			{
				chaine += "false|";
			}
		}

		chaine += "\n+";

		for (int i = 0; i < tab.length; i++) 
		{
			chaine += "-----+";
		}

		return chaine;
	}

	public static String grille(Dedale dedale)
	{
		String chaine;

		chaine = "";

		for(int i = 0; i < dedale.getNbLigne(); i++)
		{
			chaine += "+";

			for(int k = 0; k < dedale.getNbLigne(); k++)
			{
				chaine += "----+";
			}

			chaine += "\n";

			for(int j = 0; i < dedale.getNbColonne(); j++)
			{
				if(j == 0)
				{
					chaine += "|";
				}

				chaine += dedale.getPiece(i, j).getValOuvertures() + " |";
			}
		}

		return chaine;
	}

	public static String detail(Dedale dedale)
	{
		String chaine;

		chaine = "";

		for(int i = 0; i < dedale.getNbLigne(); i++)
		{
			chaine += "== Ligne  " + i + "==============================================================\n";

			for(int j = 0; j < dedale.getNbColonne(); j++)
			{
				chaine += dedale.getPiece(i, j).toString();
			}
		}


		return chaine;
	}
	
}
