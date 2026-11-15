
public class Main {
    public static void main(String[] args) {

        double nota1 = 4.5;
        double nota2 = 3.2;
        double nota3 = 3.3;

        double[] notas = new double[5];
        int[] elementos = new int[8];
        String[] nombres = {"estudiante 1", "estudiante2"};
        long[] valores = new long[5];
        char[] letras = {'A','B','C'};

        notas[0] = 4.5;
        notas[1] = 3.2;
        notas[2] = 3.3;
        notas[3] = 5.0;
        notas[4] = 2.1;

        double[] notas2 = {4.5, 3.2, 3.3, 5.0, 2.1};
        double promedio = 0;

        for(int i = 0; i < notas.length; i++){
            System.out.println("Tu nota es: " + notas[i]);
            promedio += notas[i];
        }

        double resultado = promedio / notas.length;
        System.out.println("El promedio de notas es :" + resultado);
    }
}