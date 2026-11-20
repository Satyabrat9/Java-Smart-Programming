class q38
{
	public static void main(String[] args)
	{
		int no = 5;
		char symbol = '*';
		for(int i=0;i<no;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(symbol + " ");
			}
			System.out.println();
		}

		for(int i=no-1;i>0;i--)
		{
			for(int j=i;j>0;j--)
			{
				System.out.print(symbol + " ");
			}
			System.out.println();
		}
	}
}