package com.techlab.model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class SyncListener implements ActionListener
{

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		while (true)
		{
			System.out.println(LocalDateTime.now());
			try 
			{
				TimeUnit.SECONDS.sleep(1);
			} 
			catch (InterruptedException e1) 
			{
				e1.printStackTrace();
			}
		}
	}

}
