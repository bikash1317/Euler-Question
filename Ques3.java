/*
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?*/
public class Ques3
{
public static void main(String Args[])
{
double n=600851475143.0;
double i=2.0;
while(n>i)
{
if(n%i==0)
n=n/i;
else 
i=i+1;
}
System.out.println(i);
}
}
