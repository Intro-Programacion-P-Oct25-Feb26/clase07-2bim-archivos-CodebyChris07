/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lectura05;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author A S U S
 */
public class Estadistica {

    public static double empleadosPromedio() {

        double sum = 0;
        int contador = 0;

        try {
            Scanner entrada = new Scanner(new File("data/sucursales.txt"));

            while (entrada.hasNextLine()) {
                String linea = entrada.nextLine();

                try {
                    List<String> lista = Arrays.asList(linea.split("\\|"));
                    ArrayList<String> partes = new ArrayList<>(lista);

                    if (partes.size() < 5) {
                        throw new Exception("Línea incompleta");
                    }

                    double empleados = Double.parseDouble(partes.get(2));

                    sum = sum + empleados;
                    contador = contador + 1;

                } catch (Exception e) {
                    continue;
                }
            }

        } catch (Exception e) {
            System.out.println("Error al abrir el archivo");
            return 0;
        }

        if (contador == 0) {
            return 0;
        }
        double promedio;
        promedio = (double)sum / contador;

        promedio = Math.round(promedio);
        /*
        se investigo el Math.round para que los empleados no salgan como decimales
        */
        return promedio;
    }
}