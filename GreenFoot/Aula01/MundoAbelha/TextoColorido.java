import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TextoColorido here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TextoColorido extends Actor
{
    private final String FONTE = "Arial";
    //Constructor
    public TextoColorido(String texto, int pX, int pY, int tam, Color corTexto, Color corFundo){
        
        mostrarTexto(texto, pX, pY, tam, corTexto, corFundo);
    }
    
    public void mostrarTexto(String texto, int pX, int pY, int tam, Color corTexto, Color corFundo){
        GreenfootImage img = new GreenfootImage(
        texto, tam, corTexto, corFundo
        );
        setLocation(pX, pY);
        setImage(img);
    }
}
