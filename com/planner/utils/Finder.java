package com.planner.utils;

import java.util.ArrayList;

import com.planner.data.Enzymes;
import com.planner.frame.MainPanel;

public final class Finder
{
	private static ArrayList<Integer> enzyme = null;
	private static ArrayList<Integer> index = null;
	
	private static String[] recognitionSequence = null;
	
	static
	{
		recognitionSequence = new String[Enzymes.DATA.length];
		
		for(int j = 0; j < Enzymes.DATA.length; j++)
		{
			recognitionSequence[j] = Enzymes.DATA[j][1].toUpperCase();
		}
	}
	
	private static synchronized String reverse(String text)
	{
		StringBuilder toReturn = new StringBuilder();
		for(int j = 0 ; j < text.length(); j++)
		{
			if(text.charAt(j) == 'A')
			{
				toReturn.append("T");
			}
			else if(text.charAt(j) == 'T')
			{
				toReturn.append("A");
			}
			else if(text.charAt(j) == 'G')
			{
				toReturn.append("C");
			}
			else if(text.charAt(j) == 'C')
			{
				toReturn.append("G");
			}
			
//			 TODO: 	B = C or G or T 
//					D = A or G or T 
//					H = A or C or T 
//					K = G or T 
//					M = A or C 
//					N = A or C or G or T 
//					R = A or G 
//					S = C or G 
//					V = A or C or G 
//					W = A or T 
//					Y = C or T
			else if(text.charAt(j) == 'R')
			{
				toReturn.append("R");
			}
			else if(text.charAt(j) == 'Y')
			{
				toReturn.append("Y");
			}
			else if(text.charAt(j) == 'N')
			{
				toReturn.append("N");
			}
		}
		
		return toReturn.toString();
	}
	
	// Scans all cutters
	private static synchronized void scan(String text)
	{
		enzyme = new ArrayList<Integer>();
		index = new ArrayList<Integer>();
		
		// Iterate through all enzymes
		for(int j = 0; j < recognitionSequence.length; j++)
		{
			int counter1 = text.indexOf(recognitionSequence[j]);
			while(counter1 >= 0)
			{
				enzyme.add(j);
				index.add(counter1);
				counter1 = text.indexOf(recognitionSequence[j], counter1 + 1);
			}
			
			int counter2 = text.indexOf(reverse(recognitionSequence[j]));
			while(counter2 >= 0)
			{
				enzyme.add(j);
				index.add(counter2);
				counter2 = text.indexOf(reverse(recognitionSequence[j]), counter2 + 1);
			}
		}
	}
	
	public static String getEnzymeName(int enzymeID)
	{
		return Enzymes.DATA[enzymeID][0];
	}
	
	// Interleave the data?
	public static ArrayList<Integer> getSingleEnzyme(String text)
	{
		scan(text);
//		getEnzyme(text);
//		getIndex(text);
		
		int enzymePos = 0;
		boolean multipleHits = false;
		
		for(int j = 0; j < enzyme.size(); j++)
		{
			multipleHits = false;
			enzymePos = enzyme.get(j);
			
			for(int k = j; k < enzyme.size(); k++)
			{
				if(enzyme.get(k) == enzymePos)
				{
					enzyme.remove(k);
					multipleHits = true;
					k--;
				}
			}
			
			if(multipleHits)
			{
				enzyme.remove(j);
				j--;
			}
		}
		
		for(int j = 0; j < enzyme.size(); j++)
		{
			System.out.println(enzyme.get(j));
		}
		
		return enzyme;
	}
	// Needs to be called right after calling getSingleEnzyme else risk receiving incorrect data
	public static ArrayList<Integer> getSingleIndex(String text)
	{
		return index;
	}
	
	public static ArrayList<Integer> getDoubleCutters(String text)
	{
		return null;
	}
	public static ArrayList<Integer> getTripleCutters(String text)
	{
		return null;
	}
	
	public static ArrayList<Integer> getEnzyme(String text)
	{
		scan(text);
		//getSingleEnzyme(text);
		return enzyme;
	}
	
	public static ArrayList<Integer> getIndex(String text)
	{
		scan(text);
		return index;
	}
}
