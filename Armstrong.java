import java.util.*;
class Armstrong
{
	public static void main(String[] args)
	{
		int number = 370;
		int temp = number;
		int length = 0;
		
		while(temp!=0)
		{
			temp = temp / 10;
			length++;
		}
		int rem = 0; double sum = 0; temp = number;
		while(temp!=0)
		{
			rem = temp%10;
			sum = sum + Math.pow(rem, length);
			temp = temp/10;
		}
		if(sum == number)
		{
		    System.out.println("Its a Armstrong");
                } else 
		{
		    System.out.println("Its not an Armstrong");
		}
	}
}