package com.test;

import java.io.FileReader;
import java.util.Properties;
import com.model.*;

public class Test
{
	public static void main(String[] args) throws Exception 
	{
	    FileReader reader= new FileReader("C:\\Users\\Shivam\\Documents\\Code Stuff\\Design Patterns\\factory-method-ocp-using-property-files\\src\\com\\test\\External.properties");  
	    Properties p=new Properties();  
	    p.load(reader); 
	    Class<?> factory = (Class<IAutomobileFactory>) Class.forName(p.getProperty("automobile"));
	    IAuto auto1 = ((IAutomobileFactory) factory.newInstance()).make();
		auto1.start();
		auto1.stop();
		auto1.getName();
		auto1.printHashCode();
	    IAuto auto2 = ((IAutomobileFactory) factory.newInstance()).make();
		auto2.start();
		auto2.stop();
		auto2.getName();
		auto2.printHashCode();
	}
}
