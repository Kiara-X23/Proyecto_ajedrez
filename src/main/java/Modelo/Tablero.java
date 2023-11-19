package Modelo;

import java.util.ArrayList;

public class Tablero {
    private Pieza[][] casillas;

    public Tablero() {
        // Inicializar el tablero con 8x8 casillas
        casillas = new Pieza[8][8];
    }

    // Método para imprimir el tablero
    public void imprimirTablero() {
        for (int fila = 0; fila < 8; fila++) {
            for (int columna = 0; columna < 8; columna++) {
                if (casillas[fila][columna] == null) {
                    System.out.print("- "); // Representación de una casilla vacía
                } else {
                    System.out.print(casillas[fila][columna].obtenerSimbolo() + " "); // Obtener símbolo de la pieza
                }
            }
            System.out.println(); // Salto de línea al final de cada fila
        }
    }

    // Método para colocar una pieza en una posición específica del tablero
    public void colocarPieza(Pieza pieza, int fila, int columna) {
        casillas[fila][columna] = pieza;
    }

    // Método para obtener una pieza en una posición específica del tablero
    public Pieza obtenerPieza(int fila, int columna) {
        return casillas[fila][columna];
    }
}
