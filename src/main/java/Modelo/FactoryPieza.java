
package Modelo;


public class FactoryPieza {
    
     public Pieza factoryMethod(TipoPieza tipo, Color color, int x, int y) {
        switch (tipo) {
            case PEON:
                return new Peon(color, x, y);
            case TORRE:
                return new Torre(color, x, y);
            case CABALLO:
                return new Caballo(color, x, y);
            case ALFIL:
                return new Alfil(color, x, y);
            case REINA:
                return new Reina(color, x, y);
            case REY:
                return new Rey(color, x, y);
            default:
                throw new IllegalArgumentException("Tipo de pieza desconocido: " + tipo);
        }
    }


}
