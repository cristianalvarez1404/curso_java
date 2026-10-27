class Main {
    public static void main(String[] args){

        int opcion = 3;
        switch (opcion){
            case 1:
                System.out.println("Iniciar sesión");
                break;
            case 2:
                System.out.println("Realizar consulta");
                break;
            default:
                System.out.println("Cerrar sesión");
                break;
        }

        int letra = 'a';
        switch (letra){
            case 'a':
                System.out.println("letra a");
                break;
            case 'b':
                System.out.println("Letra b");
                break;
            case 'c':
                System.out.println("letra c");
                break;
            default:
                System.out.println("Cerrar sesión");
                break;
        }

        int dia = 6;
        switch (dia){
            case 6:
                break;
            case 7:
                System.out.println("Fin de semana");
                break;
        }
    }
}