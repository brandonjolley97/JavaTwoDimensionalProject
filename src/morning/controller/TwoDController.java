package morning.controller;

import morning.model.AlienPod;

public class TwoDController 
{
	private TwoDFrame baseFrame;
	private AlienPod[][] myAlienPod;
	
	public TwoDController()
	{
		myAlienPod = new AlienPod[3][3];
		baseFrame = new TwoDFrame(this);
	}
	
	public void start()
	{
		setupArray();
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
					myAlienPod[row][col]
				}
				else
				{
					
				}
			}
		}
	}
	
	public AlienPod [][] getMyAlienPods()
	{
		return myAlienPod;
	}
}
