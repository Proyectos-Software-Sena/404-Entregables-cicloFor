import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Ingrese su código

        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido");

        System.out.println("Digite la cantidad de piezas a revisar:");
        int cantidad_piezas = sc.nextInt();

        int piezas_aprobadas = 0;
        int piezas_defectuosas = 0;

        for (int i = 1; i <= cantidad_piezas; i++) {

            System.out.println("Digite el peso de la venta " + i + ":");
            int peso_pieza = sc.nextInt();

            if (peso_pieza>= 100 && peso_pieza<=120){
                System.out.println("Pieza arpobada");
                piezas_aprobadas++;
            }
            else {
                System.out.println("Pieza no aprobada");
                piezas_defectuosas++;
            }

        }
        System.out.println("Piezas aprobadas:"+ piezas_aprobadas);
        System.out.println("Piezas Defectuosas::"+ piezas_defectuosas);





    }
}

