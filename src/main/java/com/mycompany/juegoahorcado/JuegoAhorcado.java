/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.juegoahorcado;

import java.util.Scanner;
import java.util.Arrays;

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
        int fallo = 0;

        Scanner sc = new Scanner(System.in);

        while (continuar) {

            //Declaramos e inicializamos los controladores de los siguientes bucles.
            boolean fallosFin = true;
            boolean ganador = false;

            System.out.println("Bienvenido al ahorcado!! \n"
                    + "Selecciona una opcion:\n  (1) Jugar\n  (2) Salir");
            String eleccion = sc.nextLine();
            char elec = eleccion.charAt(0);

            switch (elec) {
                case '1':
                    System.out.println("Has escogido Jugar");

                    //pedimos la palabra a adivinar, la escaneamos y la pasamos a minusculas.
                    System.out.println("Introduce palabra a adivinar");
                    String palabra = sc.nextLine().toLowerCase();
                    System.out.println("Has escogido: " + palabra);

                    //Pasamos el string a un array de tipo char
                    char[] caracteres = palabra.toCharArray();

                    //a traves de un metodo creamos un array de incognitas
                    char[] incognitas = pasoIncognitas(caracteres);

                    System.out.println("\nEmpezemos el juego: \n");
                    
                    
                    while (fallosFin && (!ganador)) {
                        palabraIncognita(incognitas);
                        System.out.println("\nFallos: " + fallo);

                        //pedimos la letra
                        System.out.println("\nEscoge letra: ");
                        String eleccionLetra = sc.nextLine().toLowerCase();
                        char letra = eleccionLetra.charAt(0);
                        System.out.println("\nHas escogido la letra: " + letra);

                        //miramos si la palabra contiene la letra (pasamos de char a string) 
                        if (palabra.contains(Character.toString(letra))) {

                            System.out.println("\nHas acertado!!\n");
                            for (int i = 0; i < incognitas.length; i++) {
                                char compara = caracteres[i];

                                //Si el valor que señala el indice tiene el mismo valor que la palabra
                                if (compara == letra) {
                                    incognitas[i] = letra;

                                    ganador = buscaGanador(incognitas);
                                    if (ganador) {
                                        System.out.println("\n ------------\n| HAS GANADO |\n ------------\n");
                                    }
                                }
                            }

                        } else { //si no tiene la letra sumamos un fallo
                            System.out.println("No posee esa letra!\nTe quedan: " + (4 - fallo) + " intentos");
                            ++fallo;
                            //muestra la figura del ahorcado
                            fallosFin = contadorFallos(fallo);
                            if (!fallosFin) {
                                System.out.println("\n -------------\n| HAS PERDIDO |\n -------------\n");
                            }
                        }
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
     * Metodo para imprimir correctamente la palabra en incognita
     * @param incognita Toma el array de la palabra pasada a incognita
     */    
    public static void palabraIncognita(char[] incognita) {
        System.out.print("Palabra: ");
        for (int i = 0; i < incognita.length; i++) {
            System.out.print(incognita[i]);
    }
    }

    /**
     * Metodo que comprueba si quedan incognitas que resolver
     *
     * @param palabraAResolver Toma el array de incognitas
     * @return devuelve true si hay ganador y false si no lo hay
     */
    public static boolean buscaGanador(char[] palabraAResolver) {

        for (int i = 0; i < palabraAResolver.length; i++) {
            char comparador = palabraAResolver[i];
            if (comparador == 'x') {
                return false;
            }
        }
        return true;
    }

    /**
     * Este metodo toma un array y devuelve otro de la misma longitud pero con x
     *
     * @param palabra toma la palabra pasada a lista de caracteres tomada del
     * usuario
     * @return Devuelve la palabra hecha incognita en forma de lista de
     * caracteres
     */
    public static char[] pasoIncognitas(char[] palabra) {
        //creamos un array tipo  char con la misma longitud que el array tomado
        char[] x = new char[palabra.length];
        //recorremos todas las posiciones del array dando un valor a cada uno
        for (int i = 0; i < x.length; i++) {
            x[i] = 'x';
        }
        //devolvemos el nuevo array con los valores añadidos.
        return x;
    }

    /**
     * Metodo para contar fallos y mostrar "El estado del ahorcado"
     *
     * @param fallo toma el número de fallos e imprime un mensaje en pantalla
     * @return si los fallos llegan a 5 devuelve un false
     */
    public static boolean contadorFallos(int fallo) {

        switch (fallo) {
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
        if (fallo >= 5) {
            return false;
        }
        return true;
    }
}
