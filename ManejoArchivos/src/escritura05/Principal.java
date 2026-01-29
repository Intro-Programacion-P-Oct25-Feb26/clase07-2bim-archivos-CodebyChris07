/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritura05;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Principal {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        String cadenaFinal = "";
        boolean salida = true;
        String respuesta = "si";

        while (salida) {

            System.out.println("Ingrese su nombre");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese su la marca de carro");
            String apellido = entrada.nextLine();
            System.out.println("Ingrese la placa");
            int edad = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Ingrese (si) si termino de añadir datos");
            respuesta = entrada.nextLine();
            if (respuesta == "si") {
                salida = false;

            }

            cadenaFinal = String.format("%s%s %s %d\n", cadenaFinal,
                    nombre,
                    apellido, edad);

            Texto.agregarRegistros(cadenaFinal);
        }
    } // fin de main  
}
