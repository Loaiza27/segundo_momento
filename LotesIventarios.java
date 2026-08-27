import java.util.Scanner;

public class LotesIventarios {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // DECLARACION DE VARIABLES
        
        System.out.print("Ingrese el número de productos: ");
        int numProductos = scanner.nextInt();
        double costoPromedio;
        double sumaProductos = 0;
        int productosCategoriaAlta = 0;


        

// inicio for

        for (int i =1; i<=numProductos;i++){
            System.out.println("ingrese nombre del producto");
            String nombreProducto = scanner.nextLine();
            scanner.next();
            System.out.println("ingresar costo base");
            double costoBase = scanner.nextDouble();

            sumaProductos = sumaProductos + costoBase;
             if (costoBase < 10000){
                System.out.println("producto de categoria baja ");
                
             }else if (costoBase >= 10000 && costoBase <= 50000) {
                System.out.println("producto de categoria media");
                

                    
                } else  { 
                    System.out.println("producto categoria alta");
                    productosCategoriaAlta ++;


                }



        } 
        scanner.close();
        costoPromedio = sumaProductos / numProductos;
        System.out.println("el costo promedio es" + costoPromedio);
        System.out.println("la cantidad de productos de categoria alta " + productosCategoriaAlta);






      
        
        
    }
}
    