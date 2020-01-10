package com.wipro.sort.bubblesort;
import com.wipro.sort.exceptions.*;
public class BubbleSortAsc extends BubbleSort {
	public BubbleSortAsc()
	{
		super();
	}
	public BubbleSortAsc(int N)
	{
		 super(N);
	}
	public BubbleSortAsc(int[] a)
	{
		
		super(a);
	}
	public BubbleSortAsc(BubbleSort bs)
	{
		super(bs);
	}
public	int[] sort() 
{
	int b;
	 
	try{
	if(super.getArray()== null)
		{
		throw new EmptyArrayException();
		}
	if(super.getArray().length!=5)
	{
		throw new EmptyArrayException();
		}
	
	else
	{
		for(int i = 0;i<super.getArray().length;i++)
	{
		for(int k=0;k<super.getArray().length-i-1;k++)
		{
			if(super.getArray()[k]>super.getArray()[k+1])
			{
				b = super.getArray()[k];
				super.getArray()[k] = super.getArray()[k+1];
				super.getArray()[k+1] = b;
			}
		}
		
	}
	}
	return super.getArray();
	}
	catch(EmptyArrayException e)
	{
		System.out.println(e);
	}

return null;
}
}







