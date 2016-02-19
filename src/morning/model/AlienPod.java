package morning.model;

import java.awt.Color;

public class AlienPod 
{
	private int amountOfGoo;
	private Color alienColor;
	
	public AlienPod()
	{
		this.amountOfGoo = 1;
		this.alienColor = Color.RED;
	}
	
	public AlienPod(int amountOfGoo, Color alienColor)
	{
		
	}

	public int getAmountOfGoo() 
	{
		return amountOfGoo;
	}

	public void setAmountOfGoo(int amountOfGoo) 
	{
		this.amountOfGoo = amountOfGoo;
	}

	public Color getAlienColor() 
	{
		return alienColor;
	}

	public void setAlienColor(Color alienColor) 
	{
		this.alienColor = alienColor;
	}
	
	public String toString()
	{
		String alienDescription = "This alien pod is " + alienColor + " and has " + amountOfGoo + " tons of goo";
		
		return alienDescription;
	}
}


