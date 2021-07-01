/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import POO.Producto;
import java.util.Scanner;

/**
 *
 * @author Ethan Dávila
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        Producto[] P = new Producto[10];
        int Contador = 0;
        int Op = 0;
        
        do{
            Menu();
            Op = teclado.nextInt();
            
            switch(Op){
                case 1:
                    System.out.println("\nIngrese el nombre del producto: ");
                    String Nombre = teclado.nextLine();
                    Nombre = teclado.nextLine();
                    System.out.println("Ingrese el No. de Existenciad del producto: ");
                    int NoExistencias = teclado.nextInt();
                    System.out.println("Ingrese la marca del producto: ");
                    String Marca = teclado.nextLine();
                    Marca = teclado.nextLine();
                    System.out.println("Ingrese el modelo del producto: ");
                    String Modelo = teclado.nextLine();
                    System.out.println("Ingrese el precio del producto: ");
                    float Precio = teclado.nextFloat();
                    
                    Producto producto = new Producto(Nombre, NoExistencias, Marca, Modelo, Precio);
                    P[Contador] = producto;
                    Contador++;
                    
                    System.out.println("\nSe ha ingresado el producto correctamente!!!");
                    System.out.println("Se han agregado " + Contador + " productos");
                    break;
                
                case 2:
                    System.out.println("\n");
                    for (int i = 0; i < Contador; i++){
                        System.out.println(P[i].toString());
                        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    }
                    break;
                
                case 3:
                    int n = 0;
                    Producto[] PMarca = new Producto[Contador];
                    System.out.println("\nIngrese la marca de producto a buscar: ");
                    String Marca2 = teclado.nextLine();
                    Marca2 = teclado.nextLine();
                    System.out.println("\n");
                    for (int i = 0; i < Contador; i++){
                        if (P[i].getMarca().equals(Marca2)){
                            PMarca[n] = P[i];
                            n++;
                        }
                    }
                    for (int i = 0; i < n; i++){
                        System.out.println(PMarca[i].toString());
                        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    }
                    break;
                    
                case 4:
                    int m = 0;
                    float IngresosTotales = 0;
                    Producto[] PM = new Producto[Contador];
                    System.out.println("\nIngrese la marca de producto a sacar el total de ingresos: ");
                    String Marca3 = teclado.nextLine();
                    Marca3 = teclado.nextLine();
                    for (int i = 0; i < Contador; i++){
                        if (P[i].getMarca().equals(Marca3)){
                            PM[m] = P[i];
                            m++;
                        }
                    }
                    for (int i = 0; i < m; i++){
                        IngresosTotales += PM[i].getPrecio();
                    }
                    System.out.println("\nLos ingresos totales de la marca " + Marca3 + " son de " + IngresosTotales);
                    break;
                    
                case 5:
                    int l = 0;
                    Producto[] PrMa = new Producto[Contador];
                    System.out.println("\nIngrese la marca de producto a ordenar de mayor a menor según su precio de venta: ");
                    String Marca4 = teclado.nextLine();
                    Marca4 = teclado.nextLine();
                    for (int i = 0; i < Contador; i++){
                        if (P[i].getMarca().equals(Marca4)){
                            PrMa[l] = P[i];
                            l++;
                        }
                    }
                    int in;
 
                    for (int i = 1 ; i < Contador ; i++) {
                        Producto aux = PrMa[i];
                        in = i;
     
                        while (in > 0 && PrMa[in - 1].getPrecio()< aux.getPrecio()) {
                            PrMa[in] = PrMa[in - 1];
                            --in;
                        }
 
                        PrMa[in] = aux;
                    }
                    System.out.println("\n");
                    for(int i = 0; i < Contador; i++){
                        System.out.println(PrMa[i].toString());
                        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    }
                    break;
                    
                case 6:
                    Producto[] Pr = new Producto[Contador];
                    for (int i = 0; i < Contador; i++){
                        Pr[i] = P[i];
                    }
                    int im;
                    
                    for (int i = 1 ; i < Contador ; i++) {
                        Producto a = Pr[i];
                        im = i;
                            
                        while (im > 0 && Pr[im - 1].getPrecio()> a.getPrecio()) {
                            Pr[im] = Pr[im - 1];
                            --im;
                        }
 
                        Pr[im] = a;
                    }
                    System.out.println("\n");
                    for (int i = 0; i < Contador; i++){
                        System.out.println(Pr[i].toString());
                        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    }
                    break;
                    
                case 7:
                    System.out.println("\nGracias por utilizar el programa!!!");
                    System.out.println("Desarrollador: Johao :3");
                    System.out.println("\nCerrando.........");
                    break;
            }
        }while(Op != 7);
    }
    
    public static void Menu(){
        System.out.println("\n***MENU DE OPCIONES***");
        System.out.println("1. Registrar producto");
        System.out.println("2. Mostrar listado de productos");
        System.out.println("3. Mostrar listado del productos por marcas");
        System.out.println("4. Mostrar total de ingresos a obtener por marcas");
        System.out.println("5. Mostrar productos con mayor precio de venta por marca");
        System.out.println("6. Mostrar listado de productos ordenados por precio de venta");
        System.out.println("7. Finalizar programa");
        System.out.println("\nIngrese el No. de su Opción: ");
    }
}
