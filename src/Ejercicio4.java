import javax.swing.*;
import java.util.Scanner;

public class Ejercicio4 {
    public  static void main(String args[]){
        //Ingrese su código

        int cantidadNotas = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Ingrese la cantidad de calificaciones:"
                )
        );

        double sumaNotas = 0;

        for (int i = 1; i <= cantidadNotas; i++) {

            double nota = Double.parseDouble(
                    JOptionPane.showInputDialog(
                            "Ingrese la calificación " + i + " (0.0 a 5.0):"
                    )
            );

            sumaNotas += nota;
        }

        double promedio = sumaNotas / cantidadNotas;

        String estado;

        if (promedio >= 3.0) {
            estado = "Aprobado";
        } else {
            estado = "No Aprobado";
        }

        JOptionPane.showMessageDialog(
                null,
                "Promedio: " + promedio +
                        "\nEstado: " + estado
        );

    }
}
