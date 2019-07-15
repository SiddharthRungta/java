class a
{
public static void main(String [] args)
{
System.out.println("no divisible by 5 are");
int i;
int r=0;
for(i=1;i<1000;i++)
{
r=i%5;
if(r==0)
{
System.out.print(i+",");
}
else
{
continue;
}
}
//System.out.print("\b");
}
}
