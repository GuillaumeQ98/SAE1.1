/*
 * Test for the class Dedale
 * @author Quillard Guillaume
 * @version 1.0 du 16/01/2024
 */

public class TestDedale
{
	public static void main(String[] a)
	{
		/*---------------*/
		/*   Données     */
		/*---------------*/
		Dedale dedale;
		String separateur;


		/*---------------*/
		/* Instructions  */
		/*---------------*/
		dedale = new Dedale();




		// Affichage du plan
		System.out.println ( "--------"   );
		System.out.println ( " Grille"    );
		System.out.println ( "--------\n" );

		System.out.println ( Convertion.grille ( dedale ) );

		System.out.println();


		// Affichage du Détail
		System.out.println ( "--------"   );
		System.out.println ( " Detail"    );
		System.out.println ( "--------\n" );

		System.out.println ( Convertion.detail ( dedale ) );

		System.out.println( dedale.validite());


	}

}