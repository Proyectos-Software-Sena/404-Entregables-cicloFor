public class Ejercicio7 {
    public static void main(String[] args) {
        //Ingrese su código
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la TRM del día (COP por 1 USD): ");
        double tasaCambio = entrada.nextDouble();

        System.out.println("\nTabla de conversión de USD a COP:");

        for (int i = 1; i <= 10; i++) {
            double pesos = i * tasaCambio;
            System.out.println(i + " USD = " + pesos + " COP");
        }

        entrada.close();
    }
}
