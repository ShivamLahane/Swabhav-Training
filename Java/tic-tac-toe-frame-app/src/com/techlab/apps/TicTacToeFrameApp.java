package com.techlab.apps;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import com.techlab.model.*;

public class TicTacToeFrameApp implements ActionListener
{
	private Game game;
	private JLabel gameStatusLabel;
	private List<JButton> buttons = new ArrayList<JButton>();
	
	public TicTacToeFrameApp(int boardSize , String player1Name, Mark mark1, String player2Name, Mark mark2)
	{
		
		// initialize Game dependencies
		
		Board board = new Board(boardSize);
		ResultAnalyser analyser = new ResultAnalyser(board);
		Player p1 = new Player(player1Name, mark1);
		Player p2 = new Player(player2Name, mark2);
		
		// initializing game 
		
		this.game = new Game(p1, p2, board, analyser);
		
		// creating frame and buttons to it
		JFrame frame = new JFrame();
		frame.setSize(game.getBoard().size() * 100, game.getBoard().size() * 100);
		
		for (int i = 1; i <= Math.pow(game.getBoard().size(), 2); i++)
		{
			JButton button = new JButton(String.valueOf(i));
			button.addActionListener(this);
			frame.add(button);
			buttons.add(button);
		}
		
		frame.setLayout(new GridLayout(game.getBoard().size() + 1, game.getBoard().size()));
		
		JLabel label = new JLabel("your turn " + game.getCurrentPlayer().getName() + ", Result : " + analyser.getResult(), SwingConstants.CENTER);
		label.setFont(new Font(label.getName(),Font.PLAIN ,25));
		this.gameStatusLabel = label;
		frame.add(label);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void disableButtons()
	{
		for (JButton button : buttons)
		{
			button.setEnabled(false);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		try
		{
			int buttonIndex = Integer.parseInt(e.getActionCommand()) - 1;
			buttons.get(buttonIndex).setText(game.getCurrentPlayer().getMark().toString());
			Result result = game.play(buttonIndex);
			
			if (result == Result.Won)
			{
				gameStatusLabel.setText("congratulations " + game.getCurrentPlayer().getName() + " you have won the game.");
				disableButtons();
			}
			else if (result == Result.Draw)
			{
				gameStatusLabel.setText("Game is drawn.");
				disableButtons();
			}
			else
			{
				gameStatusLabel.setText("your turn " + game.getCurrentPlayer().getName() + ", Result : " + game.getAnalyser().getResult().toString());
			}
		}
		catch(Exception e1)
		{
			gameStatusLabel.setText("Cell is already marked.");
		}
	}

}