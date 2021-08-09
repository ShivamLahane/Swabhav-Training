package com.techlab.model;

import java.io.File;
import java.io.FileWriter;
import java.net.URL;
import java.util.HashSet;
import java.util.Scanner;

public class UrlFileFetcherAndDuplicateRemover 
{
	private File file;
	
	public UrlFileFetcherAndDuplicateRemover(URL url, String fileName) throws Exception
	{
		this.file = new File(fileName);
		Scanner sc = new Scanner(url.openStream());
		HashSet<String> set = new HashSet<String>();
		FileWriter fw = new FileWriter(file);
		while(sc.hasNext())
		{
			String line = sc.next();
			if (!set.contains(line))
			{
				fw.write(line);
				fw.write("\n");
				set.add(line);
			}
		}
		fw.close();
	}
	
	public File getFile()
	{
		return file;
	}
	
}
