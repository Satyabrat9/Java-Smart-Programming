class q39
{
	public static void main(String[] args)
	{
		int no = 5;
		for(int i=no;i>0;i--)
		{
					
			for(int j = no -1; j >= 0;j--)
			{
				int no_of_stars = no - j, no_of_spaces = i - 1;
				for(int k = 0;k < no_of_stars;k++)
				{
					System.out.print('*');
				}
				for(int l = 0;l<no_of_spaces;l++)
				{
					System.out.print(' ');

				}
				System.out.println();
			}
		}
	}
}