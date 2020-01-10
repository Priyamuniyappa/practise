package com.wipro.sort.main;
import com.wipro.sort.bubblesort.*;
import com.wipro.sort.exceptions.*;
public class MainClass {
public static void main(String args[])
{

	int arr[]= {2,4,1,8,5,6};
	
	BubbleSort s ;//= new BubbleSortAsc();
	s = new BubbleSortAsc(arr);//c
	
	int [] x=s.sort();
	if(x!=null)
	{
		for(int sort:x)
			System.out.println(sort);
	}
		else
		{
System.out.println(x);
	

}
}
}