package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class Door 
{
	private boolean open;
	private List<Bark> allowedBarks = new ArrayList<Bark>();
	
	public List<Bark> getAllowedBarks()
	{
		return allowedBarks;
	}
	
	public void addAllowedBark(Bark bark)
	{
		allowedBarks.add(bark);
	}
	 
	public Door()
	{
		open = false;
	}
	
	public boolean isOpen()
	{
		return open;
	}
	
	public void open()
	{
		open = true;
		final Timer timer = new Timer();
		timer.schedule(
		new TimerTask() { @Override public void run() {	close(); } }, 5);
	}

	public void close() 
	{
		open = false;
	}
}
