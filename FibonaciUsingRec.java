class FibonaciUsingRec
{
	static int a = 0, b = 1, sum = 0;
	public static void main(String[] args)
	{
		System.out.print(a + " " + b + " ");
		FibonaciUsingRec ob = new FibonaciUsingRec();
		ob.FiboRec(10);

	}
	void FiboRec(int i)
	{
	while(i>=1){
	    sum = a+ b;
	    System.out.print(sum + " ");
	    a = b;
	    b = sum;
	    i--;
                }
	}

}