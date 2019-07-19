import java.util.*;
class a
{
public static void main (String [] args)
{
System.out.println("enter size");
int s = new Scanner(System.in).nextInt();
for(int i=s;i>0;i--)
{
	for(int j=0;j<=i;j++)
	{
	System.out.print(" ");
	}
	System.out.print("*");
	
	for(int k=s;k>i;k--)
	{
	if(i==(s/2))
	{
	System.out.print("*");
	}
	else
	{
	System.out.print(" ");
	}
	}
	for(int y=(s-1);y>i;y--)
	{
	if(i==(s/2))
	{
	System.out.print("*");
	}
	else
	{
	System.out.print(" ");
	}
	}
	for(int d=s;d>i;d--)
	{
	System.out.print("*");
	break;
	}
System.out.println();
}
}
}




























