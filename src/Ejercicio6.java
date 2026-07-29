public class Ejercicio6 {
    public static void main(String[] args) {
        //Ingrese su código
        Scanner sc = new Scanner(System.in);

        int asistentes;
        int edad;
        int menores = 0;
        int adultos = 0;

        System.out.print("Cantidad de asistentes: ");
        asistentes = sc.nextInt();

        for (int i = 1; i <= asistentes; i++) {
            System.out.print("Edad del asistente " + i + ": ");
            edad = sc.nextInt();

            if (edad < 18) {
                menores++;
            } else {
                adultos++;
            }
        }

        System.out.println("Menores: " + menores);
        System.out.println("Adultos: " + adultos);

    }
}
