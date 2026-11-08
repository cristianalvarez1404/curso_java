import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //int i = 15;

//        while(i <= 10){
//            System.out.println(i);
//            i++;
//        }


        Scanner scanner = new Scanner(System.in);
        String password;

        do {
            System.out.println("Ingresar contrasañe: ");
            password = scanner.nextLine();

        }while (!password.equals("java123"));

        System.out.println("Acceso al sistema :D");

    }
}