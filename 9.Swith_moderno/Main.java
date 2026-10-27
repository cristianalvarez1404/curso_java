
class Main {
    public static void main(String[] args){

        int opcion = 1;
    /*
        switch (opcion){
            case 1:
                System.out.println("Opcion 1");
                break;
            case 2:
                System.out.println("Opcion 2");
                break;
            default:
                System.out.println("Default");
                break;
        }
*/
        String opcion2 = switch (opcion){
            case 1 -> {
                System.out.println("Opcion 1");
                yield "Opcion 1 retornada";
            }
            case 2 -> {
                System.out.println("Opcion 2");
                yield "Opcion 2 retornada";
            }
            default -> {
                System.out.println("Default");
                yield "Opcion default";
            }
        };

        System.out.println(opcion2);
    }
}