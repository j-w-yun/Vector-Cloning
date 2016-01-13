package com.planner.utils;

import java.io.*;
import javax.swing.JFileChooser;
import javax.swing.filechooser.*;

import com.planner.frame.*;

public final class FileIO
{
	public static String load()
	{
		JFileChooser c = new JFileChooser();

		// Set filter to read .txt
		String[] textFile = { ".txt", "txt" };
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Text File", textFile);
		c.setFileFilter(filter);

		int rVal = c.showOpenDialog(c);
		if(rVal == JFileChooser.APPROVE_OPTION)
		{
			return c.getCurrentDirectory().toString() + "\\" + c.getSelectedFile().getName();
		}
		return "";
	}

	public static String save()
	{
		JFileChooser c = new JFileChooser();

		int rVal = c.showSaveDialog(c);
		if(rVal == JFileChooser.APPROVE_OPTION)
		{
			return c.getCurrentDirectory().toString() + "\\" + c.getSelectedFile().getName();
		}
		return "";
	}
	
	public static void save(String fileName, String content)
	{
		try
		{
			PrintWriter writer = new PrintWriter(fileName, "UTF-8");
			writer.println(content);
			writer.close();			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public static String load(String fileName)
	{
		String content = null;
		try
		{
			File file = new File(fileName);
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			while((content = br.readLine()) != null)
			{
				return content;
			}
			fr.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return content;
	}
}
