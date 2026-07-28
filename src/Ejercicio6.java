import javax.swing.*;

public class Ejercicio6 {
    public static void main(String[] args){
        //Clasificador de Edades para Eventos

        int edad = 0 ;
        int asistentes;
        int mayor = 0 ;
        int menor = 0;
        asistentes = Integer.parseInt(JOptionPane.showInputDialog("ingrese numero de asistentes: ")
        );
        //el proceso
        for (int i = 1; i <= asistentes; i++){
            edad = Integer.parseInt(JOptionPane.showInputDialog("ingrese la edad: ")
            );
            if (edad >= 18){
                mayor++;
            } else if (edad < 18) {
                menor++;
            }
        }

        //fin
        JOptionPane.showMessageDialog(null, "cantidad de menores:"+ menor + "\n cantidad de mayores: "+mayor);
    }
}

