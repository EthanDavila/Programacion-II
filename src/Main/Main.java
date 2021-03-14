package Main;

import Pojo.Producto;
import Implement.IdaoImplements;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner teclado = new Scanner(System.in);
    static IdaoImplements raf = new IdaoImplements();
    static List<Producto> pro = new ArrayList<>();
    static File f = new File("Almacen.txt");
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int opcion = 0;

        System.out.println("Bienvenido a mi programa, ¿Que desea hacer?:");
        System.out.println("");
        do {
            try {
                Menu();
                System.out.print("\nDigita una opcion: ");
                opcion = teclado.nextInt();
            } catch (Exception e) {
                teclado = new Scanner(System.in);
            }
            switch (opcion) {

                //Agregar un nuevo producto al inventario
                case 1:
                    int id,
                     cantidad;
                    String nombre,
                     pais,
                     proveedor,
                     fecha;
                    double precio;

                    System.out.println("\nIngrese la fecha de ingreso del producto:");
                    fecha = br.readLine();
                    System.out.println("Ingrese el ID del producto");
                    id = teclado.nextInt();
                    System.out.println("Ingrese el nombre del producto:");
                    nombre = br.readLine();
                    System.out.println("Ingrese el precio del producto:");
                    precio = teclado.nextDouble();
                    System.out.println("Ingrese la cantidad existente del producto:");
                    cantidad = teclado.nextInt();
                    System.out.println("Ingrese el pais de origen del producto:");
                    pais = br.readLine();
                    System.out.println("Ingrese el proveedor del producto:");
                    proveedor = br.readLine();

                    Producto p = new Producto(id, nombre, precio, cantidad, pais, proveedor, fecha);
                    raf.save(p);
                    System.out.println("");
                    break;

                //Mostrar todos los productos que hay en el inventario
                case 2:
                    List<Producto> pe = new ArrayList<>();
                    pe = raf.findAll();
                    if (pe == null || f.length() == 0) {
                        System.out.println("No hay productos en el inventario");
                    }
                    System.out.println("\nMostrando todos los productos del inventario actual");
                    System.out.println("-----------------------------------");
                    for (Producto per : raf.findAll()) {
                        System.out.println("Fecha de ingreso: " + per.getDate());
                        System.out.println("ID: " + per.getId());
                        System.out.println("Nombre del producto: " + per.getNombre_producto());
                        System.out.println("Precio: $" + per.getPrecio());
                        System.out.println("Cantidad existente: " + per.getCantidad() + " unidades");
                        System.out.println("Pais de origen: " + per.getPais_origen());
                        System.out.println("Proveedor: " + per.getProveedor());

                        System.out.println("-----------------------------------");
                    }
                    System.out.println("");
                    break;

                //Buscar producto por su ID    
                case 3:
                    if (!f.exists() || f.length() == 0) {
                        System.out.println("\nEl archivo que se busca no existe");
                    } else {                        
                        System.out.println("\nDigite el ID del producto a buscar: ");
                        int id2 = teclado.nextInt();
                        Producto pro = raf.findByID(id2);
                        if(pro!=null){
                            System.out.println("\nEl producto se ha encontrado:");
                            System.out.println("-----------------------------------");
                            System.out.println(pro.toString());
                            System.out.println("-----------------------------------");
                        }else{
                            System.out.println("\nError al buscar, ID incorrecto o el producto no existe");
                        }
                        System.out.println("");
                    }
                    break;

                //Actualizar producto por su ID
                case 4:

                    System.out.println("\nDigite el ID de un producto para Actualizarlo: ");
                    int id1 = teclado.nextInt();
                    int resu = raf.LocalizarID(id1);
                    if (resu == 1) {
                        int id2, ca;
                        String nom, pa, pro, fe;
                        double pre;
                        System.out.println("\nEl archivo se encontro exitosamente, prosiga a actualizar");
                        System.out.println("\nIngrese la fecha de ingreso del nuevo producto:");
                        fe = br.readLine();
                        System.out.println("Ingrese un nuevo ID para el producto");
                        id2 = teclado.nextInt();
                        System.out.println("Ingrese un nuevo nombre para el producto:");
                        nom = br.readLine();
                        System.out.println("Ingrese el precio del producto para actualizar:");
                        pre = teclado.nextDouble();
                        System.out.println("Ingrese la nueva cantidad existente del nuevo producto:");
                        ca = teclado.nextInt();
                        System.out.println("Ingrese el pais de origen del nuevo producto:");
                        pa = br.readLine();
                        System.out.println("Ingrese el proveedor del nuevo producto:");
                        pro = br.readLine();

                        Producto per = new Producto(id2, nom, pre, ca, pa, pro, fe);
                        raf.update(id1, per);
                    } else {
                        System.out.println("\nError al actualizar, ID incorrecto o no existe");
                    }
                    System.out.println("");

                    break;

                //Eliminar/Descartar producto por su ID
                case 5:
                    System.out.println("\nDigite el ID del producto para eliminarlo:");
                    int id3 = teclado.nextInt();
                    boolean flag = raf.delete(id3);
                    if (flag) {
                        System.out.println("\nEliminacion del producto completada");
                    } else {
                        System.out.println("\nError al eliminar, ID incorrecto o el producto no existe");
                    }
                    System.out.println("");
                    break;


                //Salir del programa
                case 6:
                    System.out.println("\nCerrando...");
                    System.out.println("Desarrollador: Jarov Bayardo Davila Larios.");
                    break;
            }
        } while (opcion != 6);
    }

    public static void Menu() {
        System.out.println("1.Agregar un nuevo producto al inventario.");
        System.out.println("2.Mostrar todos los productos que hay en el inventario.");
        System.out.println("3.Buscar producto por su ID.");
        System.out.println("4.Actualizar producto por su ID.");
        System.out.println("5.Eliminar/Descartar producto por su ID.");
        System.out.println("6.Salir del programa.");
    }

}
