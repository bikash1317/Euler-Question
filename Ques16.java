/*
215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 21000?
*/
import java.math.BigInteger;
public class Ques16
{
	public static void main(String[] args) {
		BigInteger n = new BigInteger("2");
		BigInteger p = new BigInteger ("1000");
		BigInteger mul = BigInteger.ONE;
		while(p.compareTo(BigInteger.ONE)>=0)
		{
			mul = mul.multiply(n);
			p=p.subtract(BigInteger.ONE);
		}
		System.out.println(mul);
		System.out.println("\n");
		String s = mul.toString();
		int sum = 0 ,i=0;
		for(i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			sum = sum+((int)ch - 48);
		}
		System.out.println(sum);
	}
}
