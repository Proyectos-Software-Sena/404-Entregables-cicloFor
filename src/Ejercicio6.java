import javax.swing.*;

public class Ejercicio6 {
    public static void main(String[] args) {

        int cantidadAsistentes;
        int edad;
        int menores = 0;
        int adultos = 0;

        cantidadAsistentes = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "¿Cuántos asistentes hay?"
                )
        );

        for (int i = 1; i <= cantidadAsistentes; i++) {

            edad = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            "Ingrese la edad del asistente " + i
                    )
            );

            if (edad < 18) {

                menores++;

            } else {

                adultos++;

            }

        }

        JOptionPane.showMessageDialog(
                null,
                "Menores: " + menores +
                        "\nAdultos: " + adultos
        );
    }
}
