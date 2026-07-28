import javax.swing.JOptionPane;
public class Ejercicio4 {
    public  static void main(String args[]){
        //Ingrese su código
        int cantidadnotas;
        double nota;
        double suma= 0;
        double promedio;
        String estado;
        cantidadnotas = Integer.parseInt(JOptionPane.showInputDialog("¿cuantas notas va a registrar?:"));
        //proceso
        for(int i = 1; i <= cantidadnotas; i++) {
            nota = Double.parseDouble(JOptionPane.showInputDialog("ingrese la nota:" +i));
            suma+=nota;
        }
        promedio = suma / cantidadnotas;
        if(promedio >= 3.0) {
            estado = "Aprobado";
        }else{
            estado = "Reprobado";
        }
        //salida
        JOptionPane.showMessageDialog(null, "promedio de notas:" +promedio+ "\n estado" +estado);
    }
}
