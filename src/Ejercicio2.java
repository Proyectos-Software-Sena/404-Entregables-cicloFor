import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Ingrese su código
        Scanner tc = new Scanner(System.in);
        System.out.println("Hola, bienvenido");
        System.out.println("----------------------");
        System.out.println("Digita el numero de piezas que se van a revisar");
        int cantidad = tc.nextInt();
        int aprobadas = 0;
        int defectuosa = 0;


        for (int i = 0; i< cantidad;i++){
            System.out.println("Ingresa el paso en gramos de la pieza "+(i+1));
            double peso =tc.nextDouble();

            if (peso <120 && peso >100){
                aprobadas++;
            }else {
                defectuosa++;
            }

        }

        System.out.println("piezas aprobadas: "+ aprobadas);
        System.out.println("piezas defectuosas: "+defectuosa);

    }
}
