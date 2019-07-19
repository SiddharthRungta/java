import java.util.*;
class a
{
public static void main(String [] args)
{
int s[][] = {{1,2},{3,4}};
int p[][] = {{5,6},{7,8}};

for(int i=0;i<2;i++)
{
	for(int k=0;k<2;k++)
	{
		System.out.print(s[i][k]+p[i][k]+" ");
	}
	System.out.println();
}
}
}