public class Ejercicio6 {
    public static void main(String[] args) {
        //Ingrese su código
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la cantidad total de asistentes: ");
        int cantidadAsistentes = entrada.nextInt();

        int menores = 0;
        int adultos = 0;

        for (int i = 1; i <= cantidadAsistentes; i++) {
            System.out.print("Ingrese la edad del asistente #" + i + ": ");
            int edad = entrada.nextInt();

            if (edad < 18) {
                menores++;
            } else {
                adultos++;
            }
        }

        System.out.println("\nCantidad de menores de edad: " + menores);
        System.out.println("Cantidad de adultos: " + adultos);

        entrada.close();
    }
}
