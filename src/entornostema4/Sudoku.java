/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entornostema4;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author ICC-ICZ
 */
public class Sudoku {
// Variables privadas de la clase

    private int fila;
    private int columna;
    private String resultadoFinal;
    private boolean resultado;
    private ArrayList<ArrayList<Integer>> lista;
    private Random aleatorio;

    public Sudoku() {
        
        fila=9;
        columna=9;
        resultadoFinal="";
        resultado=true;
        lista = new ArrayList<>();
        aleatorio = new Random();
        
    }

    public void inicializar() {
    }

    @Override
    public String toString() {
        String resultadoFinal = "";
        return resultadoFinal;
    }

    public void modificarElemento(int fila, int columna, int elemento) throws SudokuException {
    }

    public void vaciarElemento(int fila, int columna) {
    }

    private boolean comprobarFila(int fila, int elemento) {
        boolean resultado = true;
        return resultado;
    }

    private boolean comprobarColumna(int columna, int elemento) {
        boolean resultado = true;
        return resultado;
    }

    private boolean comprobarCuadrante(int fila, int columna, int elemento) {
        boolean resultado = true;
        return resultado;
    }

    private boolean puedoInsertar(int fila, int columna, int elemento) {
        boolean resultado = false;
        return resultado;
    }
}
