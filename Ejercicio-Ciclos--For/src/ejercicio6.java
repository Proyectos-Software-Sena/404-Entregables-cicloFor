import javax.swing.JOptionPane;

public class ejercicio6 {

    public static void main(String[] args) {

        // Pedir la cantidad de asistentes
        int cantidadAsistentes = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Ingrese la cantidad total de asistentes:"
                )
        );

        // Contadores de menores y adultos
        int menores = 0;
        int adultos = 0;

        // Ciclo for para registrar las edades
        for (int i = 1; i <= cantidadAsistentes; i++) {

            // Pedir la edad del asistente
            int edad = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            "Ingrese la edad del asistente " + i + ":"
                    )
            );

            // Clasificar según la edad
            if (edad < 18) {
                menores++;
            } else {
                adultos++;
            }
        }

        // Mostrar los resultados
        JOptionPane.showMessageDialog(
                null,
                "Menores de edad: " + menores
                        + "\nAdultos: " + adultos
        );
    }
}