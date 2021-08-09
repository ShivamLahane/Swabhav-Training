package com.techlab.test;

import com.techlab.model.*;

public class Test {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		IEmotionable emoMan = new Man();
		emotionalSocial(emoMan);
		emotionalSocial((ISocializable)emoMan);
		System.out.println("\n");
		emotionalSocial(new Infant());
	}

	private static void emotionalSocial(ISocializable obj) 
	{
		// TODO Auto-generated method stub
		obj.depart();
		obj.wish();
	}

	private static void emotionalSocial(IEmotionable obj) 
	{
		// TODO Auto-generated method stub
		obj.cry();
		obj.laugh();
	}

}
