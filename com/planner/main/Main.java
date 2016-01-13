package com.planner.main;

import java.util.*;

import com.planner.frame.*;
import com.planner.utils.Finder;

public class Main
{
	public static void main(String[] args)
	{
		MainFrame.initialize();
		MainFrame.run();
		
//		ArrayList<Integer> enzyme = Finder.getEnzyme("ccgccgc");
//		ArrayList<Integer> index = Finder.getIndex("ccgccgc");
//		
//		System.out.println(enzyme.size());
//		System.out.println(index.size());
//		
//		for(int j = 0; j < enzyme.size(); j++)
//		{
//			System.out.println("Loc: " + index.get(j) + " / Enzyme : " + enzyme.get(j));
//		}
	}
}
