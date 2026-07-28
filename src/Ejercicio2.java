import javax.swing.JOptionPane;
public class Ejercicio2 {
    public static void main(String[] args) {
        //Ingrese su código
        int cantidadpiezas;
        int peso;
        int aprobadas = 0;
        int defectuosas = 0;
        cantidadpiezas = Integer.parseInt(JOptionPane.showInputDialog("cuantas piezas se van a revisar?"));
        //proceso
        for(int i = 1; i <= cantidadpiezas; i++) {
            peso = Integer.parseInt(JOptionPane.showInputDialog("ingrese el peso de la pieza:" +i));
            if(peso >= 100 && peso <= 120) {
                aprobadas++;
            }else if(peso < 100 || peso > 120) {
                defectuosas++;
            }
        }
        //salida
        JOptionPane.showMessageDialog(null, "piezas aprobadas:" +aprobadas+ "\n piezas defectuosas:" +defectuosas);
    }
}
