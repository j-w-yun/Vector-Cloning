package com.planner.data;

public class Ladders
{
	public static String[][] size =
		{
			// {NAME_OF_LADDER, FRAGMENT_SIZE...}
			{"GeneRuler 1kb Plus [Fermentas]", "10000", "7000", "5000", "4000", "3000", "2000", "1500", "1000", "700", "500", "400", "300", "200", "75"},
			{"Smart Ladder [Eurogentec]", "10000", "8000", "6000", "5000", "4000", "3000", "2500", "2000", "1500", "1000", "800", "600", "400", "200"},
			{"1 kb DNA Ladder [NEB]", "10000", "8000", "6000", "5000", "4000", "3000", "2000", "1500", "1000", "500"},
			{"1 kb plus DNA Ladder [Invitrogen]", "12000", "9000", "8000", "7000", "6000", "5000", "4000", "3000", "2000", "1650", "1000", "850", "650", "500", "400", "300", "200", "100"},
			{"Lambda HinDIII", "23130", "9416", "6557", "4361", "2322", "2027"}
		};

	public static int getNumFragments(int ladderID)
	{
		return (size[ladderID].length - 1);
	}

	public static String[] getFragments(int ladderID)
	{
		return (size[ladderID]);
	}
	public static String getName(int ladderID)
	{
		return (size[ladderID][0]);
	}
}
