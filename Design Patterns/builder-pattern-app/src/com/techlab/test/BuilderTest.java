package com.techlab.test;

import com.techlab.model.*;

public class BuilderTest 
{
    public static void main(String[] args)
    {
        HouseBuilder iglooBuilder = new IglooHouseBuilder();
        CivilEngineer engineer = new CivilEngineer(iglooBuilder);
  
        engineer.constructHouse();
  
        House house = engineer.getHouse();
  
        displayHouseDetails(house);
    }
    
    private static void displayHouseDetails(House house)
    {
    	System.out.println("structure : " + house.getStructure());
    	System.out.println("basement : " + house.getBasement());
    	System.out.println("interior" + house.getInterior());
    	System.out.println("roof : " + house.getRoof());
    }
}
