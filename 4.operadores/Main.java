
class Main {
    public static void main(String[] args){
        // Operadores aritmenticos
        int a = 5;
        int b = 3;

        /*
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        */

        //Operadores de asignación
        int edad = 38;
        //System.out.println(edad);

        edad = edad + 2;
        edad += 2;
        //System.out.println(edad);

        edad = edad - 2;
        edad -= 2;

        edad = edad * 2;
        edad *= 2;

        edad = edad / 2;
        edad /= 2;

        //Operadores de comparación
        int numero = 10;

        /*
        System.out.println(numero > 5);
        System.out.println(numero < 5);
        System.out.println(numero >= 5);
        System.out.println(numero <= 5);
        System.out.println(numero != 5);
        System.out.println(numero == 10);
        */

        //Incremento y decremento
        int contador = 1;
        contador++;
        contador++;
        System.out.println(contador);

        contador--;
        System.out.println(contador);

        //Operadores lógicos
        boolean edad2 = true;
        boolean edad3 = false;
        boolean activo = true;

        System.out.println(edad2 && edad3);
        System.out.println(edad2 || edad3);
        System.out.println(!activo);

    }
}