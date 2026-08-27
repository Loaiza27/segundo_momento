import java.util.Scanner;

public class LotesIventarios {

    
    public static void main(String[] args) {
        // DECLARACION DE VARIABLES
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de productos: ");
        int numProductos = scanner.nextInt();
        System.out.print("Ingrese el nombre del producto: ");
        String nombreProducto = scanner.next();
        System.out.print("Ingrese el total de costos: ");
        double totalCostos = scanner.nextDouble();
        System.out.print("Cantidad de productos: ");
        int cantidadProductos = scanner.nextInt();
        System.out.print("productos categoria alta: ");
        int productosCategoriaAlta = scanner.nextInt();
        System.out.print("costo base: ");
        double costoBase = scanner.nextDouble();
        System.out.print("costo promedio: ");
        double costoPromedio = scanner.nextDouble();

        // ENTRADA DE LA CANTIDAD DE LOS PRODUCTOS
        System.out.print("cuantos productos ingresaran al lote: ");
        cantidadProductos = scanner.nextInt();
        scanner.nextLine();
        // INICIO DE FOR 
        for (int i =1; i<=cantidadProductos;i++){

        }
        
    }
}
    