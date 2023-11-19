
package Modelo;


public class Reina extends Pieza {

    public Reina(Color color, int x, int y) {
        super(TipoPieza.REINA, color, x, y);
    }

    @Override
    public void mover(int x, int y) {
        // Implementación del movimiento de la reina
        if (validarMovimiento(x, y)) {
            setX(x);
            setY(y);
        } else {
            System.out.println("Movimiento inválido para la reina.");
        }
    }

    @Override
    public boolean validarMovimiento(int x, int y) {
        // Implementación de la validación del movimiento de la reina
        int diffX = Math.abs(x - getX());
        int diffY = Math.abs(y - getY());

        return (diffX == 0 && diffY > 0) || (diffX > 0 && diffY == 0) || (diffX == diffY);
    }

    @Override
    public boolean isCaptura(int posX, int posY) {
        // Implementación para verificar si la torre puede capturar en la posición (posX, posY)
        return (validarMovimiento(posX, posY) && (getColor() != obtenerColorEnPosicion(posX, posY)));
    }

    private Color obtenerColorEnPosicion(int x, int y) {
        // Método para obtener el color de la pieza en la posición (x, y) si hay alguna
        // Por simplicidad, asumiré que existe una clase Tablero con un método obtenerPieza()
        // que devuelve la pieza en una posición específica
        // Este método puede variar según cómo se implemente la lógica en tu proyecto

        Pieza pieza = Tablero.obtenerPieza(x, y); // Reemplaza Tablero.obtenerPieza() con el método correspondiente en tu proyecto

        if (pieza != null) {
            return pieza.getColor();
        }
        return null; // Si no hay ninguna pieza en esa posición
    }
}
