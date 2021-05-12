/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.programacion2.examen.pojo;

/**
 *
 * @author Sistemas-32
 */
public class Empleado {
    private String Nombre;
    private String Apellidos;
    private String Cedula;
    private float Salario;
    private int FechaContratacion;

    public Empleado() {
        
    }

    public Empleado(String Nombre, String Apellidos, String Cedula, float Salario, int FechaContratacion) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Cedula = Cedula;
        this.Salario = Salario;
        this.FechaContratacion = FechaContratacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public float getSalario() {
        return Salario;
    }

    public void setSalario(float Salario) {
        this.Salario = Salario;
    }

    public int getFechaContratacion() {
        return FechaContratacion;
    }

    public void setFechaContratacion(int FechaContratacion) {
        this.FechaContratacion = FechaContratacion;
    }
}
