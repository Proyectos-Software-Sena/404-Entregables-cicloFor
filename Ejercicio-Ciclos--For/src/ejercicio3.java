import javax.swing.JOptionPane;

public class ejercicio3 {

    public static void main(String[] args) {

        // Pedir la cantidad de lecturas de temperatura
        int cantidadLecturas = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Ingrese la cantidad de lecturas de temperatura:"
                )
        );

        // Variable para almacenar la temperatura máxima
        double temperaturaMaxima = Double.NEGATIVE_INFINITY;

        // Ciclo for para ingresar las temperaturas
        for (int i = 1; i <= cantidadLecturas; i++) {

            double temperatura = Double.parseDouble(
                    JOptionPane.showInputDialog(
                            "Ingrese la temperatura " + i + " en °C:"
                    )
            );

            // Comparar la temperatura actual con la máxima registrada
            if (temperatura > temperaturaMaxima) {
                temperaturaMaxima = temperatura;
            }
        }

        // Mostrar únicamente la temperatura más alta
        JOptionPane.showMessageDialog(
                null,
                "La temperatura máxima registrada fue: "
                        + temperaturaMaxima + "°C"
        );
    }
}