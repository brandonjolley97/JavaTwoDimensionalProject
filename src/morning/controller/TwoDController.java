package morning.controller;

import morning.model.AlienPod;
import morning.view.TwoDFrame;
import java.awt.Color;
import javax.swing.JFrame;

public class TwoDController 
{
	private TwoDFrame baseFrame;
	private AlienPod[][] myAlienPod;
	
	public TwoDController()
	{
		myAlienPod = new AlienPod[3][3];
		setupArray();
		baseFrame = new TwoDFrame(this);
	}
	
	public void start()
	{
		
	}
	
	private void setupArray()
	{
		for(int row = 0;row < myAlienPod.length;row++)
		{
			for(int col = 0;col < myAlienPod[0].length;col++)
			{
				myAlienPod[row][col] = new AlienPod();
				if(col % 2 == 0)
				{
					myAlienPod[row][col].setAmountOfGoo(col + 5);
				}
				else
				{
					myAlienPod[row][col].setAlienColor(Color.BLUE);
				}
			}
		}
	}
	
	public AlienPod [][] getMyAlienPod()
	{
		return myAlienPod;
	}
}
