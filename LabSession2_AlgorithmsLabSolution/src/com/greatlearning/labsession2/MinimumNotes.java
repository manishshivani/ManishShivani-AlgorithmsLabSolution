package com.greatlearning.labsession2;

import java.util.Scanner;
import MergeSort.*;

public class MinimumNotes {
	
	static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		
		// Input size of currency denominations
		System.out.println("Enter the size of currency denominations");
		int size = sc.nextInt();
		
		int[] notes = new int[size];
		
		// Take the input of currency denominations
		System.out.println("Enter the currency denominations value");
		for (int i=0;i<size;i++)
		{
			notes[i] = sc.nextInt();
		}
		
		// Take the input of amount to be paid
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		
		
		//sort the array using merge sort
		MergeSortImplementation ms = new MergeSortImplementation();
		ms.mergeSort(0,notes.length-1,notes);
		
				
		//algorithm to find the minimum number of notes
		int index = 0;
		int amt = amount;
		int len = notes.length;
		System.out.println("Your payment approach in order to give min no of notes will be");
		while(index<len)
		{

				while(index<len&&amt<notes[index])
					index++;
				
				
				if(index>=len)
					break;
				else
				{
				int numOfNotes = amt/notes[index];
				amt = amt%notes[index];
				System.out.println(notes[index]+":"+numOfNotes);
				index++;
				}
			
		}
		

	}

}