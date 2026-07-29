public class Ejercicio5 {
    public static void main (String[] args) {
        //Ingrese su código
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el monto que ahorrará cada mes: $");
        double ahorroMensual = entrada.nextDouble();

        System.out.print("Ingrese la cantidad de meses: ");
        int meses = entrada.nextInt();

        double ahorroAcumulado = 0;

        for (int i = 1; i <= meses; i++) {
            ahorroAcumulado += ahorroMensual;
            System.out.println("Mes " + i + ": $" + ahorroAcumulado);
        }

        entrada.close();
    }
}
