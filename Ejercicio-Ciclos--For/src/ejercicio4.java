import javax.swing.JOptionPane;

public class ejercicio4 {

    public static void main(String[] args) {

        // Pedir la cantidad de calificaciones
        int cantidadNotas = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Ingrese la cantidad de calificaciones:"
                )
        );

        // Variable para acumular las notas
        double sumaNotas = 0;

        // Ciclo para ingresar las calificaciones
        for (int i = 1; i <= cantidadNotas; i++) {

            double nota = Double.parseDouble(
                    JOptionPane.showInputDialog(
                            "Ingrese la calificación " + i + " (0.0 a 5.0):"
                    )
            );

            sumaNotas += nota;
        }

        // Calcular el promedio
        double promedio = sumaNotas / cantidadNotas;

        // Verificar si aprobó
        String estado;

        if (promedio >= 3.0) {
            estado = "Aprobado";
        } else {
            estado = "No Aprobado";
        }

        // Mostrar el resultado
        JOptionPane.showMessageDialog(
                null,
                "Promedio: " + promedio +
                        "\nEstado: " + estado
        );
    }
}