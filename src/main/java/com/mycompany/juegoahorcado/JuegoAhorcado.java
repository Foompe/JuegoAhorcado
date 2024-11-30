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
        //Declaramos e iniciamos las variables
        boolean continuar = true;
        boolean fallosFin = true;
        int fallo = 0;

        Scanner sc = new Scanner(System.in);

        while (continuar) {
            System.out.println("Bienvenido al ahorcado!! \n"
                    + "Selecciona una opcion:\n  (1) Jugar\n  (2) Salir");
            String eleccion = sc.nextLine();
            char elec = eleccion.charAt(0);

            switch (elec) {
                case '1':
                    System.out.println("Has escogido Jugar");
                    
                    while (fallosFin) {
                        
                    //pedimos la palabra a adivinar
                    System.out.println("Introduce palabra a adivinar");
                    String palabra = sc.nextLine().toLowerCase();
                    System.out.println("Has escogido: " + palabra);
                    
                    //cambiamos los valores de la palabra por incognitas: "x"
                    //1º pasar la palabra a array.¿lo hago en medodo? 
                    
                        System.out.println("Escoge letra: ");
                        String eleccionLetra = sc.nextLine().toLowerCase();
                        char letra = eleccion.charAt(0);
                        
                        
                    
                    fallosFin = contadorFallos(fallo);
                    }
                    break;
                case '2':
                    System.out.println("Has escogido Salir");
                    continuar = false;
                    break;
                default:
                    System.out.println("Elección erronea, escoge de nuevo");
            }

        }

    }

    /**
     *
     * @param fallo toma el número de fallos e imprime un mensaje en pantalla
     */
    public static boolean contadorFallos(int fallo) {

        //introducir un contador de fallos
        int fallos = fallo;
        
        switch (fallos) {
            case 0:
                System.out.println(".-----.");
                System.out.println(".|...|.");
                System.out.println(".O...|.");
                System.out.println("-|-..|.");
                System.out.println("/.\\..|.");
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
        if (fallos >= 5) {
            return false;
        }
        return true;
    }
}
