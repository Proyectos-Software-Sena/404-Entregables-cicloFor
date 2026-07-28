import java.util.Scanner;

public class Ejercicio8 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la palabra clave: ");

        String clave = sc.nextLine();
        int reverse = clave.length();


        for(int i=reverse-1; i>=0; i--){
            char nig = clave.charAt(i);
            System.out.print(nig);
        }
        sc.close();
    }
}
