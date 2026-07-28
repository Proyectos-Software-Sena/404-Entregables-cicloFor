import javax.swing.JOptionPane;

public class Ejercicio6 {

    public static void main(String[] args) {

        int personas;
        int edad;
        int menores = 0;
        int mayores = 0;

        personas = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas personas desea registrar?"));

        for (int i = 1; i <= personas; i++) {

            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la persona " + i));

            if (edad < 18) {
                menores++;
            } else {
                mayores++;
            }

        }

        JOptionPane.showMessageDialog(null,
                "Menores de edad: " + menores +
                        "\nMayores de edad: " + mayores);

    }

}