package models;

public class Keypad 
{
	private String code;
	private Door door;
	
	public Keypad(String code, Door door)
	{
		this.code = code;
		this.door = door;
	}
	
	public void matchAndLockOrUnlock(String inputCode) throws Exception
	{
		if (code.equals(inputCode)) door.doOpenOrClose();
		else throw new CodeDoesntMatchException();
	}
}
