package POJO;

public class Empleados {
    private int id;
    private String nombre;
    private String cargo;
    private double salario_devengado;
    private double INSS_L;
    private double IR;
    private double INSS_P;
    private double INATEC;
    private double salario_neto;
    private double vacaciones;
    private double treceavo_mes;
    private double indemnizacion;

    public Empleados(int id, String nombre, String cargo, double salario_devengado, double INSS_L, double IR, double INSS_P, double INATEC, double salario_neto, double vacaciones, double treceavo_mes, double indemnizacion) {
        this.id = id;
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario_devengado = salario_devengado;
        this.INSS_L = INSS_L;
        this.IR = IR;
        this.INSS_P = INSS_P;
        this.INATEC = INATEC;
        this.salario_neto = salario_neto;
        this.vacaciones = vacaciones;
        this.treceavo_mes = treceavo_mes;
        this.indemnizacion = indemnizacion;
    }

    public Empleados() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario_devengado() {
        return salario_devengado;
    }

    public void setSalario_devengado(double salario_devengado) {
        this.salario_devengado = salario_devengado;
    }

    public double getINSS_L() {
        return INSS_L;
    }

    public void setINSS_L(double INSS_L) {
        this.INSS_L = INSS_L;
    }

    public double getIR() {
        return IR;
    }

    public void setIR(double IR) {
        this.IR = IR;
    }

    public double getINSS_P() {
        return INSS_P;
    }

    public void setINSS_P(double INSS_P) {
        this.INSS_P = INSS_P;
    }

    public double getINATEC() {
        return INATEC;
    }

    public void setINATEC(double INATEC) {
        this.INATEC = INATEC;
    }

    public double getSalario_neto() {
        return salario_neto;
    }

    public void setSalario_neto(double salario_neto) {
        this.salario_neto = salario_neto;
    }

    public double getVacaciones() {
        return vacaciones;
    }

    public void setVacaciones(double vacaciones) {
        this.vacaciones = vacaciones;
    }

    public double getTreceavo_mes() {
        return treceavo_mes;
    }

    public void setTreceavo_mes(double treceavo_mes) {
        this.treceavo_mes = treceavo_mes;
    }

    public double getIndemnizacion() {
        return indemnizacion;
    }

    public void setIndemnizacion(double indemnizacion) {
        this.indemnizacion = indemnizacion;
    }
}