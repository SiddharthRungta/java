import java.util.*;
class a
{
public static void main(String [] args)
{
System.out.println("enter array size");
int n = new Scanner(System.in).nextInt();

int ar[] = new int[n];
System.out.println("enter elements");

for(int i=0;i<n;i++)
{
ar[i] = new Scanner(System.in).nextInt();
}
System.out.println("Entered array is");
for(int d : ar)
{
System.out.print(d+" ");
}
System.out.println();

System.out.println("Enter size of 2D array");
System.out.print("row ");
int row = new Scanner(System.in).nextInt();
System.out.print("col ");
int col = new Scanner(System.in).nextInt();
int s[][] = new int[row][col];
int k =0;
if(n==col*row)
{
	for(int i=0;i<row;i++)
	{
		for(int j =0;j<col;j++)
		{
			
			
				s[i][j]= ar[k];
				k++;
				
			
		}
	}
	for(int i=0;i<row;i++)
	{
		for(int j =0;j<col;j++)
		{
			System.out.print(" "+ s[i][j]);
		}
		System.out.println();
	}

}
else
{
System.out.println("invalid input");
}

}
}