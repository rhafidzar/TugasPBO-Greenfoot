import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rocket extends Actor
{
    /**
     * Act - do whatever the rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
       int Turn = Greenfoot.getRandomNumber(5) + 1;
       move(5);
       
       if (isAtEdge()) {
           turn(Greenfoot.getRandomNumber(360));
       }
    }
}
