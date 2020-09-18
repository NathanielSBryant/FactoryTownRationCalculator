package Building;

import java.util.ArrayList;

public class Recipie {
	
	private Building craftingSource;
	private String recipieName;
	private int craftTime;
	private int ammount;
	private ArrayList<Material> materials;
	private Material recipieOutput;
	
	public Recipie(String name, Building crafter) 
	{
		recipieName = name;
		craftingSource = crafter;
		materials = new ArrayList<Material>();
	}
	
	
	public double calculateCraftTime(double percentageBonus) {
		
		return 1.09;
	}
	
	
	
	
	//Setters 
	
	public void setOutput(Material output , int outputAmmount)
	{
		recipieOutput = output;
		ammount = outputAmmount;
	}
	
	//Getters
	public String getName() {
		
		return recipieName;
		
	}
	
	public Building getCrafter()
	{
		return craftingSource;
	}
	
	public ArrayList<Material> getMaterials()
	{
		return materials;
	}
	

}
