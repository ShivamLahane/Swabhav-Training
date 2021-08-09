package com.techlab.model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 	
public class AsyncListener implements ActionListener
{

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Thread thread = new Thread(new AsyncPrinter());
		thread.start();
	}

}
