
class Main {
    public static void main(String[] args){

        //Conversión automatica
        int valor = 19;
        double valor2 = valor;

        System.out.println(valor);
        System.out.println(valor2);

        //Conversión explicita - casting

        double valor3 = 25.18;
        int valor4 = (int)valor3;

        System.out.println(valor3);
        System.out.println(valor4);

        int caracter = 42;
        char caracter2 = (char)caracter;

        System.out.println(caracter);
        System.out.println(caracter2);

        char caracter3 = 'F';
        int caracter4 = caracter3;

        System.out.println(caracter3);
        System.out.println(caracter4);

        float decimal = 4.25f;
        double decimal2 = (double) decimal;

        System.out.println(decimal);
        System.out.println(decimal2);

    }
}