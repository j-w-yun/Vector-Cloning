package com.planner.frame;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import com.planner.utils.Updater;

public final class MainFrame
{
	private static JFrame mf = null;

	public static void initialize()
	{
		// Create a static instance of the JFrame
		mf = new JFrame("Restriction Planner");

		// Create menu bar and add items
		initializeMenuBar();
		
		// Create tabbed panels
		mf.add(new MainPanel());
	}

	public static void run()
	{
		// Pack the panels
		mf.pack();

		// Center the window
		centerWindow();

		// Finalize and display
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mf.setVisible(true);
	}

	private static void initializeMenuBar()
	{
		JMenuBar menubar = new JMenuBar();

		// Tabs shown in the menu
		JMenu file = new JMenu("File");
		JMenu about = new JMenu("About");

		// Dropdown item
		JMenuItem fMenuItem_1 = new JMenuItem("Exit", null);
		fMenuItem_1.setMnemonic(KeyEvent.VK_E);
		fMenuItem_1.setToolTipText("Exit application");
		fMenuItem_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent event)
			{
				System.exit(0);
			}
		});

		// Dropdown item
		JMenuItem aMenuItem_1 = new JMenuItem("Developers", null);
		aMenuItem_1.setMnemonic(KeyEvent.VK_D);
		aMenuItem_1.setToolTipText("Show developers");
		aMenuItem_1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				JOptionPane.showMessageDialog(
					null,
					"Venkatachari, Narasimhan Jayanth\nYun, Jaewan",
					"Developers",
					-1);
			}
		});

		// Add items to tabs
		file.add(fMenuItem_1);
		about.add(aMenuItem_1);

		// Add tabs to menu
		menubar.add(file);
		menubar.add(about);

		// Add menu to JFrame
		mf.setJMenuBar(menubar);
	}

	private static void centerWindow()
	{
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	    int x = (int) ((dimension.getWidth() - mf.getWidth()) / 2);
	    int y = (int) ((dimension.getHeight() - mf.getHeight()) / 2);
	    mf.setLocation(x, y);
	}
}
