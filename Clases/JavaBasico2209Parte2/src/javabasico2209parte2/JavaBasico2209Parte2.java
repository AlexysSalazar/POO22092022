/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico2209parte2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author win10-94
 */
public class JavaBasico2209Parte2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Alma");
        nombres.add("Bartolo");
        nombres.add("Carlos");
        nombres.add("Diana");
        nombres.add("Ernersto");

        for (String nombre : nombres) {
            System.out.println(nombre);

        }

        System.out.println("------");
        Scanner teclado = new Scanner(System.in);
        int selection = teclado.nextInt();

        String elNombre = "";
        try {
            selection = teclado.nextInt();
            elNombre = nombres.get(selection);
        } catch (InputMismatchException ie) {
            System.out.println("Debes teclear valores numericos");
            elNombre = nombres.get(0);
        } catch (IndexOutOfBoundsException ioe) {
            System.out.println("Error debe ser entre 0 y 4");
            elNombre = nombres.get(0);
        }
        System.out.println("Continua el programa...");

        Aritmetica cal = new Aritmetica(2, 4);
        System.out.println(cal.getA() + "+" + cal.getB() + "=" + cal.sumar());
        System.out.println(cal.getA() + "+" + cal.getB() + "=" + cal.dividir());
        System.out.println("Fin del programa");
        
        
        
        Cuadrado cuad = new Cuadrado(5f);
        circulo cir = new circulo(5f);
        System.out.println("");
        System.out.println("");
    }

    
}
