package com.planner.frame;

import java.awt.*;
import javax.swing.*;

public class DrawingPanel extends JPanel
{
	private int vectorSize = 0;
	private int insertSize = 0;
	
	private double vectorScale = 0.0;
	private double insertScale = 0.0;

	private int vRangeLow = -1;
	private int vRangeHigh = -1;
	private int iRangeLow = -1;
	private int iRangeHigh = -1;
	
	public DrawingPanel()
	{
		super();
		setBackground(Color.GRAY);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.WHITE);
		
		if(vectorSize > insertSize)
		{
			vectorScale = 1.0;
			insertScale = (double)insertSize / vectorSize;
		}
		else if(insertSize > vectorSize)
		{
			insertScale = 1.0;
			vectorScale = (double)vectorSize / insertSize;
		}
		else
		{
			vectorScale = 1.0;
			insertScale = 1.0;
		}
		
		g.drawString("Vector", 285, 20);
		g.drawString("Insert", 485, 20);
		
		g.drawString("1", 297, 50);
		g.drawString("1", 497, 50);
		
		g.drawString(String.valueOf(vectorSize), 290, (int)(500 * vectorScale) + 80);
		g.drawString(String.valueOf(insertSize), 490, (int)(500 * insertScale) + 80);
		
		g.drawLine(300, 60, 300 , (int)(500 * vectorScale) + 60);
		g.drawLine(500, 60, 500, (int)(500 * insertScale) + 60);
		
		if(vRangeLow != -1)
		{
			g.drawLine(295, (int)(500 * vectorScale * ((double)vRangeLow / vectorSize)) + 60, 305, (int)(500 * vectorScale * ((double)vRangeLow / vectorSize)) + 60);
		}
		if(vRangeHigh != -1)
		{
			g.drawLine(295, (int)(500 * vectorScale * ((double)vRangeHigh / vectorSize)) + 60, 305, (int)(500 * vectorScale * ((double)vRangeHigh / vectorSize)) + 60);
		}
		if(iRangeLow != -1)
		{
			g.drawLine(495, (int)(500 * vectorScale * ((double)iRangeLow / vectorSize)) + 60, 505, (int)(500 * vectorScale * ((double)iRangeLow / vectorSize)) + 60);
		}
		if(iRangeHigh != -1)
		{
			g.drawLine(495, (int)(500 * vectorScale * ((double)iRangeHigh / vectorSize)) + 60, 505, (int)(500 * vectorScale * ((double)iRangeHigh / vectorSize)) + 60);
		}
		if(vRangeLow != -1 && vRangeHigh != -1 && iRangeLow != -1 && iRangeHigh != -1)
		{
			g.setColor(Color.CYAN);
			g.drawLine(300, (int)(500 * vectorScale * ((double)vRangeLow / vectorSize)) + 60, 500, (int)(500 * vectorScale * ((double)iRangeLow / vectorSize)) + 60);
			g.drawLine(300, (int)(500 * vectorScale * ((double)vRangeHigh / vectorSize)) + 60, 500, (int)(500 * vectorScale * ((double)iRangeHigh / vectorSize)) + 60);
		}
	}
	
	public void mark(int constant, int location)
	{
		if(constant == 1)
		{
			vRangeLow = location;
		}
		else if(constant == 2)
		{
			vRangeHigh = location;
		}
		else if(constant == 3)
		{
			iRangeLow = location;
		}
		else if(constant == 4)
		{
			iRangeHigh = location;
		}
	}
	
	public void update(int vectorSize, int insertSize)
	{
		this.vectorSize = vectorSize;
		this.insertSize = insertSize;
		
		repaint();
	}
}
