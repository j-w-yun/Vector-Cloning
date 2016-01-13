package com.planner.frame;

import java.awt.*;
import java.awt.event.KeyEvent;

import javax.swing.*;

import com.planner.utils.*;

public class ParameterPanel extends JPanel
{
	// Parameter panel
	private InputPanel ip = null;
	
	private JTextField vectorSize = null;
	private JTextField insertSize = null;
	
	private JTextField vectorRangeLow = null;
	private JTextField vectorRangeHigh = null;
	
	private JTextField insertRangeLow = null;
	private JTextField insertRangeHigh = null;
	
	private JTextField vectorConcentration = null;
	private JTextField insertConcentration = null;
	
	private JTextField vectorRatio = null;
	private JTextField insertRatio = null;
	
	// Graphic panel
	private DrawingPanel drawingPanel = null;
	
	// Update graphics
	private int vRangeLow = -1;
	private int vRangeHigh = -1;
	private int iRangeLow = -1;
	private int iRangeHigh = -1;
	
	ParameterPanel()
	{
		super(new BorderLayout());
		
		// Create input panel
		JLabel vectorLabel = new JLabel("VECTOR", SwingConstants.CENTER);
		vectorLabel.setFont(new Font("", Font.BOLD, 14));
		vectorLabel.setBorder(BorderFactory.createRaisedSoftBevelBorder());
		JLabel insertLabel = new JLabel("INSERT", SwingConstants.CENTER);
		insertLabel.setFont(new Font("", Font.BOLD, 14));
		insertLabel.setBorder(BorderFactory.createRaisedSoftBevelBorder());
		
		JLabel vectorSize_ = new JLabel("Size (bases)");
		JLabel insertSize_ = new JLabel("");
		
		vectorSize = new JTextField();
		vectorSize.setEditable(false);
		insertSize = new JTextField();
		insertSize.setEditable(false);
		
		JLabel vectorRangeLow_ = new JLabel("Range from");
		JLabel vectorRangeHigh_ = new JLabel("Range to");
		JLabel insertRangeLow_ = new JLabel("Range from");
		JLabel insertRangeHigh_ = new JLabel("Range to");
		
		vectorRangeLow = new JTextField("");
		vectorRangeHigh = new JTextField("");
		insertRangeLow = new JTextField("");
		insertRangeHigh = new JTextField("");
		
		JLabel vectorConcentration_ = new JLabel("Concentration (ng/μl)");
		JLabel insertConcentration_ = new JLabel("");
		
		vectorConcentration = new JTextField("vectorConcentration");
		insertConcentration = new JTextField("insertConcentration");
		
		JLabel vectorRatio_ = new JLabel ("Ratio (mole : mole)");
		JLabel insertRatio_ = new JLabel ("");
		
		vectorRatio = new JTextField("vectorRatio");
		insertRatio = new JTextField("insertRatio");
		
		JPanel parameterInputPanel = new JPanel(new GridLayout(0, 2));
		parameterInputPanel.setBorder(BorderFactory.createEtchedBorder());
		parameterInputPanel.setPreferredSize(new Dimension(250, 600));
		parameterInputPanel.add(vectorLabel);
		parameterInputPanel.add(insertLabel);
		
		parameterInputPanel.add(vectorSize_);
		parameterInputPanel.add(insertSize_);
		parameterInputPanel.add(vectorSize);
		parameterInputPanel.add(insertSize);
		
		parameterInputPanel.add(vectorRangeLow_);
		parameterInputPanel.add(insertRangeLow_);
		parameterInputPanel.add(vectorRangeLow);
		parameterInputPanel.add(insertRangeLow);
		parameterInputPanel.add(vectorRangeHigh_);
		parameterInputPanel.add(insertRangeHigh_);
		parameterInputPanel.add(vectorRangeHigh);
		parameterInputPanel.add(insertRangeHigh);
		
		parameterInputPanel.add(vectorConcentration_);
		parameterInputPanel.add(insertConcentration_);
		parameterInputPanel.add(vectorConcentration);
		parameterInputPanel.add(insertConcentration);
		
		parameterInputPanel.add(vectorRatio_);
		parameterInputPanel.add(insertRatio_);
		parameterInputPanel.add(vectorRatio);
		parameterInputPanel.add(insertRatio);
		
		makeDrawingPanel();
		add(parameterInputPanel, BorderLayout.WEST);
		add(drawingPanel, BorderLayout.CENTER);
	}
	
//	private void makeSequencePanel()
//	{
//		sequencePanel = new SequencePanel();
//		sequencePanel.setBorder(BorderFactory.createEtchedBorder());
//	}
	
	private void makeDrawingPanel()
	{
		drawingPanel = new DrawingPanel();
		drawingPanel.setBorder(BorderFactory.createEtchedBorder());
		drawingPanel.setPreferredSize(new Dimension(800, 600));
	}
	
	public void getUpdateSource(InputPanel ip)
	{
		this.ip = ip;
	}
	
	public synchronized void update()
	{	
		// Show size of sequence
		vectorSize.setText(String.valueOf(ip.getVector().getText().length()));
		insertSize.setText(String.valueOf(ip.getInsert().getText().length()));
		
		// Draw sequence visualization in drawing panel
		drawingPanel.update(ip.getVector().getText().length(), ip.getInsert().getText().length());
		
		// Check range
		if(!vectorRangeLow.getText().equals(""))
		{
			try
			{
				vRangeLow = Integer.parseInt(vectorRangeLow.getText());
				drawingPanel.mark(1, vRangeLow);				
			}
			catch(Exception e)
			{
				MainPanel.println("Lower range for vector sequence needs to be an integer.");
			}
		}
		else
		{
			vRangeLow = -1;
			drawingPanel.mark(1, vRangeLow);
		}
		if(!vectorRangeHigh.getText().equals(""))
		{
			try
			{
				vRangeHigh = Integer.parseInt(vectorRangeHigh.getText());
				drawingPanel.mark(2, vRangeHigh);				
			}
			catch(Exception e)
			{
				MainPanel.println("Higher range for insert sequence needs to be an integer.");
			}
		}
		else
		{
			vRangeHigh = -1;
			drawingPanel.mark(2, vRangeHigh);
		}
		if(!insertRangeLow.getText().equals(""))
		{
			try
			{
				iRangeLow = Integer.parseInt(insertRangeLow.getText());
				drawingPanel.mark(3, iRangeLow);				
			}
			catch(Exception e)
			{
				MainPanel.println("Lower range for insert sequence needs to be an integer.");
			}
		}
		else
		{
			iRangeLow = -1;
			drawingPanel.mark(3, iRangeLow);
		}
		if(!insertRangeHigh.getText().equals(""))
		{
			try
			{
				iRangeHigh = Integer.parseInt(insertRangeHigh.getText());
				drawingPanel.mark(4, iRangeHigh);				
			}
			catch(Exception e)
			{
				MainPanel.println("Higher range for insert sequence needs to be an integer.");
			}
		}
		else
		{
			iRangeHigh = -1;
			drawingPanel.mark(4, iRangeHigh);
		}
	}
}
