class a
{
public static void main(String [] args)
{
int s[][]={{1,2,3},{4,5,6},{7,8,9}};
int sum=0;
for(int i=0;i<3;i++)
{
	for(int k=0;k<3;k++)
	{
	if(i==k)
	{
		sum =sum+s[i][k];
	}
	else
	{
	continue;
	}
	}
}
System.out.println("sum of diagonals are " + sum);
}
}	