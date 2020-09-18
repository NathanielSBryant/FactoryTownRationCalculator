package Building;

import java.util.ArrayList;

public class Material {
	private String materialName;
	private ArrayList<Recipie> createdBy;
	
	public Material(String name)
	{
		this.materialName = name;
		createdBy = new ArrayList<Recipie>();
	}
	

	public Material(String name , Recipie creationRecipie)
	{
		this.materialName = name;
		createdBy = new ArrayList<Recipie>();
		createdBy.add(creationRecipie);
	}
	
	//ADD
	
	public void addNewCreationRecipie(Recipie creationRecipie)
	{
		createdBy.add(creationRecipie);
	}
	
	
	
	//Getters 
	public String getName() 
	{
		return materialName;
	}
	
	
	public ArrayList<Recipie> getCraftingMethods()
	{
		return createdBy;
	}
	
	
	
	
}
