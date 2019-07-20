import java.util.*;
class a
{
public static void main(String [] args)
{
//int s[][] = {{4,2,3},{4,5,6},{7,8,9}};

int s[][] = new int [3][3];
System.out.println("Enter array elements");


for(int i=0;i<3;i++)
{
	for(int k=0;k<3;k++)
	{
		s[i][k] = new Scanner(System.in).nextInt();
	}
}
System.out.println("matrix is");
for(int i=0;i<3;i++)
{
	for(int k=0;k<3;k++)
	{
	System.out.print(s[i][k]+" ");
	}
	System.out.println();
}



System.out.println("Determinant is");
int z=0;
for(int i=0;i<3;i++)
{	int w=1;
	int sum=1;
	for(int k=0;k<3;k++)
	{	
		
		for(int p=0;p<3;p++)
		{
			if(i!=p && i!=k && k==p)
			{
				sum=sum*(s[k][p]);
			}
			else
			{
			continue;
			}
		}
		for(int p=0;p<3;p++)
		{
			if(i!=p && i!=k && k!=p)
			{
				w=w*(s[k][p]);
			}
			else
			{
			continue;
			}
		}
	}
	z=z+((s[i][i]*(sum-w)));
}
System.out.println(z);
}
}