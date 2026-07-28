import javax.swing.JOptionPane;

public class ejercicio10 {

    public static void main(String[] args) {

        // Pedir la cantidad de términos
        int cantidadTerminos = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Ingrese la cantidad de términos de Fibonacci:"
                )
        );

        // Primeros dos valores de Fibonacci
        long anterior = 0;
        long actual = 1;

        // Variable para almacenar la serie
        String resultado = "";

        // Un solo ciclo for para generar Fibonacci
        for (int i = 1; i <= cantidadTerminos; i++) {

            // Agregar el número actual al resultado
            resultado += anterior;

            // Agregar coma si no es el último término
            if (i < cantidadTerminos) {
                resultado += ", ";
            }

            // Calcular el siguiente número
            long siguiente = anterior + actual;

            anterior = actual;
            actual = siguiente;
        }

        // Mostrar la sucesión
        JOptionPane.showMessageDialog(
                null,
                "Sucesión de Fibonacci:\n" + resultado
        );
    }
}