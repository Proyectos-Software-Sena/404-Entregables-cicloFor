import javax.swing.*;
import java.util.Scanner;

public class Ejercicio4 {
    public  static void main(String args[]){

        int cantidad;
        double nota;
        double suma = 0;
        double promedio;

        cantidad = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas notas desea ingresar?"));

        for (int i = 1; i <= cantidad; i++) {

            nota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota " + i));

            suma += nota;

        }

        promedio = suma / cantidad;

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