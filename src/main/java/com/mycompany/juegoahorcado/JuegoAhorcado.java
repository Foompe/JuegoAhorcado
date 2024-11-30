/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.juegoahorcado;

import java.util.Scanner;

/**
 *
 * @author FP Multip
 * 
 * Objetivo, Hacer un juego de tres en raya que soporte como maximo 5 fallos
 */
public class JuegoAhorcado {

    public static void main(String[] args) {

        int fallos = 0;
       
    }


    /**
     * 
     * @param fallo toma el número de fallos e imprime un mensaje en pantalla
     */
    public void impresionFallos(int fallo) {
        
        int fallos =fallo;
        
        switch (fallos) {
            case 0:
                System.out.println(".-----.");
                System.out.println(".|...|.");
                System.out.println(".O...|.");
                System.out.println("-|-..|.");
                System.out.println("/.\\.|.");
                System.out.println(".....|.");
                System.out.println("-------");
                break;
            case 1:
                System.out.println(".-----.");
                System.out.println(".|...|.");
                System.out.println(".O...|.");
                System.out.println("-|-..|.");
                System.out.println("/....|.");
                System.out.println(".....|.");
                System.out.println("-------");
                break;
            case 2:
                System.out.println(".-----.");
                System.out.println(".|...|.");
                System.out.println(".O...|.");
                System.out.println("-|-..|.");
                System.out.println(".....|.");
                System.out.println(".....|.");
                System.out.println("-------");
                break;
            case 3:
                System.out.println(".-----.");
                System.out.println(".|...|.");
                System.out.println(".O...|.");
                System.out.println("-|...|.");
                System.out.println(".....|.");
                System.out.println(".....|.");
                System.out.println("-------");
                break;
            case 4:
                System.out.println(".-----.");
                System.out.println(".|...|.");
                System.out.println(".O...|.");
                System.out.println(".....|.");
                System.out.println(".....|.");
                System.out.println(".....|.");
                System.out.println("-------");
                break;
            case 5:
                System.out.println(".-----.");
                System.out.println(".....|.");
                System.out.println(".....|.");
                System.out.println(".....|.");
                System.out.println(".....|.");
                System.out.println(".....|.");
                System.out.println("-------");
                break;
        }
    }
}
