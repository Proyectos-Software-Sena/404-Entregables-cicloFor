public class Ejercicio10 {
    public static void main(String[] args) {
        //Ingrese su código
        Scanner sc = new Scanner(System.in);

        int n;
        int a = 0;
        int b = 1;

        System.out.print("Cantidad de términos: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");

            int siguiente = a + b;
            a = b;
            b = siguiente;
        }

    }
}
