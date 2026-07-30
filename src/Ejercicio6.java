import javax.swing.*;

public class Ejercicio6 {
    public static void main(String[] args) {
        //Ingrese su código

        int cantidadAsistentes = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Ingrese la cantidad total de asistentes:"
                )
        );

        int menores = 0;
        int adultos = 0;

        for (int i = 1; i <= cantidadAsistentes; i++) {

            int edad = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            "Ingrese la edad del asistente " + i + ":"
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
                "Menores de edad: " + menores
                        + "\nAdultos: " + adultos
        );

    }
}
