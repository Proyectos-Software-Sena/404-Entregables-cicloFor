import javax.swing.JOptionPane;

public class  Ejercicio4{

    public static void main(String[] args) {

        int cantidad;
        double nota;
        double suma = 0;
        double promedio;
        String estado;

        cantidad = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas notas va a ingresar?"));

        for (int i = 1; i <= cantidad; i++) {

            nota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota " + i));

            suma = suma + nota;

        }

        promedio = suma / cantidad;

        if (promedio >= 3.0) {
            estado = "Aprobado";
        } else {
            estado = "No Aprobado";
        }

        JOptionPane.showMessageDialog(null,
                "Promedio: " + promedio +
                        "\nEstado: " + estado);

    }

}