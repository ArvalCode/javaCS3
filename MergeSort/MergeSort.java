package MergeSort;

// A+ Computer Science - www.apluscompsci.com
//Name - Nolan Tran
//Date - 11/29/23
//Class - CS3
//Lab - MergeSort
//© A+ Computer Science  -  www.apluscompsci.com


import static java.lang.System.*;
import java.util.Arrays;		//use Arrays.toString() to help print out the array

public class MergeSort
{
	private static int passCount;

	public static void mergeSort(Comparable[] list)
	{


		passCount=0;
		mergeSort(list, 0, list.length);
	}

	private static void mergeSort( Comparable[] stuff, int front, int back)  //O( Log N )
	{
        int dif = back-front, spot = 0;
        Comparable[] temp = new Comparable[ dif ];
        int beg = front, mid = (front+back)/2, saveMid = mid;
        while( beg<saveMid && mid<back ) {
           if(stuff[ beg ].compareTo(stuff[ mid ])<0)
              temp[ spot++ ]= stuff[ beg++ ];
           else
              temp[ spot++ ]= stuff[ mid++ ];
        }		
        while( beg < saveMid ) 
           temp[ spot++ ]= stuff[ beg++ ];
        while( mid < back ) 
           temp[ spot++ ]= stuff[ mid++ ];
        for(int i = 0; i < dif; ++i)
           stuff[front+i]=temp[i];
      
	}

	private static void merge(Comparable[] list, int front, int back)  //O(N)
	{

	}
}