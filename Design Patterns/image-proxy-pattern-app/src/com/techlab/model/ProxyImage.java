package com.techlab.model;

public class ProxyImage implements Image
{
	private String imageName;
	private Image realImage;
	
	public ProxyImage(String image) 
	{
		this.imageName = image;
	}
	
	@Override
	public void display() 
	{
		if (realImage == null)
		{
			realImage = new RealImage(imageName);
		}
		realImage.display();
	}
	
}
