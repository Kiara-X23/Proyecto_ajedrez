package Modelo;

public abstract class Pieza {
    private TipoPieza tipo;
    private Color color;
    private int x;
    private int y;

    public Pieza(TipoPieza tipo, Color color, int x, int y) {
        this.tipo = tipo;
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public abstract void mover(int x, int y);

    public abstract boolean validarMovimiento(int x, int y);

    public abstract boolean isCaptura(int posX, int posY);

    // Getters y setters para obtener y establecer la posición de la pieza
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Otros getters para obtener información sobre la pieza
    public TipoPieza getTipo() {
        return tipo;
    }

    public Color getColor() {
        return color;
    }
}
