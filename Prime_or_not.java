class Prime_or_not{
	public static void main(String[] args){
		int number = 29;
		int factors = 0;
		for(int i=2;i<=number;i++){
			if(number % i == 0){
				factors++;
			}
		}
		if (factors == 1){
			System.out.println("It's a Prime number");
		} else {
		
			System.out.println("It's not a Prime number");

		}		
	}


}