/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
*/
public class Ques10
{
public static void main (String arg[])
{
long i , j , sum=2 , c=0;
for (i=3;i<2000000;i+=2)
{
c=0;
for(j=3;j<=i/2;j+=2)
{
if(i%j==0)
{
c=1;
break;
}
}
if(c==0)
sum=sum+i;
}
System.out.println(sum);
}
}

