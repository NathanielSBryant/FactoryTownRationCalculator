package Building;

import java.util.ArrayList;

public class Building {
	
	private ArrayList<Recipie> recipies;
	private String name;
	
	Building(String buildingName)
	{
		name = buildingName;
		recipies = new ArrayList<Recipie>();
	}
	
	
	
	
	//ADDERS
	
	public void addRecipie(Recipie newRecipie) 
	{
		recipies.add(newRecipie);
	}
	
	
	//GETTERS 
	
	
	public String getName()
	{
		return name;
	}
	
	public ArrayList<Recipie> getRecipies()
	{
		return recipies;
	}
}
