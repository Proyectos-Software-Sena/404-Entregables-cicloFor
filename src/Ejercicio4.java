import javax.swing.*;

public class Ejercicio4 {
    public static void main(String[] args){
        int numerodenotas;
        double calificaciones;
        double sumadelasnotas = 0;
        double promediodelasnotas;

        numerodenotas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de calificaciones de la materia"));

        for(int i = 1; i <=numerodenotas; i++){
            calificaciones = Double.parseDouble(JOptionPane.showInputDialog("Ingrese las notas"+i));
            sumadelasnotas+= calificaciones;
        }
        promediodelasnotas=sumadelasnotas/numerodenotas;
        if(promediodelasnotas >= 3.0){
            JOptionPane.showMessageDialog(null, "tu promedio es" +promediodelasnotas +"\n" +"Aprovado");
        }else{
            JOptionPane.showMessageDialog(null, "tu promedio es" +promediodelasnotas +"\n" +"desaprobado");
        }
    }
}
