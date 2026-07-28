import javax.swing.*;

public class Ejercicio6 {
    public static void main(String[] args) {
        int cantidadasitentes = 0;
        int edad = 0;
        int mayores = 0;
        int menores = 0;

        cantidadasitentes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de asistentes que hay"));

        for  (int i = 1; i <= cantidadasitentes; i++) {
            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad qdel asistente " +i));

            if(edad > 18){
                mayores++;
            }else {
                menores++;
            }
        }
        JOptionPane.showMessageDialog(null, "menores de edad "+menores +"\n" + "mayores de edad "+mayores );
    }
}