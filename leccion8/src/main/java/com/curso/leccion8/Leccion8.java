/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.curso.leccion8;

/**
 *
 * @author danie
 */
public class Leccion8 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        suma(2,5);
        suma(14,8);
        suma(14,77);
        System.out.println("la multiplicacion es :"+multiplicacion(3,3));

                                                                        // Pruebas de las nuevas funciones
        resta(10, 3);
        resta(-5, 3); // caso inválido
        System.out.println("la división es :" + division(10, 2));
        System.out.println("la división es :" + division(10, -2)); // caso inválido
    }

    public static void suma(int a,int b){
        if (a < 0 || b < 0) {
            System.out.println("números negativos no están permitidos");
            return;
        }
        int c = a + b;
        System.out.println("la suma es :" + c );
    }

    public static int multiplicacion(int a,int b){
        if (a < 0 || b < 0) {
            System.out.println("números negativos no están permitidos");
            return 0;
        }
        return   a * b;
    }

                                                                 // Nueva función: resta tipo void
    public static void resta(int a, int b) {
        if (a < 0 || b < 0) {
            System.out.println("números negativos no están permitidos");
            return;
        }
        int r = a - b;
        System.out.println("la resta es :" + r);
    }

                                                                  // Nueva función: división flotante
    public static float division(int a, int b) {
        if (a < 0 || b < 0) {
            System.out.println("números negativos no están permitidos");
            return 0f;
        }
        if (b == 0) {
            System.out.println("no se puede dividir entre cero");
            return 0f;
        }
        return (float) a / b;
    }
}
