/*A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.*/

public class Ques4
{
public static void main(String Arg[])
{
int greater=0,i,j,product=0;
int p,q;
for(i=100;i<999;i++)
{
for(j=100;j<999;j++)
{
p=i*j;
 q=p;
int r =0,sum=0;
while(q>0)
{
r=q%10;
sum=sum*10+r;
q=q/10;
}
if (p==sum)
product=p;
if(greater<product)
greater=product;
}
}
System.out.println(greater);
}
}

