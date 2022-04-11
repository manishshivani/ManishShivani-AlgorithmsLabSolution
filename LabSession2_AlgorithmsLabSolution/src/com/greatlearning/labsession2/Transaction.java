package com.greatlearning.labsession2;

import java.util.Scanner;

public class Transaction {
	
	static Scanner in = new Scanner (System.in);

	public static void main(String[] args) {
				
		int size;
		System.out.println("Enter the size of transaction array");
		size = in.nextInt();
		
		
		int[] tran = new int[size];
				
		// take the input of transactions and store in the array
		System.out.println("Enter the values of transactions");
		for (int i=0;i<size;i++)
		{
			tran[i] = in.nextInt();
		}
		
		// take the input of number of targets to be achieved
		System.out.println("Enter the number of targets");
		int num = in.nextInt();
		
		//Loop as many times as the number of targets
		for (int i=0;i<num;i++)
		{
			// Input the target from the user
			System.out.println("Enter the target");
			int target = in.nextInt();
			
			int sum = 0; // to calculate the sum of tran array
			
			int index = 0; // to track the index upto which the sum is taken
			
			boolean flag = false; /* to check if target is achieved or 
			* it is not achieved and the end of array has been reached */
			
			
			while(index < tran.length)
			{
				sum+=tran[index];
				index++;
				if(sum>=target)
				{
					flag = true; // set flag as true if target is achieved and we have not reached end of array
					break;
				}
			}
			if (flag == true)
				System.out.println("Target achieved after " + index + " transactions");
			else
				System.out.println("Target is not achieved");
		}
			
	}

}