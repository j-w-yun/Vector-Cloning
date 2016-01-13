package com.planner.utils;

import com.planner.frame.*;

public class Updater2 extends Thread
{
	private SitePanel sitePanel = null;
	
	public Updater2(SitePanel sitePanel)
	{
		this.sitePanel = sitePanel;
	}
	public synchronized void run()
	{
		sitePanel.update();
		
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
		}
	}
}
