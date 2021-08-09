package com.techlab.model;

import java.io.FileWriter;

public interface IDom 
{
	public void render(int level, FileWriter fw) throws Exception;
}
