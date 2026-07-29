public class Ejercicio3 {
    public static void main(String[] args) {
        //Ingrese su código
        System.out.print("Ingrese la cantidad de lecturas de temperatura: ");
        int cantidad = entrada.nextInt();

        double temperatura;
        double temperaturaMaxima = 0;

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingrese la temperatura #" + i + " (°C): ");
            temperatura = entrada.nextDouble();

            // La primera temperatura será la máxima inicialmente.
            if (i == 1 || temperatura > temperaturaMaxima) {
                temperaturaMaxima = temperatura;
            }
        }

        System.out.println("\nLa temperatura máxima registrada fue: "
                + temperaturaMaxima + "°C");

        entrada.close();
    }
}
