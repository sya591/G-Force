import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class CarRed extends Actor{
    
    int score = 0;
    int delay = 0;
    public void act(){
        getWorld ().showText("Score : " + score, 70,30);
        checkKey();
        addscore();
        end();
        sound();
    }
    
    public void checkKey(){
        
        if(Greenfoot.isKeyDown("left")){
            if(getX()>= 215){
                setLocation(getX()-2, getY());
                
            }
        }
        if(Greenfoot.isKeyDown("right")){
            if(getX()<= 700){
                setLocation(getX() +2, getY());
             }
    
         }
        if(Greenfoot.isKeyDown("up")){
                setLocation(getX(), getY() -2);
        }
        if(Greenfoot.isKeyDown("down")){
                setLocation(getX(), getY() +2);
        }
        
        
   }
    
      public void end(){
          if(isTouching(CarBlue.class)||isTouching(CarGreen.class)){
              getWorld().showText("Game Over! \n Score : " + score, 632, 270);
              Greenfoot.stop();
          }
   
      }
      public void sound(){
          if(isTouching(CarBlue.class) || isTouching(CarGreen.class)){
              delay++;
              getWorld().addObject(new Blast(), getX(), getY());
              delay = 0;
              Greenfoot.playSound("Explosion Sound Effect.mp3");
          }
      }
      
      public void addscore (){
          if (isTouching(Coin.class)){
              score = score + 5;
              removeTouching(Coin.class);
          }
        
    }
      
     
}
