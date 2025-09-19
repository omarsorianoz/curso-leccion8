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
    }
    public static void suma(int a,int b){
        int c = a + b;
        System.out.println("la suma es :" + c );
    }
    public static int multiplicacion(int a,int b){
        return   a * b;
    }
            
}
