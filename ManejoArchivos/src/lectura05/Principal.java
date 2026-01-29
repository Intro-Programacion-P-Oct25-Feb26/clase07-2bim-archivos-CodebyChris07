/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lectura05;

/**
 *
 * @author ASUS
 */
public class Principal {
        public static void main(String args[]) {
        Estadistica est = new Estadistica(); 
        
        // Llamada a la función
        double resultado = est.empleadosPromedio();
        
        
        System.out.println("----------------------------------------");
        System.out.println("El promedio de empleados es: " + resultado);
        System.out.println("----------------------------------------");
    }
    
}

