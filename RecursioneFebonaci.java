import java.util.*;
class a
{
static int i=0;
public static int febo(int d,int r,int n)
{

	int e = d+r;
	d=r;
	r=e;
	System.out.print(e+" ");
	if(i==n)
	{
		return 0;
	}
	else
	{	i++;
		return febo(d,r,n);
	}
	
}
}




public class febonaci
{
public static void main(String [] args)
{ 
System.out.println("EnterSize");
int s = new Scanner(System.in).nextInt();
int b=0;
int c=1;
a obj = new a();
System.out.print(b+" ");
System.out.print(c+" ");
int w= a.febo(b,c,s);
}
}