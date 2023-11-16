

package Modelo;

public abstract class Pieza {
    private String tipo;
    private String color;
    private int posX;
    private int posY;
    
    
     
    public Pieza(String tipo, String color, int posX, int posY) {
        this.tipo = tipo;
        this.color = color;
        this.posX = posX;
        this.posY = posY;
    }
    
 
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public int getPosX() {
        return posX;
    }
    
    public void setPosX(int posX) {
        this.posX = posX;
    }
    
    public int getPosY() {
        return posY;
    }
    
    public void setPosY(int posY) {
        this.posY = posY;
    }
  
    public boolean validarMovimiento(int nuevaPosX, int nuevaPosY) {
        
        return true; 
    }
    
    

}


    
    
    

    
   