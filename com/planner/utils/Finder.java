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
		enzyme = new ArrayList<Integer>();
		index = new ArrayList<Integer>();
		
		recognitionSequence = new String[Enzymes.DATA.length];
		
		for(int j = 0; j < Enzymes.DATA.length; j++)
		{
			recognitionSequence[j] = Enzymes.DATA[j][1].toUpperCase();
		}
	}
	
	private static synchronized void scan(String text)
	{
		enzyme.clear();
		index.clear();
		
		// Iterate through all enzymes
		for(int j = 0; j < recognitionSequence.length; j++)
		{
			int counter = text.indexOf(recognitionSequence[j]);
			while(counter >= 0)
			{
				enzyme.add(j);
				index.add(counter);
				counter = text.indexOf(recognitionSequence[j], counter + 1);
			}
			
			
//			// Soln #2
//			if(text.contains(recognitionSequence[j]))
//			{
//				enzyme.add(j);
//				index.add(text.indexOf(recognitionSequence[j]));
//			}
			
//			// Iterate through all bases
//			for(int k = 0; k < text.length(); k++)
//			{
//				if(text.charAt(k) == recognitionSequence[j].charAt(enzIndex))
//				{
//					enzIndex++;
//					
//					// Termination condition
//					if(enzIndex == recognitionSequence[j].length())
//					{
//						enzyme.add(j);
//						index.add(k - (enzIndex - 1));
//						
//						k -= (enzIndex - 1);
//						enzIndex = 0;
//					}
//				}
//				else
//				{
//					enzIndex = 0;
//				}
//			}
//			enzIndex = 0;
		}
	}
	
	public static String getEnzymeName(int enzymeID)
	{
		return Enzymes.DATA[enzymeID][0];
	}
	
	public static ArrayList<Integer> getEnzyme(String text)
	{
		scan(text);
		return enzyme;
	}
	
	public static ArrayList<Integer> getIndex(String text)
	{
		scan(text);
		return index;
	}
}
