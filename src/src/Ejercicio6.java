import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido");

        System.out.println("Digite la cantidad de asistentes:");
        int cantidad_asistentes = sc.nextInt();

        int mayores = 0;
        int niños = 0;

        for (int i = 1; i <= cantidad_asistentes; i++) {

            System.out.println("Digite la edad el sistente " + i + ":");
            double edad = sc.nextDouble();

            if (edad >= 18) {
                mayores ++;
            } else if (edad<= 18) {
                niños++;
            }
        }
        System.out.println("La cantidad de asistentes es:"+ cantidad_asistentes+"\n Adultos: "+ mayores+"\n Menores de edad:"+ niños);


    }
}