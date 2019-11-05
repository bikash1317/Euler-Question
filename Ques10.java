/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
*/
public class Ques10
{
	public static void main(String[] args) 
	{
		int i ;
		long sum =2;
		for(i=3;i<2000000;i=i+2)
		{
			boolean p = isPrime(i);
			if(p==true)
				sum = sum + i ;

		}
		System.out.println(sum); 
		
	}
	 public static boolean isPrime(int a)
	 {
	 	int i ;
	 	for(i=3;i*i<=a;i=i+2)
	 	{
	 		if(a%i==0)
	 			return false;
	 	}
	 	return true;
	 }
}

