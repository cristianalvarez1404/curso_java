import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int edad = 39;

        if(edad >= 18){
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }

        System.out.println("Ingrese la nota: ");
        int nota = scanner.nextInt();

        if(nota == 5){
            System.out.println("Excelente");
        }
        else if(nota > 3){
            System.out.println("Sobresaliente");
        }
        else if(nota > 2){
            System.out.println("Aceptable");
        }
        else {
            System.out.println("Deficiente");
        }

        scanner.close();
    }
}