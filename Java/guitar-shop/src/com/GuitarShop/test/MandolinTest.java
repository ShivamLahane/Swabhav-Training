package com.GuitarShop.test;

import com.GuitarShop.model.*;

public class MandolinTest
{

	public static void main(String[] args) 
	{
		Inventory inventory = new Inventory();
		
		InstrumentSpec specs1 = new MandolinSpec(Builder.FENDER, "SN011240", Type.ACCOUSTIC, Wood.MAHOGANY, Wood.MAPLE, Style.A);
		InstrumentSpec specs2 = new MandolinSpec(Builder.COLLINGS, "SN0112210", Type.ACCOUSTIC, Wood.INDIAN_ROSEWOOD, Wood.BRAZILIAN_ROSEWOOD, Style.F);
		InstrumentSpec specs3 = new MandolinSpec(Builder.ANY, "SN0112135210", Type.ELECTRIC, Wood.MAPLE, Wood.MAHOGANY, Style.A);
		
		inventory.addInstrument(new Mandolin(1, specs1, 1500.00));
		inventory.addInstrument(new Mandolin(2, specs2, 1485.85));
		inventory.addInstrument(new Mandolin(3, specs3, 1200.00));
		inventory.addInstrument(new Mandolin(4, specs2, 1450.00));
		inventory.addInstrument(new Mandolin(5, specs1, 1300.00));
		inventory.addInstrument(new Mandolin(6, specs3, 1550.00));
		
		InstrumentSpec toSearchSpecs =  specs1;
		
		for (Instrument guitar : inventory.search(toSearchSpecs))
		{
			MandolinSpec specs = (MandolinSpec) guitar.getSpec();
			System.out.println("Mandolin Id: " + guitar.getId());
			System.out.println("Hello, we have got " + specs.getModel() + "for you.");
			System.out.println("Builder: " + specs.getBuilder().toString());
			System.out.println("Type: " + specs.getType().toString());
			System.out.println("Backwood: " + specs.getBackWood().toString());
			System.out.println("Topwood: " + specs.getTopWood().toString());
			System.out.println("Style: " + specs.getStyle());
			System.out.println("============================^^^^^============================");
		}
	}

}
