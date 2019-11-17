/*

The decimal number, 585 = 10010010012 (binary), is palindromic in both bases.

Find the sum of all numbers, less than one million, which are palindromic in base 10 and base 2.

(Please note that the palindromic number, in either base, may not include leading zeros.)
*/
public class Ques36
{
	public static void main(String[] args) {
		int i ,sum=0 ;
		for(i=1;i<1000000;i++)
		{
			boolean rn = isPallindrome(i);
			boolean rb = isBinary(i);
			if(rn==true&&rb==true)
				sum+=i;
		}
		System.out.println(sum);
	}
	public static boolean isPallindrome(int n )
	{
		int m=n , sum=0;
		while(m>0)
		{
			sum = sum*10 + (m%10);
			m=m/10;
		}
		if(sum == n)
			return true;
		else 
			return false;
	}
	public static boolean isBinary(int n)
	{
		String s ="";
		int m=n;
		while(m>0)
		{
			s=(m%2)+s;
			m=m/2;
		}
		String f = s , sum="";
		int i;
		for(i=0;i<f.length();i++)
		{
			sum = f.charAt(i)+sum;
		}
		if(sum.equalsIgnoreCase(s))
			return true;
		else 
			return false;
		
	}
}
