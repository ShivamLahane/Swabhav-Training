package com.techlab.test;

import javax.swing.*;
import com.techlab.model.*;

public class Test 
{

	public static void main(String[] args) 
	{
		// creating a frame
		
		JFrame frame = new JFrame("Changable bg-color frame.");
		frame.setSize(400, 400);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// creating Listeners for each button.
		
		RedListener redListener = new RedListener();
		redListener.setFrame(frame);
		
		BlueListener blueListener = new BlueListener();
		blueListener.setFrame(frame);
		
		GreenListener greenListener = new GreenListener();
		greenListener.setFrame(frame);
		
		// creating red button
		
		JButton redButton = new JButton("Red");
		redButton.setBounds(100, 100, 100, 50);
		redButton.addActionListener(redListener);
		redButton.setVisible(true);
		
		// creating blue button
		
		JButton blueButton = new JButton("Blue");
		blueButton.setBounds(100, 200, 100, 50);
		blueButton.addActionListener(blueListener);
		blueButton.setVisible(true);
		
		// creating green button
		
		JButton greenButton = new JButton("Green");
		greenButton.setBounds(100, 300, 100, 50);
		greenButton.addActionListener(greenListener);
		greenButton.setVisible(true);
		
		// adding buttons to the frame
		frame.add(redButton);
		frame.add(blueButton);
		frame.add(greenButton);
		frame.setVisible(true);
	}

}
