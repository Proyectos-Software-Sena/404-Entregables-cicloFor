import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido");

        System.out.println("Digite la cantidad de temperaturas tomadas:");
        int cantidad_temperatura= sc.nextInt();
        int mayor= 0;



        for (int i = 1; i <= cantidad_temperatura; i++) {

            System.out.println("Digite la temperatura  " + i + ":");
            int temperatura = sc.nextInt();

            if (i==1){
                mayor= temperatura;
            } else if (temperatura>mayor) {
                mayor=temperatura;
            }

        }
        System.out.println("La temperatura mas alta registrada fue:"+mayor);






    }
}

