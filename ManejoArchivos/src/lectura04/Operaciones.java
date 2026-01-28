/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lectura04;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Operaciones {

    public static void main(String args[]) {
        double suma = 0;
        int division = 0;
        try {
            Scanner entrada = new Scanner(new File("data/datosDos.txt"));

            while (entrada.hasNext()) {
                
                String linea = entrada.nextLine(); 
                List<String> lista = Arrays.asList(linea.split("\\|"));
                ArrayList<String> linea_partes = new ArrayList<>(lista);
                double a = Double.parseDouble(linea_partes.get(3));
                suma = suma + a;
                division = division + 1;
            } 
            entrada.close();
        } 
        catch (Exception e) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);

        }
        suma = suma/division;
        System.out.println(suma);
    }
}
