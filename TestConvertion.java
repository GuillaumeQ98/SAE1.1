public class TestConvertion 
{
    
    public static void main(String arg[])
    {
		boolean[] test = Convertion.entier2Tab(11, 4);
		for(int i = 0 ; i < 4; i++)
		{
			System.out.println(test[i]);
		}

        int val = Convertion.tab2Entier(test);
        System.out.println(val);

        System.out.println(Convertion.enChaine(test));
    }
}
