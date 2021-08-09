package com.techlab.test;

import com.techlab.model.*;

public class ProxyImageTest 
{

	public static void main(String[] args) 
	{
		// expensive objects
		Image image1 = new RealImage("one.jpg");
		Image image2 = new RealImage("two.jpg");
		Image image3 = new RealImage("three.jpg");
		
		image1.display();
		image2.display();
		image3.display();
		
		System.out.println();
		
		// cheap objects
		Image pImage1 = new ProxyImage("pOne.jpg");
		Image pImage2 = new ProxyImage("pTwo.jpg");
		Image pImage3 = new ProxyImage("pThree.jpg");
		
		pImage1.display();
		pImage2.display();
		pImage3.display();
	}

}
