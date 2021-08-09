package com.GuitarShop.model;

import java.util.ArrayList;
import java.util.List;

public class Inventory 
{
	private List<Instrument> instruments = new ArrayList<Instrument>();
	
	public void addInstrument(Instrument instrument)
	{
		this.instruments.add(instrument);
	}
	
	public List<Instrument> search(InstrumentSpec spec)
	{
		List<Instrument> matchingGuitars = new ArrayList<Instrument>();
		for (int i = 0; i < instruments.size(); i++) 
		{
				Instrument instrument = instruments.get(i);
				if (instrument.getSpec().matches(spec)) 
				{
					matchingGuitars.add(instrument);
				}
		}
		return matchingGuitars;
	}
}
