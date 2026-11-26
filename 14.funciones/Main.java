
public class Main {
    public static void main(String[] args){
        metodoBienvenida();
        sumaVentas(100, 200);
        sumaVentas(300,400);
        sumaVentas(500,600);
        double ventasNegocio = ventas(100, 2);
        double otrasVentas =  500 + ventasNegocio;

        System.out.println("Total ventas del mes: " + otrasVentas);
    }

    public static void metodoBienvenida(){
        System.out.println("Bienvenida!");
    }

    public static void sumaVentas(double venta1, double venta2){
        double suma = venta1 + venta2;
        System.out.println("Total ventas :" + suma);
    }

    public static double ventas(int unidades, double valor){
        double total = unidades * valor;
        return total;
    }


}