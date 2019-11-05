/* n! means n × (n − 1) × ... × 3 × 2 × 1

For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

Find the sum of the digits in the number 100!
*/
import java.math.BigInteger;
import java.util.Scanner;
public class Ques20
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the factorial number that we have to find the sum of digit"); 	
		BigInteger num = sc.nextBigInteger();
		BigInteger res =  BigInteger.ONE;
		for(BigInteger x =BigInteger.ONE;x.compareTo(num)<=0;x=x.add(BigInteger.ONE))
		{
			res = res.multiply(x);
		}
		System.out.println("The factorial is = "+res);
		
		String re = res.toString();
		int i = 0;
		long sum = 0;
		for(i=0;i<re.length();i++)
		{
			sum = sum + ((int)re.charAt(i)-48);
		}
		System.out.println("The sum of the factorial digits are = "+sum); 
	}  
}
