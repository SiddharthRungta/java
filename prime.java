import java.util.*;
class a
{
public static void main(String[] args)
{
System.out.println("enter no");
int s = new Scanner(System.in).nextInt();
int r=0;
for(int i=2;i<s;i++)
{
r=s%i;
if(r==0)
{
break;
}
else
{
continue;
}
}
if(r==0)
{
System.out.println("no is not prime");
}
else
{
System.out.println("no is prime");
}
}
}