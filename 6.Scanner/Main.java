import java.util.Scanner;

class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        /*
        System.out.println("Ingresar nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingresar edad: ");
        int edad = scanner.nextInt();
        */

        System.out.println("Ingresar cantidad: ");
        int cantidad = scanner.nextInt();

        System.out.println("Ingresar valor unidad: ");
        double valor = scanner.nextDouble();

        Double total = cantidad * valor;

        System.out.println("Total :" + total);

        scanner.close();
    }
}