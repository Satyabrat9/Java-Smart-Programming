import java.util.Scanner;
class Palindrome
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter  a number to check Palindrome or not?:"	);
	int number = sc.nextInt(); int rem = 0;
	int temp = number;
	int rev = 0;
	while(temp != 0)
		{
		rem = temp % 10;
		rev = rev * 10 + rem;
		temp = temp / 10;
		}
	if(rev == number)
		{
		System.out.println(number + " is a Palindrome number");
		} else
		{
		System.out.println(number + " is not a Palindrome number");
		}
	}
}