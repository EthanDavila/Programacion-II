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
public class EmpleadoTable {
    private String DatosEmpleado;
    private float INSS;
    private float IR;
    private int Antiguedad;
    private float Salario_Neto;

    public EmpleadoTable() {
    }

    public EmpleadoTable(String DatosEmpleado, float INSS, float IR, int Antiguedad, float Salario_Neto) {
        this.DatosEmpleado = DatosEmpleado;
        this.INSS = INSS;
        this.IR = IR;
        this.Antiguedad = Antiguedad;
        this.Salario_Neto = Salario_Neto;
    }

    public String getDatosEmpleado() {
        return DatosEmpleado;
    }

    public void setDatosEmpleado(String DatosEmpleado) {
        this.DatosEmpleado = DatosEmpleado;
    }

    public float getINSS() {
        return INSS;
    }

    public void setINSS(float INSS) {
        this.INSS = INSS;
    }

    public float getIR() {
        return IR;
    }

    public void setIR(float IR) {
        this.IR = IR;
    }

    public int getAntiguedad() {
        return Antiguedad;
    }

    public void setAntiguedad(int Antiguedad) {
        this.Antiguedad = Antiguedad;
    }

    public float getSalario_Neto() {
        return Salario_Neto;
    }

    public void setSalario_Neto(float Salario_Neto) {
        this.Salario_Neto = Salario_Neto;
    }
}
