package com.planner.frame;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import com.planner.utils.FileIO;

public class InputPanel extends JPanel
{	
	private JTextArea vector = null;
	private JTextArea insert = null;
	
	private JButton loadVector = null;
	private JButton saveVector = null;
	
	private JButton loadInsert = null;
	private JButton saveInsert = null;
	
	InputPanel()
	{
		super(new BorderLayout());
		
		// Create labels for the input text area
		JLabel vectorLabel = new JLabel("Vector Sequence");
		JLabel insertLabel = new JLabel("Insert Sequence");
		
		JPanel inputLabelPanel = new JPanel(new GridLayout(0, 2));
		inputLabelPanel.add(vectorLabel);
		inputLabelPanel.add(insertLabel);
		
		// Create text area
		vector = new JTextArea("Vector");
		vector.setLineWrap(true);
		vector.setBorder(BorderFactory.createEtchedBorder());
		insert = new JTextArea("Insert");
		insert.setLineWrap(true);
		insert.setBorder(BorderFactory.createEtchedBorder());
		
		JScrollPane scroll_1 = new JScrollPane (vector, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		JScrollPane scroll_2 = new JScrollPane (insert, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		JPanel inputTextPanel = new JPanel(new GridLayout(0, 2));
//		inputTextPanel.setPreferredSize(new Dimension(1100, 300));
		inputTextPanel.add(scroll_1);
		inputTextPanel.add(scroll_2);
		
		// Create options for vector
//		JRadioButton linearVector = new JRadioButton("Linear DNA");
//		linearVector.setSelected(true);
//		JRadioButton circularVector = new JRadioButton("Circular DNA");
//		ButtonGroup groupVector = new ButtonGroup();
//		groupVector.add(linearVector);
//		groupVector.add(circularVector);
		
		// Initialize buttons
		loadVector = new JButton("Load Vector");
		saveVector = new JButton("Save Vector");
		
		// Add action listener
		loadVector.addActionListener(new ButtonListener());
		saveVector.addActionListener(new ButtonListener());
		
		JPanel inputOptionPanel1 = new JPanel(new FlowLayout());
//		inputOptionPanel1.add(linearVector);
//		inputOptionPanel1.add(circularVector);
		inputOptionPanel1.add(loadVector);
		inputOptionPanel1.add(saveVector);
		
		// Create options for insert
		JRadioButton linearInsert = new JRadioButton("Linear DNA");
		linearInsert.setSelected(true);
		JRadioButton circularInsert = new JRadioButton("Circular DNA");
		ButtonGroup groupInsert = new ButtonGroup();
		groupInsert.add(linearInsert);
		groupInsert.add(circularInsert);
		
		// Initialize buttons
		loadInsert = new JButton("Load Insert");
		saveInsert = new JButton("Save Insert");
		
		// Add action listener
		loadInsert.addActionListener(new ButtonListener());
		saveInsert.addActionListener(new ButtonListener());
		
		JPanel inputOptionPanel2 = new JPanel(new FlowLayout());
		inputOptionPanel2.add(linearInsert);
		inputOptionPanel2.add(circularInsert);
		inputOptionPanel2.add(loadInsert);
		inputOptionPanel2.add(saveInsert);
		
		// Panel to hold both options
		JPanel inputOptionPanel = new JPanel(new GridLayout(0, 2));
		inputOptionPanel.add(inputOptionPanel1);
		inputOptionPanel.add(inputOptionPanel2);
		
		add(inputLabelPanel, BorderLayout.NORTH);
		add(inputTextPanel, BorderLayout.CENTER);
		add(inputOptionPanel, BorderLayout.SOUTH);
	}

	public JTextArea getVector()
	{
		return vector;
	}

	public void setVector(JTextArea vector)
	{
		this.vector = vector;
	}

	public JTextArea getInsert()
	{
		return insert;
	}

	public void setInsert(JTextArea insert)
	{
		this.insert = insert;
	}
	
	// Format text
	public void update()
	{
		if(vector.getText().contains(" ") || insert.getText().contains(" "))
		{
			String vectorSequence = vector.getText();
			vectorSequence = vectorSequence.replace(" ", "");
			vector.setText(vectorSequence);
			vector.setCaretPosition(vector.getText().length());
			
			String insertSequence = insert.getText();
			insertSequence = insertSequence.replace(" ", "");
			insert.setText(insertSequence);
			insert.setCaretPosition(insert.getText().length());
			
			MainPanel.println("Space removed");
		}
		
		if(vector.getText().contains("\t") || insert.getText().contains("\t"))
		{
			String vectorSequence = vector.getText();
			vectorSequence = vectorSequence.replace("\t", "");
			vector.setText(vectorSequence);
			vector.setCaretPosition(vector.getText().length());
			
			String insertSequence = insert.getText();
			insertSequence = insertSequence.replace("\t", "");
			insert.setText(insertSequence);
			insert.setCaretPosition(insert.getText().length());
			
			MainPanel.println("Tab removed");
		}
		
		if(vector.getText().contains("\n") || insert.getText().contains("\n"))
		{
			String vectorSequence = vector.getText();
			vectorSequence = vectorSequence.replace("\n", "");
			vector.setText(vectorSequence);
			vector.setCaretPosition(vector.getText().length());
			
			String insertSequence = insert.getText();
			insertSequence = insertSequence.replace("\n", "");
			insert.setText(insertSequence);
			insert.setCaretPosition(insert.getText().length());
			
			MainPanel.println("Nextline removed");
		}
		
		if(vector.getText().contains("a") || vector.getText().contains("t") || vector.getText().contains("g") || vector.getText().contains("c"))
		{
			vector.setText(vector.getText().toUpperCase());
			vector.setCaretPosition(vector.getText().length());			
		}
		
		if(insert.getText().contains("a") || insert.getText().contains("t") || insert.getText().contains("g") || insert.getText().contains("c"))
		{
			insert.setText(insert.getText().toUpperCase());
			insert.setCaretPosition(insert.getText().length());			
		}
		
		// TODO: for insert
	}
	
	// Action listener
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == loadVector)
			{
				MainPanel.println("Loading vector...");
				String fileName = FileIO.load();
				
				if(fileName.equals(""))
				{
					MainPanel.println("Load canceled.");
				}
				else
				{
					MainPanel.println("Loading vector from (" + fileName + ").");					
				}
				
				String vectorText = FileIO.load(fileName);
				
				if(vectorText != null)
				{
					vector.setText(vectorText);					
				}
			}
			else if(e.getSource() == saveVector)
			{
				MainPanel.println("Saving vector...");
				String fileName = FileIO.save();
				
				if(fileName.equals(""))
				{
					MainPanel.println("Save canceled.");
				}
				else
				{
					MainPanel.println("Saving vector to (" + fileName + ").");
				}
				
				FileIO.save(fileName, vector.getText());
			}
			else if(e.getSource() == loadInsert)
			{
				MainPanel.println("Loading insert...");
				String fileName = FileIO.load();
				
				if(fileName.equals(""))
				{
					MainPanel.println("Load canceled.");
				}
				else
				{
					MainPanel.println("Loading insert from (" + fileName + ").");					
				}
				
				String insertText = FileIO.load(fileName);
				
				if(insertText != null)
				{
					insert.setText(insertText);					
				}
			}
			else if(e.getSource() == saveInsert)
			{
				MainPanel.println("Saving insert...");
				String fileName = FileIO.save();
				
				if(fileName.equals(""))
				{
					MainPanel.println("Save canceled.");
				}
				else
				{
					MainPanel.println("Saving insert to (" + fileName + ").");
				}
				
				FileIO.save(fileName, insert.getText());
			}
		}
	}
}
