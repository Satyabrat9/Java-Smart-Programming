class Prime_no_upto_n{
	public static void main(String[] args){
		int no_of_prime_no = 0;
		int number = 100; int divisibility = 0;
		
		for(int i=1;i<=number;i++){
			for(int j=2;j<=i;j++){
				if(i%j == 0){
				divisibility++;
				}
			}
		if(divisibility == 1){
			System.out.println(i);
  			no_of_prime_no++;
			
			}
		divisibility = 0;
			
		}
		System.out.println("Total no of prime nos: "+no_of_prime_no);	
	}
}