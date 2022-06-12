import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class CarGreen extends Parent
{
    int speed = 3;
public void act()
{
      CarGreen a = new CarGreen();
      Actor i = getOneIntersectingObject(CarGreen.class);
      move(speed);
      checkDouble(i);
      end();
}

}
