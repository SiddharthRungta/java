import java.util.*;
class a
{
public static void main(String [] args)
{
System.out.println("Enter Size");
int n = new Scanner(System.in).nextInt();
for(int i=0;i<n;i++)
{	
	System.out.print("*");
	for(int j=0;j<i;j++)
	{
		if(i==n-1)
		{
		System.out.print("*");
		}
		else
		{
		System.out.print(" ");
		}
	}
	for(int j=0;j<=i;j++)
	{
		System.out.print("*");
		break;
	}
	for(int k=n-1;k>i;k--)
	{
		if(i==n-1)
		{
		continue;
		}
		else
		{
		System.out.print(" ");
		}
	}
	for(int j=n-2;j>i;j--)
	{
		if(i==n-1)
		{
		continue;
		}
		else
		{
		System.out.print(" ");
		}
	}
	for(int j=0;j<=i;j++)
	{
		System.out.print("*");
		break;
	}
	for(int j=0;j<i;j++)
	{
		if(i==n-1)
		{
			if(j==n-2)
			{
			continue;
			}
			else
			{
			System.out.print("*");
			}
		}
		else
		{
		System.out.print(" ");
		}
	}
	System.out.print("*");
	System.out.println();
}
}
}