import javax.swing.JOptionPane;
public class Ejercicio6 {
    public static void main(String[] args) {
        int asistentes = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de asistentes"));

        int menores = 0;
        int adultos = 0;


        for (int i = 1; i <= asistentes; i++) {

            int edad = Integer.parseInt(JOptionPane.showInputDialog("Edad del asistente " + i));

            if (edad < 18) {
                menores++;
            } else {
                adultos++;
            }
        }

        JOptionPane.showMessageDialog(null,
                "Menores: " + menores +
                        "\nAdultos: " + adultos);
    }
}
