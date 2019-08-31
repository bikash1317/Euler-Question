/* 
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
*/
public class Ques8
{
public static void main(String Args[])
{
int i,j,x;
for (i=1;i<1000;i++)
{
for (j=i;j<1000;j++)
{
x=1000-i-j;
if(x*x==i*i+j*j)
System.out.println(x*i*j);
}
}
}
}
