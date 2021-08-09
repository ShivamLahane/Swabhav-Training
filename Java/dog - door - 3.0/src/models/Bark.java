package models;

public class Bark
{
	private String sound;
	
	public Bark(String barkSound)
	{
		sound = barkSound;
	}
	
	public String getSound()
	{
		return sound;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Bark bark = (Bark) obj;
		if (this.getSound().equals(bark.getSound())) return true;
		else return false;
	}
}
