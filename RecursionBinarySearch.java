import java.util.*;
class b
{
	public static int search(int s[],int first,int last,int p)
	{	
		int mid=s[(first+last)/2];
	
		if(p == mid || p==s[first] || p==s[last])
		{
			return 1;
		}
		else if(s[first]==mid || s[last]==mid)
		{
			return 0;
		}
		else if(p>mid)
		{
			return search(s, (last + first)/2, last, p);
		}
		else if(p<mid)
		{
			return search(s, first, (last + first)/2, p);
		}
		else
		{
			return 0;
		}	
	}

}





public class RecursionBinarySearch
{
public static void main(String [] args)
{
	//int s[] ={2,4,6,8,10,12,14,16,18,20};
	
	System.out.println("Enter Size Of Array");	
	int n =  new Scanner(System.in).nextInt(); 
	int s[] = new int [n];

	System.out.println("Enter Array Elements");

	for(int i=0;i<n;i++)
	{
		s[i]= new Scanner(System.in).nextInt();
	}

	System.out.println("Enter no to be searched");
	int p = new Scanner(System.in).nextInt();

		
	int first = 0;
	int last = s.length -1;
	
	b obj = new b();
	int g=b.search(s,first,last,p);	
	
	if(g==1)
	{
		System.out.println("element found");
	}
	else
	{
		System.out.println("element not found");
	}
}
}



	
