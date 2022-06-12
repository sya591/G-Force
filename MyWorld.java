import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
public MyWorld()
{	
super(1346, 545, 1);
prepare();
}

private void prepare()
{
	CarRed carRed = new CarRed();
	addObject(carRed,460,484);
}

public void act()
{
	if (Greenfoot.getRandomNumber (100)<1)
	{
		addObject(new CarBlue(), Greenfoot.getRandomNumber(275) + 300, 0);
	}

	if (Greenfoot.getRandomNumber (300)<1)
	{
		addObject(new CarGreen(), Greenfoot.getRandomNumber(275) + 300, 0);
	}
	
	if (Greenfoot.getRandomNumber (10)<2)
	{
		addObject(new Tree(), Greenfoot.getRandomNumber(250), 0);
		addObject(new Tree(), Greenfoot.getRandomNumber(250) + 1100, 0);
	}
	
	if (Greenfoot.getRandomNumber (300)<1)
	{
		addObject(new Coin(), Greenfoot.getRandomNumber(275) + 270, 0);
	}

}

}

