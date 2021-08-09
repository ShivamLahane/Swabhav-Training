package com.techlab.model;

public class Game 
{
	private Player player1;
	private Player player2;
	private Board board;
	private ResultAnalyser analyser;
	private Player currentPlayer;
	private int noOfMoves = 0;
	
	public Game(Player player1, Player player2, Board board, ResultAnalyser analyser)
	{
		this.player1 = player1;
		this.player2 = player2;
		this.board = board;
		this.analyser = analyser;
		this.currentPlayer = player1;
	}
	
	public int getMovesCount()
	{
		return noOfMoves;
	}
	
	public Player getCurrentPlayer()
	{
		return currentPlayer;
	}
	
	public Player changeTurn()
	{
		if(currentPlayer.equals(player1)) currentPlayer = player2;
		else currentPlayer = player1;
		return currentPlayer;
	}
	
	public Result play(int index) throws CellAlreadyMarkedException
	{
		board.markCell(index, currentPlayer.getMark());
		noOfMoves++;
		if (noOfMoves >= board.size()) 
		{
			analyser.checkResult();
		}
		if (analyser.getResult() == Result.ONGOING)
		{
			changeTurn();
		}
		return analyser.getResult();
	}
	
	public Player getPlayer1() 	
	{
		return player1;
	}

	public Player getPlayer2()
	{
		return player2;
	}

	public Board getBoard() 
	{
		return board;
	}

	public ResultAnalyser getAnalyser() 
	{
		return analyser;
	}
	
}
