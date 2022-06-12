import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Tree extends Parent
{
	int speed = 5;
	public void act()
	{
		Tree a = new Tree();
 		Actor i = getOneIntersectingObject(Tree.class);
		move(speed);
		checkDouble(i);
		end();
	}
}

