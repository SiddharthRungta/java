class a
{
public static void main(String [] args)
{
int i;
int r=0;
System.out.println("prime no are");
System.out.println("1");
System.out.println("2");
for(i=1;i<=100;i++)
{
for(int j=2;j<i;j++)
{
r=i%j;
if(r==0)
{
break;
}
else{
continue;
}
}
if(r==0)
{
continue;
}
else
{
System.out.println(i);
}
}
}
}