import javax.swing.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        //Ingrese su código

        int cantidadLecturas = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Ingrese la cantidad de lecturas de temperatura:"
                )
        );

        double temperaturaMaxima = Double.NEGATIVE_INFINITY;

        for (int i = 1; i <= cantidadLecturas; i++) {

            double temperatura = Double.parseDouble(
                    JOptionPane.showInputDialog(
                            "Ingrese la temperatura " + i + " en °C:"
                    )
            );

            if (temperatura > temperaturaMaxima) {
                temperaturaMaxima = temperatura;
            }
        }

        JOptionPane.showMessageDialog(
                null,
                "La temperatura máxima registrada fue: "
                        + temperaturaMaxima + "°C"
        );

    }
}
