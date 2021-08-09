package com.techlab.model;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class GreenListener implements ActionListener
{
	private JFrame frame;
	
	public void setFrame(JFrame frame)
	{
		this.frame = frame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		frame.getContentPane().setBackground(Color.GREEN);
	}
	
}
