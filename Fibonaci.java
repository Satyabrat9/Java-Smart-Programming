class Fibonaci{
	public static void main(String[] args){
		int nums = 10; int sum = 0;
		int a = 0;
		int b = 1;
		System.out.println(a);
		System.out.println(b);

		for(int i=0;i<nums;i++){
			sum = a+b;
			System.out.println(sum);
			a = b;
			b = sum;
		}
	}
}