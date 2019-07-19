class a
{
public static void main(String [] args)
{
int s[][] = {{1,2,3},{4,5,6},{7,8,9}};
System.out.println("matrix is");
for(int i=0;i<3;i++)
{
	for(int k=0;k<3;k++)
	{
	System.out.print(s[i][k]+" ");
	}
	System.out.println();
}
for(int i=0;i<3;i++)
{
	for(int k=0;k<3;k++)
	{
	if(k>i)
	{
		int r;
		r=s[i][k];
		s[i][k]=s[k][i];
		s[k][i]=r;
	}
	else
	{
	continue;
	}
	}
}
System.out.println("Transpose is");
for(int i=0;i<3;i++)
{
	for(int k=0;k<3;k++)
	{
	System.out.print(s[i][k]+" ");
	}
	System.out.println();
}
}
}