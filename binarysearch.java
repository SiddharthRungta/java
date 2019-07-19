import java.util.*;
class a
{
public static void main(String [] args)
{
//int s[]={2,4,6,8,10,12,14,16,18,20};
System.out.println("Enter size");
int n= new Scanner(System.in).nextInt();
int s[] = new int[n];
System.out.println("Enter array ");
for(int i=0;i<n;i++)
{
s[i]= new Scanner(System.in).nextInt();
}
int first,last,mid;
first=0;
last=n-1;
mid= s[(last + first)/2];

//System.out.println("mid "+ mid);
//System.out.println("First "+ first);
//System.out.println("last "+ last);
System.out.println("Enter no to be searched");
int p = new Scanner(System.in).nextInt();
for(int j = 0;j<10;j++)
{
if(p == mid || p==s[first] || p==s[last])
{
System.out.println(" found");
break;
}
else if(s[first]==mid || s[last]==mid)
{
System.out.println("not found");
break;
}
else if(p>mid)
{
first = (last + first)/2 ;
mid = s[(last + first)/2];
}
else if(p<mid)
{
last = (last + first)/2 ;
mid = s[(last + first)/2];
}
else
{
continue;
}
}
}
}
