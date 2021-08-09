package com.techlab.test;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.nio.file.Files;

import javax.imageio.ImageIO;

public class Test
{
	public static void main(String[] args) throws Exception 
	{
		File bImage = new File("C:\\Users\\Shivam\\Documents\\Code Stuff\\Java\\image-copying-app\\IronMan.jpg");
		byte byteArray[] = Files.readAllBytes(bImage.toPath());
		byte newArray[] = new byte[byteArray.length];
		for (int i = 0; i < byteArray.length / 2; i++)
		{
			newArray[i] = byteArray[i];
		}
		ByteArrayInputStream ba = new ByteArrayInputStream(newArray);
		BufferedImage copy =ImageIO.read(ba);
		ImageIO.write(copy, "jpg", new File("IronManCopy.jpg"));
		System.out.println("Done");
	}
}
