package Modelo;

public class Rey extends Pieza {

    public Rey(Color color, int x, int y) {
        super(TipoPieza.REY, color, x, y);
    }

    @Override
    public void mover(int x, int y) {
        // Implementación del movimiento del rey
        if (validarMovimiento(x, y)) {
            setX(x);
            setY(y);
        } else {
            System.out.println("Movimiento inválido para el rey.");
        }
    }

    @Override
    public boolean validarMovimiento(int x, int y) {
        // Implementación de la validación del movimiento del rey
        int diffX = Math.abs(x - getX());
        int diffY = Math.abs(y - getY());

        return (diffX <= 1 && diffY <= 1);
    }

    @Override
    public boolean isCaptura(int posX, int posY) {
        // Implementación para verificar si el rey puede capturar en la posición (posX, posY)
        return validarMovimiento(posX, posY) && (getColor() != obtenerColorEnPosicion(posX, posY));
    }

    private Color obtenerColorEnPosicion(int x, int y) {
        // Método para obtener el color de la pieza en la posición (x, y)
        // Implementación similar a la utilizada en las clases anteriores
        // ...
    }
}
