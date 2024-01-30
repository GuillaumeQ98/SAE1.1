/**  
 * Test for the class Piece
 * @author Quillard Guillaume
 * @version 1.0 du 16/01/2024
**/

public class TestPiece 
{
	public static void main(String[] arg)
	{
		Piece test = new Piece(9, "Livre");
		Piece test2 = new Piece(16+15, "Depart");
		Piece test3 = new Piece(32+8, "Arrivee");

		System.out.println(test);
		System.out.println(test2);
		System.out.println(test3);
	}
}
