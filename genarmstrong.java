import java.lang.Math;
class a
{
public static void main(String [] args)
{
int i;
System.out.println("armstrong no are");
for(i=1;i<1000;i++)
{
	double r=0;
	int count=0;
	int p=i;
	int d=i;
	while(p>0)
	{
		p=p/10;
		count++;
	}
	while(d>0)
	{
		r=r+Math.pow(d%10,count);
		d=d/10;
	}
	if(r==i)
	{
		System.out.println(i);
		//continue;
	}
	else
	{
		continue;
	}
}
}
}





















