import javax.swing.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        //Ingrese su código

        int cantidadLecturas;
        double temperatura;
        double temperaturaMaxima;

        cantidadLecturas = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese la cantidad de lecturas de temperatura:")
        );

        temperaturaMaxima = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese la temperatura de la lectura #1:")
        );

        for (int i = 2; i <= cantidadLecturas; i++) {

            temperatura = Double.parseDouble(
                    JOptionPane.showInputDialog("Ingrese la temperatura de la lectura #" + i + ":")
            );

            if (temperatura > temperaturaMaxima) {
                temperaturaMaxima = temperatura;
            }
        }

        JOptionPane.showMessageDialog(null,
                "La temperatura máxima registrada fue: " + temperaturaMaxima + "°C");
    }
}

