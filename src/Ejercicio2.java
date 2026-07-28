import javax.swing.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        int piezas;
        int defectuosa = 0;
        int peso;
        int aprobada = 0;
        piezas = Integer.parseInt(JOptionPane.showInputDialog("¿cuantas piezas desea registrar?")
        );
        for (int i = 1; i <= piezas; i++){
            peso = Integer.parseInt(
                    JOptionPane.showInputDialog("Ingrese el peso de la pieza #" + i + " en gramos:")
            );
            if (peso < 100 || peso > 120) {
                defectuosa++;
            } else {

                aprobada++;
            }
        }
        JOptionPane.showMessageDialog(null,"piezas aprobadas:" +aprobada+ "piezas defectuosas:" + defectuosa);

    }
}
