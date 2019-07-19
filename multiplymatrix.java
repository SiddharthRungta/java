class a
{
public static void main(String [] args)
{
int s[][]={{1,2,3},{4,5,6},{7,8,9}};
int p[][]={{11,12,13},{14,15,16},{17,18,19}};
int r[][] = new int[3][3];

for(int d=0;d<3;d++)
{
for(int i=0;i<3;i++)
{
	int sum=0;
	for(int k=0;k<3;k++)
	{
		sum =sum+(s[d][k]*p[k][i]);
	}
	 r[d][i]=sum;
}
}
for(int i=0;i<3;i++)
{
	for(int k=0;k<3;k++)
	{
	System.out.print(r[i][k]+" ");
	}
	System.out.println();
}
}
}	