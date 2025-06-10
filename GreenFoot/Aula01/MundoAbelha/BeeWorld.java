import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Definição da classe BeeWorld.
 * 
 * @author Victor
 * @version 2025-06-04
 */
public class BeeWorld extends World
{

    /**
     * Constructor for objects of class BeeWorld.
     * 
     */
    public BeeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Aranha aranha = new Aranha();
        addObject(aranha,32,33);
        
        Abelha abelha = new Abelha();
        addObject(abelha,45,152);
        
        for (int qtd=0;qtd<20;qtd++){
            int posX = Greenfoot.getRandomNumber(800); 
            int posY = Greenfoot.getRandomNumber(600);
            int vel = Greenfoot.getRandomNumber(360)+1; addObject(new Mosca(vel,rot ),posX,posY);
        }
    }
}
