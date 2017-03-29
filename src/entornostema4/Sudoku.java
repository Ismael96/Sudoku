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
/**
 * Variables privadas de clase
 */

    private int fila;
    private int columna;
    private String resultadoFinal;
    private boolean resultado;
    private ArrayList<ArrayList<Integer>> lista;
    private Random aleatorio;
/**
 * Constructor por defecto
 */
    public Sudoku() {

        fila = 9;
        columna = 9;
        resultadoFinal = "";
        resultado = true;
        lista = new ArrayList<>();
        aleatorio = new Random();

    }
/**
 * Metodo inciciar
 * @throws SudokuException 
 */
    public void inicializar() throws SudokuException {
        {
            lista = new ArrayList<>();
            aleatorio = new Random();

            try {
                ArrayList<Integer> blanco = new ArrayList<>();
                for (int i = 0; i < 9; i++) {
                    
                    for (int j = 0; j < 9; j++) {
                        blanco.add(0);
                    }
                    lista.add(blanco);
                }

                int i_2 = 0;

                for (;i_2 < 24;) {

                    
                    int vertical = aleatorio.nextInt(9-1)+1;

                    int horizontal = aleatorio.nextInt(9-1)+1;

                    int aleatorio2 = aleatorio.nextInt(9-1)+1;

                    i_2++;
                }
            } catch (Exception e) {
                System.out.println("Error:" + e.toString());
            }

        }
    }
/**
 * To string
 * @return 
 */
    @Override
    public String toString() {
        String resultadoFinal = "";

        try {
            for (int i = 0; i < lista.size(); i++) {

                for (int i_2 = 0; i_2 < 9; i_2++) {

                    int numero = lista.get(i).get(i_2);

                    resultadoFinal += (numero + "");
                }
                resultadoFinal = ("\n");

            }

        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        }
        return resultadoFinal;
    }

    
/**
 * Comprobar fila
 * @param fila
 * @param elemento
 * @return
 * @throws SudokuException 
 */
    private boolean comprobarFila(int fila, int elemento) throws SudokuException {
        boolean resultado = true;
        try {
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(fila).get(i) == elemento) {

                    resultado = false;
                }
            }

        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        }

        return resultado;
    }
/**
 * Comprobar columna
 * @param columna
 * @param elemento
 * @return
 * @throws SudokuException 
 */
    private boolean comprobarColumna(int columna, int elemento) throws SudokuException {
        boolean resultado = true;
        try {
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(columna).get(i) == elemento) {

                    resultado = false;
                }
            }

        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        }
        return resultado;
    }
/**
 * comprobar cuadrante
 * @param fila
 * @param columna
 * @param elemento
 * @return
 * @throws SudokuException 
 */
    private boolean comprobarCuadrante(int fila, int columna, int elemento) throws SudokuException {
        boolean resultado = true;
        int c_1 = 0;
        int c_2 = 0;

        int f_1 = 0;
        int f_2 = 0;
        try {
            if (fila >= 0 && fila <= 2) {
                f_1 = 0;
                
                f_2 = 2;
            }
            if (fila >= 3 && fila <= 5) {
                f_1 = 3;
                
                f_2 = 5;
            }
            if (fila >= 6 && fila <= 8) {
                f_1 = 6;
                
                f_2 = 8;
            }

            if (columna >= 0 && columna <= 2) {
                c_1 = 0;
                
                c_2 = 2;
            }
            if (columna >= 3 && columna <= 5) {
                c_1 = 0;
                
                c_2 = 2;
            }
            if (columna >= 6 && columna <= 8) {
                c_1 = 0;
                
                c_2 = 2;
            }

            for (int i = f_1; i < f_2; i++) 
            {
                for (int p = c_1; p < c_2; p++)
                {
                    
                    if (lista.get(i).get(p) == elemento) 
                    {
                        if (columna >= 0 && columna <= 2) 
                        
                        {
                         resultado = false;
                        }

                    }
                }
            }
        } 
        catch (Exception e) {
            System.out.println("Error:" + e.toString());
        }
        return resultado;
    }
/**
 * Metodo insertar
 * @param fila
 * @param columna
 * @param elemento
 * @return
 * @throws SudokuException 
 */
    private boolean puedoInsertar(int fila, int columna, int elemento) throws SudokuException {
        boolean resultado = false;
        
        try{
        if(comprobarFila(fila, elemento)==true)  
        {
           
             if(comprobarColumna(columna, elemento)==true)
             {
                if (comprobarCuadrante(fila, columna, elemento)==true)
                    {
                        resultado = true; 
                    }
             }
        }
     
      
        }
        catch (Exception e) {
            System.out.println("Error:" + e.toString());
        }
        return resultado;
    }

    /**
     * Metodo modificar elemento
     * @param fila
     * @param columna
     * @param elemento
     * @throws SudokuException 
     */
    public void modificarElemento(int fila, int columna, int elemento) throws SudokuException {
      
    }
    /**
     * Metodo vaciar casilla
     * @param fila
     * @param columna
     * @throws SudokuException 
     */
    public void vaciarElemento(int fila, int columna) throws SudokuException {
        try {
            lista.get(fila-1).set(columna-1,0);
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        }
    }
}
