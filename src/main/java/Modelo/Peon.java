
package Modelo;

public class Peon extends Pieza {
    private boolean primerMovimiento;

    public Peon(Color color, int x, int y) {
        super(Ttipo.PEON, color, x, y);
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

        if (getColor() == TColor.BLANCO) {
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
        int diffX = Math.abs(posX - getX());
        int diffY = posY - getY();
    
        Pieza piezaEnPosicion = obtenerPiezaEnPosicion(posX, posY); // Método para obtener la pieza en la posición indicada
    
        if (piezaEnPosicion != null) {
            if (getColor() == TColor.BLANCO) {
                return (diffX == 1 && diffY == 1 && piezaEnPosicion.getColor() == TColor.NEGRO);
            } else {
                return (diffX == 1 && diffY == -1 && piezaEnPosicion.getColor() == TColor.BLANCO);
            }
        }
        return false;
    }
}
