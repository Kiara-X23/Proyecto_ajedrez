
package Modelo;

public class Peon extends Pieza {
    private boolean primerMovimiento;

    public Peon(Color color, int x, int y) {
        super(TipoPieza.PEON, color, x, y);
        this.primerMovimiento = true;
    }

    @Override
    public void mover(int x, int y) {
        // Implementación del movimiento del peón
        if (validarMovimiento(x, y)) {
            setX(x);
            setY(y);
            primerMovimiento = false;
        } else {
            System.out.println("Movimiento inválido para el peón.");
        }
    }

    @Override
    public boolean validarMovimiento(int x, int y) {
        // Implementación de la validación del movimiento del peón
        int diffX = Math.abs(x - getX());
        int diffY = Math.abs(y - getY());

        if (getColor() == Color.BLANCO) {
            if (diffX == 0 && diffY == 1) {
                return true;
            } else if (primerMovimiento && diffX == 0 && diffY == 2) {
                return true;
            }
        } else { // Para el peón negro
            if (diffX == 0 && diffY == -1) {
                return true;
            } else if (primerMovimiento && diffX == 0 && diffY == -2) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isCaptura(int posX, int posY) {
        // Implementación para verificar si el peón puede capturar en la posición (posX, posY)
        int diffX = Math.abs(posX - getX());
        int diffY = Math.abs(posY - getY());

        if (getColor() == Color.BLANCO) {
            return (diffX == 1 && diffY == 1 && posY - getY() == 1);
        } else { // Para el peón negro
            return (diffX == 1 && diffY == -1 && posY - getY() == -1);
        }
    }
}
