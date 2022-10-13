package com.string.bll;

import java.util.Scanner;

public class SentenceIntoWord {
	static void sort(String []s, int n)
	{
		for (int i=1 ;i<n; i++)
		{
			String temp = s[i];

			int j = i - 1;
			while (j >= 0 && temp.length() < s[j].length())
			{
				s[j+1] = s[j];
				j--;
			}
			s[j+1] = temp;
			
		}
	}

	static void printArraystring(String str[], int n)
	{
		for (int i=0; i<n; i++)
			System.out.print(str[i]+" ");
	}

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence : ");
		String sentence = sc.nextLine();
		//Break up the sentence into words and display
		String[] words = sentence.split(" ");
		System.out.print("Break sentence into words : ");
		for(String w:words)
			System.out.println(w+" ");
		String []arr = {"The MadhyaPradesh", "I", "am", "from"};
		int n = arr.length;
		
		// Function to perform sorting
		sort(arr,n);
		// Calling the function to print result
		printArraystring(arr, n);
		sc.close();
		
	}
	
	}

