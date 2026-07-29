public class Ejercicio10 {
    public static void main(String[] args) {
        //Ingrese su código
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de términos a generar: ");
        int n = entrada.nextInt();

        int a = 0;
        int b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a);

            if (i < n) {
                System.out.print(", ");
            }

            int siguiente = a + b;
            a = b;
            b = siguiente;
        }

        entrada.close();
    }
}
