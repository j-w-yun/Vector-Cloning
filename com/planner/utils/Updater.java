package com.planner.utils;

import com.planner.frame.*;

public class Updater extends Thread
{
	private InputPanel inputPanel = null;
	private ParameterPanel parameterPanel = null;
	
	public Updater(InputPanel inputPanel, ParameterPanel parameterPanel)
	{
		this.inputPanel = inputPanel;
		this.parameterPanel = parameterPanel;
	}
	public synchronized void run()
	{
		while(true)
		{
			parameterPanel.update();
			inputPanel.update();
			
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
			}
		}
	}
}
