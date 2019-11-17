/*
Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.

For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.

Evaluate the sum of all the amicable numbers under 10000.
*/
public class Ques21
{
	public static void main(String[] args) {
		int i ,j=1 ,sum=0;
		for(i=1;i<10000;i++)
		{
			int a = FactorSum(i);
			int b = FactorSum(a);
			if(b==i&&a!=i)
				sum = sum + i; 
		}
		System.out.println(sum);

	}
	public static int FactorSum(int n)
	{
		int i = n ,sum =0;
		for(int j=1 ;j<=i/2;j++)
		{
			if(n%j==0)
				sum=sum+j;
		}
		return sum;
	}
}
