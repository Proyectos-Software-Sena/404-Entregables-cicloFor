import javax.swing.JOptionPane;
public class Ejercicio3 {
    public static void main(String[] args) {
        //Ingrese su código
        int cantidadlecturas;
        double temperatura;
        double maxima = 0;
        cantidadlecturas = Integer.parseInt(JOptionPane.showInputDialog("¿cuantas temperaturas va a ingresar?:"));
        //proceso
        for(int i = 1; i <= cantidadlecturas; i++) {
            temperatura = Double.parseDouble(JOptionPane.showInputDialog("ingrese la temperatura:" +i));
            if(temperatura > maxima) {
                maxima = temperatura;
            }
        }
        //salida
        JOptionPane.showMessageDialog(null, "temperatura máxima registrada:" +maxima);
    }
}
