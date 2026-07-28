import javax.swing.JOptionPane;

public class Ejercicio4 {
    public  static void main(String args[]){
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas calificaciones ingresará?"));

        double suma = 0;

        for (int i = 1; i <= cantidad; i++) {

            double nota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota " + i));

            suma += nota;
        }

        double promedio = suma / cantidad;


        if (promedio >= 3.0) {
            JOptionPane.showMessageDialog(null,
                    "Promedio: " + promedio + "\nEstado: Aprobado");
        } else {
            JOptionPane.showMessageDialog(null,
                    "Promedio: " + promedio + "\nEstado: No Aprobado");
        }
    }
}
