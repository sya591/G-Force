import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class CarBlue extends Parent
{
int speed = 3; 
public void act()
{
      		CarBlue a = new CarBlue();
     		 Actor i = getOneIntersectingObject(CarBlue.class);
     		 move(speed);
     		 checkDouble(i);
     		 end();
}
}

