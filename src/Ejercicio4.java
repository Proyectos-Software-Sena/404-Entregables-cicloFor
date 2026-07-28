import javax.swing.*;
import java.util.Scanner;

public class Ejercicio4 {
    public  static void main(String args[]){
        int cantidadNotas;
        double nota;
        double sumaNotas = 0;
        double promedio;

        cantidadNotas = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese la cantidad de calificaciones:")
        );

        for (int i = 1; i <= cantidadNotas; i++) {

            nota = Double.parseDouble(
                    JOptionPane.showInputDialog("Ingrese la calificación #" + i + ":")
            );

            sumaNotas = sumaNotas + nota;
        }

        promedio = sumaNotas / cantidadNotas;

        if (promedio >= 3.0) {

            JOptionPane.showMessageDialog(null,
                    "Promedio: " + promedio +
                            "\nEstado: Aprobado");

        } else {

            JOptionPane.showMessageDialog(null,
                    "Promedio: " + promedio +
                            "\nEstado: No Aprobado");

        }
    }
}