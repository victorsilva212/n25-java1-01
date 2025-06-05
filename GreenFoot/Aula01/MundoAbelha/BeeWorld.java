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
        addObject(aranha,28,31);
        Abelha abelha = new Abelha();
        addObject(abelha,24,185);
        Mosca mosca = new Mosca();
        addObject(mosca,30,272);
        Mosca mosca2 = new Mosca();
        addObject(mosca2,32,379);
        Mosca mosca3 = new Mosca();
        addObject(mosca3,87,326);
        Mosca mosca4 = new Mosca();
        addObject(mosca4,154,268);
        Mosca mosca5 = new Mosca();
        addObject(mosca5,151,380);
    }
}
