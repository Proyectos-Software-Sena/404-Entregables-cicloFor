import javax.swing.JOptionPane;
public class Ejercicio6 {
    public static void main(String[] args) {
        //Ingrese su código
        int asistentes;
        int edad;
        int menor = 0;
        int mayor = 0;
        asistentes = Integer.parseInt(JOptionPane.showInputDialog("ingrese el número de asistentes:"));
        //proceso
        for(int i = 1; i <= asistentes; i++) {
            edad = Integer.parseInt(JOptionPane.showInputDialog("ingrese la edad:" +i));
            if(edad >= 18) {
                mayor++;
            }else{
                menor++;
            }
        }
        //salida
        JOptionPane.showMessageDialog(null, "menores:" +menor+ "\n mayores:" +mayor);
    }
}
