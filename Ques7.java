/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?
*/
public class Ques7
{
public static void main(String Args[])
{

int a=1,n=0,i;
while (n<=10001)
{
int c=0;
for(i=2;i<=a/2;i++)
{
if (a%i==0)
{
c=1;
break;
}
}
if(c==0)
n++;
a++;
}
System.out.println(a-1);
}
}
