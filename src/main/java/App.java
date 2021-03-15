import Servicios.NominaService;

import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws InterruptedException, IOException {
        Scanner sc = new Scanner(System.in);
        int opc_menu_principal;
        boolean flag = true;
        NominaService nService = new NominaService(sc);

        do {
            menu_principal();
            opc_menu_principal = sc.nextInt();

            switch (opc_menu_principal) {
                case 1 -> {
                    System.out.println(" ");
                    nService.add();
                    System.out.println(" ");
                    Thread.sleep(2000);
                }
                case 2 -> {
                    System.out.println(" ");
                    nService.update();
                    System.out.println(" ");
                    Thread.sleep(2000);
                }
                case 3 -> {
                    System.out.println(" ");
                    nService.findByID();
                    System.out.println(" ");
                    Thread.sleep(2000);
                }
                case 4 -> {
                    System.out.println(" ");
                    nService.delete();
                    System.out.println(" ");
                    Thread.sleep(2000);
                }
                case 5 -> {
                    System.out.println(" ");
                    nService.show();
                    System.out.println(" ");
                    Thread.sleep(2000);
                }
                case 6 -> {
                    System.out.println(" ");
                    System.out.println("Saliendo....");
                    Thread.sleep(2000);
                    flag = false;
                }
                default -> {
                    System.out.println(" ");
                    System.out.println("Ingrese una opción correcta");
                    Thread.sleep(2000);
                }
            }
        }while (flag);
    }
    public static void menu_principal(){
        System.out.println("--------------------------------------");
        System.out.println("1. Registrar empleado");
        System.out.println("2. Actualizar empleado");
        System.out.println("3. Buscar empleado por ID");
        System.out.println("4. Eliminar empleado");
        System.out.println("5. Ver nómina");
        System.out.println("6. Salir");
        System.out.println("--------------------------------------");
        System.out.print("Opción: ");
    }
}