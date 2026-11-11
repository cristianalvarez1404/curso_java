
public class Main {
    public static void main(String[] args){

//        for(int i = 0; i <= 10; i++){
//            System.out.println(i);
//        }

//        for(int i = 10; i >= 0; i--){
//            System.out.println(i);
//        }

        int suma = 0;

        for(int i = 0; i <= 10; i++){
            suma += i;
        }

        System.out.println("Sumatoria: " + suma);

        String[] arr = {
                "Teclado",
                "Pantalla",
                "Audifonos"
        };

        for(int i = 0; i <= arr.length; i++){
            System.out.println("Elemento " + arr[i]);
        }

    }
}