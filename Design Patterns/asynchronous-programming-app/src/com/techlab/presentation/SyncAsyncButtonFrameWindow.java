package com.techlab.presentation;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.techlab.model.*;

public class SyncAsyncButtonFrameWindow 
{
	
	public SyncAsyncButtonFrameWindow()
	{
		// creating a frame
		
		JFrame frame = new JFrame("Asynchronous programming app");
		frame.setSize(700, 700);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		// creating buttons and add action listener to it
		
		JButton hello = new JButton("Hello");
		hello.setBounds(100, 100, 100, 50);
		hello.addActionListener(new HelloListener());
		hello.setVisible(true);
		
		JButton printSync = new JButton("Print Sync");
		printSync.setBounds(100, 200, 100, 50);
		printSync.addActionListener(new SyncListener());
		printSync.setVisible(true);
		
		JButton printAsync = new JButton("Print Async Time");
		printAsync.setBounds(100, 300, 100, 50);
		printAsync.addActionListener(new AsyncListener());
		printAsync.setVisible(true);
		
		// adding buttons to the frame
		
		frame.add(hello);
		frame.add(printSync);
		frame.add(printAsync);
	}
	
}
