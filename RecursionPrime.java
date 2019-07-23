import java.util.*;
class a
{
public int prime(int n ,int m)
{
	if(n==1 || n==2)
	{
	System.out.print(n+" ");
	return prime (n+1,m);
	}
	else if(n>m)
	{
		return 0;
	}
	else
	{
		for(int i=2;i<n;i++)
		{
			int d= n%i;
			if(d==0)
			{
				break;
			}
			else if(i==n-1 &&d!=0)
			{
				System.out.print(n+" ");
	
			}
			
		}
		return prime (n+1,m);	
	}
}
}
class b
{
public static void main(String [] arg)
{	
	System.out.println("Enter Interval");
	int k = new Scanner(System.in).nextInt();
	int l = new Scanner(System.in).nextInt();
	System.out.println("Prime no are");	
	a obj = new a();
	obj.prime(k,l);
}
}

