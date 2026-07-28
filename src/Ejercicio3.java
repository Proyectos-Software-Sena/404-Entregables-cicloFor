import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantas pruebas de temperatura se tomaron?: ");
        int total = sc.nextInt();
        int temperature = 0;

        for(int i=1; i<=total; i++){
            System.out.print("Ingrese el registro numero "+i+" en Celcius: ");
            int max = sc.nextInt();
            if(max>temperature){
                temperature = max;
            }
        }
        System.out.print("La temperatura mas alta registrada es de "+temperature+"°C");
        sc.close();
    }
}
