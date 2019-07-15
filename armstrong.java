import java.lang.Math;
import java.util.*;
class a
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
System.out.println("enter no");
int p = s.nextInt();
int d=p;
int t=p;
int count = 0;
while(t>0)
{
t=t/10;
count++;
}
System.out.println("no of digits is " +count);
double r=0;
while(d>0)
{
r=r+Math.pow(d%10,count);
d=d/10;
}
if(r==p)
{
System.out.println("no is armstrong");
}
else
{
System.out.println("no is not armstrong");
}
}
}