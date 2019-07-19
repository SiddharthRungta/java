import java.util.*;
class a
{
public static void main(String [] args)
{

int a[] = new int[10];
for(int i=0;i<10;i++)
{
a[i]= new Scanner(System.in).nextInt();
}
for(int i =0;i<10;i++)
{
	for(int j=0;j<9;j++)
	{
		if(a[j]<a[j+1])
		{
			int d;
			d=a[j];
			a[j]=a[j+1];
			a[j+1]=d;
		}
		else
		{
			continue;
		}
	}
}
System.out.println("sorted array is");
for(int i=0;i<10;i++)
{
System.out.print(a[i]+" " );
}
}
}