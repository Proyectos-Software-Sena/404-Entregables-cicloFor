import javax.swing.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        int numnotas = 0;
        double calificacion = 0;
        double suma = 0;
        double promedio = 0;

        numnotas = Integer.parseInt(JOptionPane.showInputDialog("Ingre cuantas calificaciones componen el modulo"));

        for (int i = 1; i <= numnotas; i++) {

            calificacion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la calificacion de la nota "+i));
            suma += calificacion;
        }
        promedio = suma / numnotas;

        if (promedio >= 3.0) {
            JOptionPane.showMessageDialog(null, "Su promedio es " + promedio +"\n" + "Aprobado" );
        }else {
            JOptionPane.showMessageDialog(null, "Su promedio es " + promedio +"\n" + "Reprobado" );
        }
    }
}