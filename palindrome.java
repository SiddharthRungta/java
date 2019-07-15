import java.util.*;
class a
{
public static void main(String [] args)
{
System.out.println("enter no");
int s = new Scanner(System.in).nextInt();
int p =s;
int r=0;
while(p>0)
{
r=(10*r)+ (p%10);
p=p/10;
}
//System.out.println("value of r is " + r);
if(r==s)
{
System.out.println("no is palindrome");
}
else
{
System.out.println("no is not palindrome");
}
}
}
