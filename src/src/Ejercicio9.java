import java.util.Scanner;

public class Ejercicio9 {
    public static void main (String[] args) {


            Scanner sc = new Scanner(System.in);

            System.out.println("Bienvenido");

            System.out.println("Digite la cantidad de bacterias actual:");
            int bacterias = sc.nextInt();

            System.out.println("Digite la proyeccion de horas que desea:");
            int horas = sc.nextInt();

            int proyeccion = 0;

            for (int i = 1; i <= horas; i++) {

                proyeccion= bacterias*2;
                bacterias=proyeccion;

                System.out.println("Hora: " + i + " Cantidad de bacterias:" + proyeccion);

            }


        }
    }

