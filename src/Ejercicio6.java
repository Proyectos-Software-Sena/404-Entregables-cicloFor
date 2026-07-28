import javax.swing.*;

public class Ejercicio6 {
    public static void main(String[] args) {

        int personas;
        int edad;
        int personasmenores = 0;
        int personamayores = 0;

        personas = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas personas desea registrarsen?"));

        for (int i = 1; i <= personas; i++) {

            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la persona " + i));

            if (edad < 18) {
                personasmenores++;
            } else {
                personamayores++;
            }

        }

        JOptionPane.showMessageDialog(null, "Menores de edad: " + menores + "\nMayores de edad: " + mayores);
    }
}
