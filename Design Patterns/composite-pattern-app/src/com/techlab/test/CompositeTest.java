package com.techlab.test;

import com.techlab.model.*;

public class CompositeTest 
{

	public static void main(String[] args) 
	{
		Folder root = new Folder("Movies");
		root.addChildren(new File("The Matrix", 1200, ".mp4"));
		Folder comedyMovies = new Folder("Comedy Movies");
		root.addChildren(comedyMovies);
		comedyMovies.addChildren(new File("Hera Pheri", 2000, ".amv"));
		comedyMovies.addChildren(new File("Welcome", 1400, ".mp4"));
		root.display();
	}

}
