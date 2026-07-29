import javax.swing.*;

public class Ejercicio4 {
    public  static void main(String args[]){

        int cantidadNotas=Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas calificaciones tiene el módulo?"));
        double sumaNotas = 0;
        double promedio;


        for (int i = 1; i <= cantidadNotas; i++) {

            double nota = Double.parseDouble(
                    JOptionPane.showInputDialog(
                            "Ingrese la nota " + i
                    )
            );

            sumaNotas += nota;

        }

        promedio = sumaNotas / cantidadNotas;

        if (promedio >= 3.0) {

            JOptionPane.showMessageDialog(
                    null,
                    "Promedio: " + promedio +
                            "\nEstado: Aprobado"
            );

        } else {

            JOptionPane.showMessageDialog(
                    null,
                    "Promedio: " + promedio +
                            "\nEstado: No aprobado"
            );

        }

    }
}
