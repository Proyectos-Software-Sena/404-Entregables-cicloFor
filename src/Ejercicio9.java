public class Ejercicio9 {
    public static void main (String[] args) {
        //Ingrese su código
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la cantidad inicial de bacterias: ");
        int bacterias = entrada.nextInt();

        System.out.print("Ingrese la cantidad de horas de proyección: ");
        int horas = entrada.nextInt();

        for (int i = 1; i <= horas; i++) {
            bacterias *= 2;
            System.out.println("Hora " + i + ": " + bacterias + " bacterias");
        }

        entrada.close();
    }
}
