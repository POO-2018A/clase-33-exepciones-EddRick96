/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Ingrese el número de enteros que quiera asignar: ");
            int num = scan.nextInt();
            System.out.println("El número es: " + num);

            int numeros[] = new int[num];
                        
            for(int i = 0; i < num; i++){
                System.out.print("Ingrese el valor en la posición " + (i+1) +" :");
                numeros[i] = scan.nextInt();
            }
            
            System.out.print("Ingrese la posición que desee: ");
            int posicion = scan.nextInt();
            
            System.out.println("La posicion que seleccionó es: " + numeros[posicion-1]);

        } 
        catch (Exception excp1) {
            System.out.println("Por favor, ingrese solo números eso es una letra.");
        } 
        
        //Ejemplo dos
        
        try {

            System.out.print("Ingrese el primer valor: ");
            int dato1 = scan.nextInt();

            System.out.print("Ingrese el segundo valor: ");
            int dato2 = scan.nextInt();
            
            int cociente = dato1/dato2;
            System.out.println("El valor del cociente es: "+ cociente);

        } catch (InputMismatchException  ime) {
            System.out.println("Por favor, ingrese solo números eso es una letra.");
            
        }catch (ArithmeticException ae) {
            System.out.println("No existe división para cero ! :v");
            
        }
    }
    
}
