package Servicios;

import Implement.Operaciones;
import POJO.Empleados;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class NominaService {
    Operaciones servidor;
    Scanner scan;

    public NominaService(Scanner scan){
        this.scan = scan;
        servidor = new Operaciones();
    }

    public void add() throws IOException {
        int id;
        String nombre;
        String cargo;
        double salario_devengado;
        double INSS_L;
        double IR;
        double INSS_P;
        double salario_neto;
        double INATEC;
        double vacaciones;
        double treceavo_mes;
        double indemnizacion;
        Empleados e;

        System.out.println("Numero del empleado");
        id = scan.nextInt();

        scan.nextLine();
        System.out.println("Nombre del empleado");
        nombre = scan.nextLine();

        System.out.println("Cargo del empleado");
        cargo = scan.nextLine();

        System.out.println("Salario por hora");
        double salario_horas = scan.nextDouble();
        salario_devengado = salario_horas * 240;

        System.out.println("Trabajó horas extras?");
        int op;
        do {
            subMenu();
            op = scan.nextInt();

            switch (op) {
                case 1:
                    System.out.println("¿Cuantas horas extras trabajo?");
                    double horas_Ex = scan.nextDouble();
                    salario_devengado += (horas_Ex * salario_horas);
                    break;

                case 2:
                    break;
                default:
                    System.out.println("Seleccione una opcion válida...");
                    break;
            }

        } while (op < 1 || op > 2);

        //Deducciones
        INSS_L = salario_devengado * 0.07;
        IR = calculoIR(salario_devengado - INSS_L);
        salario_neto = salario_devengado - INSS_L - IR; // Salario neto =  salario devengado - Deducciones

        //Prestaciones sociales
        INSS_P = salario_devengado * 0.215;
        INATEC = salario_devengado * 0.02;
        vacaciones = salario_devengado * 0.08333;
        treceavo_mes = vacaciones;
        indemnizacion = vacaciones;

        e = new Empleados(id, nombre, cargo, salario_devengado, INSS_L, IR, INSS_P, INATEC, salario_neto, vacaciones, treceavo_mes, indemnizacion);

        servidor.create(e);
        System.out.println("Empleado guardado correctamente");
    }

    private double calculoIR(double salario_devengado) {
        double IR = 0;
        if (salario_devengado >= 0.01 && salario_devengado <= 8333.33){
            return IR;
        }else if(salario_devengado > 8333.33 && salario_devengado <= 16666.66){
            IR = (salario_devengado - 8333.33) * 0.15;
            return IR;
        }else if(salario_devengado > 16666.66 && salario_devengado <= 29166.66){
            IR = (salario_devengado-16666.66) * 0.20 + 1250;
            return IR;
        }else if(salario_devengado > 29166.66 && salario_devengado <= 41666.66){
            IR = (salario_devengado-29166.66) * 0.25 + 3750;
            return IR;
        }else if(salario_devengado > 41666.66){
            IR = (salario_devengado-41666.66) * 0.30 + 6875;
        }
        return IR;
    }

    public static void subMenu() {
        System.out.println("1) Si trabajo horas extras");
        System.out.println("2) No trabajo horas extras");
    }

    public void findByID() throws IOException {
        int id;
        Empleados e;
        System.out.println("Ingrese el ID del empleado a buscar: ");
        id = scan.nextInt();

        e = servidor.optionFindByID(id);

        if (e == null){
            System.out.println("Empleado no existente");
        }else {
            showID(e);
            System.out.println(" ");
        }
    }

    public void delete() throws IOException {
        int id;
        Empleados e;
        System.out.println("Ingrese el ID del empleado a eliminar");
        id = scan.nextInt();

        e = servidor.findById(id);

        if (e == null){
            System.out.println("Empleado no existente");
        }else{
            servidor.delete(e);
            System.out.println("Empleado removido");
        }
    }

    public void showID(Empleados e){
        printID(e);
    }

    public static void headerID(){
        System.out.format("%5s %20s %20s \n%1s \n","Id","Nombre","Cargo","-----------------------------------------------------------------------");
    }

    public static void printID(Empleados e) {
        headerID();
        System.out.format("%5s %20s %20s",e.getId(),e.getNombre(),e.getCargo());
    }

    public void show() throws IOException {
        List<Empleados> empleados = servidor.nomina();
        print(empleados);
        System.out.println(" ");
    }

    public static void header(){
        System.out.println("\nNombre de la empresa: Los Vientos-Tones S.A");
        System.out.println("Mes: \t Febrero");
        System.out.println("Impreso el: \t" + new Date());
        System.out.format("%5s %20s %20s %15s %10s %7s %12s %8s %8s %12s %15s %15s \n%1s \n","Id","Nombre","Cargo","Salario Bruto","INNS L","IR","Salario neto","INNS P","INATEC","Vacaciones","Treceavo Mes","Indemnizacion","-----------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    public static void print(List<Empleados> empleados){
        header();
        for (Empleados e : empleados) {
            System.out.format("%5s %20s %20s %15.2f %10.2f %7.2f %12.2f %8.2f %8.2f %12.2f %15.2f %15.2f \n",e.getId(),e.getNombre(),e.getCargo(),e.getSalario_devengado(),e.getINSS_L(),e.getIR(),e.getSalario_neto(),e.getINSS_P(),e.getINATEC(),e.getVacaciones(),e.getTreceavo_mes(),e.getIndemnizacion());
        }
    }

    public void update() throws IOException{
        int id;
        String nombre;
        String cargo;
        double salario_devengado;
        double INSS_L;
        double IR;
        double INSS_P;
        double salario_neto;
        double INATEC;
        double vacaciones;
        double treceavo_mes;
        double indemnizacion;
        Empleados e;

        System.out.println("Ingrese el ID del empleado a buscar: ");
        id = scan.nextInt();

        e = servidor.findById(id);

        if (e == null){
            System.out.println("No se encontró el empleado");
        }else {
            scan.nextLine();
            System.out.println("Nombre del empleado");
            nombre = scan.nextLine();

            System.out.println("Cargo del empleado");
            cargo = scan.nextLine();

            System.out.println("Salario por hora");
            double salario_horas = scan.nextDouble();
            salario_devengado = salario_horas * 240;

            System.out.println("Trabajó horas extras?");
            int op;
            do {
                subMenu();
                op = scan.nextInt();

                switch (op) {
                    case 1:
                        System.out.println("¿Cuantas horas extras trabajo?");
                        double horas_Ex = scan.nextDouble();
                        salario_devengado += (horas_Ex * salario_horas);
                        break;

                    case 2:
                        break;
                    default:
                        System.out.println("Seleccione una opcion válida...");
                        break;
                }

            } while (op < 1 || op > 2);

            //Deducciones
            INSS_L = salario_devengado * 0.07;
            IR = calculoIR(salario_devengado - INSS_L);
            salario_neto = salario_devengado - INSS_L - IR; // Salario neto =  salario devengado - Deducciones

            //Prestaciones sociales
            INSS_P = salario_devengado * 0.215;
            INATEC = salario_devengado * 0.02;
            vacaciones = salario_devengado * 0.08333;
            treceavo_mes = vacaciones;
            indemnizacion = vacaciones;

            e = new Empleados(id, nombre, cargo, salario_devengado, INSS_L, IR, INSS_P, INATEC, salario_neto, vacaciones, treceavo_mes, indemnizacion);

            servidor.update(e);
            System.out.println("Empleado actualizado correctamente");
        }
    }
}
