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
				System.out.println("test1");
			}
			else
			{
				System.out.println("test2");
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


		return "Bonjour";
	}
}
