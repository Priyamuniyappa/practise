package com.wipro.sort.bubblesort;
import com.wipro.sort.exceptions.*;
abstract public class BubbleSort {
	private int arr[];
	public BubbleSort()
	{
		arr = null;
	}
	public BubbleSort(int N)
	{
		
		 arr= new int[N];
	}
	public BubbleSort(int[] a)
	{
		
		
		
			arr = a;
		
	}
	public BubbleSort(BubbleSort bs)
	{
		
	arr=bs.arr;
	}
	public int[] getArray()
	{
	
	return arr;
	}
public abstract	int[] sort(); 
}




