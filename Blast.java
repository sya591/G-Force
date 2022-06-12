import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Blast extends Parent
{
    int delay=0;
public void act()
{
   delay++;
if(delay==0)
getWorld().removeObject(this);
}

}
