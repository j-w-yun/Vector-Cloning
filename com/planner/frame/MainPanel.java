package com.planner.frame;

import java.awt.*;

import javax.swing.*;

import com.planner.utils.Updater;
import com.planner.utils.Updater2;

import java.awt.event.*;

public final class MainPanel extends JPanel
{
	private JTabbedPane tabbedPane = null;
	
	private InputPanel inputPanel = null;
	private ParameterPanel parameterPanel = null;
	private SitePanel sitePanel = null;
	
	private JPanel consolePanel = null;
	
	private static JTextArea console = null;
	private static int consoleLine = 1;
	
	private JButton refresh = null;
	
	MainPanel()
	{
		super(new BorderLayout());

		tabbedPane = new JTabbedPane();

		// Panel #1
		JComponent panel1 = makeInputPanel();
		tabbedPane.addTab("Input Sequence", null, panel1, "");
		tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);

		// Panel #2
		JComponent panel2 = makeParameterPanel();
		tabbedPane.addTab("Parameters", null, panel2, "");
		tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);

		// Panel #3
		JComponent panel3 = makeSitePanel();
		tabbedPane.addTab("Sites", null, panel3, "");
		tabbedPane.setMnemonicAt(2, KeyEvent.VK_3);

		// Panel #4
		JComponent panel4 = makeTextPanel("");
		panel4.setPreferredSize(new Dimension(800, 300));
		tabbedPane.addTab("Tab 4", null, panel4, "");
		tabbedPane.setMnemonicAt(3, KeyEvent.VK_4);

		// Add the tabbed pane to this panel.
		add(tabbedPane, BorderLayout.CENTER);

		// The following line enables to use scrolling tabs.
		tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		
		// Add console
		makeConsolePanel();
		
		// Add sources
		parameterPanel.getUpdateSource(inputPanel);
		sitePanel.getUpdateSource(inputPanel);
		
		// Start thread
		new Updater(inputPanel, parameterPanel).start();
	}
	
	private JPanel makeInputPanel()
	{
		inputPanel = new InputPanel();
		return inputPanel;
	}
	
	private JPanel makeParameterPanel()
	{
		parameterPanel = new ParameterPanel();
		return parameterPanel;
	}
	
	private JPanel makeSitePanel()
	{
		sitePanel = new SitePanel();
		JPanel mainPanel = new JPanel(new BorderLayout());
		refresh = new JButton("Refresh");
		refresh.addActionListener(new ButtonListener());
		
		mainPanel.add(refresh, BorderLayout.SOUTH);
		mainPanel.add(sitePanel, BorderLayout.CENTER);
		return mainPanel;
	}
	
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == refresh)
			{
				new Updater2(sitePanel).start();
			}
		}
	}

	private JComponent makeTextPanel(String text)
	{
		JPanel panel = new JPanel(false);
		JLabel filler = new JLabel(text);
		filler.setHorizontalAlignment(JLabel.CENTER);
		panel.setLayout(new GridLayout(1, 1));
		panel.add(filler);
		return panel;
	}
	
	private void makeConsolePanel()
	{
		// Initialize console
		console = new JTextArea("0   :   Console initialized.\n");
		console.setEditable(false);
		
		// Initialize panel
		consolePanel = new JPanel(new GridLayout(1, 1));
		consolePanel.setPreferredSize(new Dimension(300, 100));
		
		// Add scroll pane and add console to panel
		JScrollPane scroll = new JScrollPane (console, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		consolePanel.add(scroll);
		
		// Add panel to MainPanel
		add(consolePanel, BorderLayout.SOUTH);
	}
	
	public static void println(String text)
	{
		console.append(consoleLine + "   :   " + text + "\n");
		consoleLine++;
		console.setCaretPosition(console.getText().length());
	}
	
	public static void clear()
	{
		console.setText("0 : Console cleared.\n");
		consoleLine = 1;
	}
}
