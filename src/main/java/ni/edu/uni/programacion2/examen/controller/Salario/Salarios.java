/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.programacion2.examen.controller.Salario;

/**
 *
 * @author Sistemas-32
 */
public class Salarios {
    public static float CalcularINSS(float Salario){
        return (Salario * 0.07f);
    }
    
    public static float CalcularSalarioAnual(float Salario){
        return (Salario - CalcularINSS(Salario) * 12);
    }
    
    public static float CalcularIR(float Salario){
        float Excedente = 0;
        float Tasa;
        if(CalcularSalarioAnual(Salario) <= 100000.00f){
            Excedente = 0;
        }
        else if (CalcularSalarioAnual(Salario) > 100000.00f && CalcularSalarioAnual(Salario) <= 200000.00f){
            Excedente = 0;
        }
        return (CalcularSalarioAnual(Salario));
    }
    
    public static int CalcularAntiguedad(int FechaContrato){
        return (2021 - FechaContrato);
    }
    
    public static float CalcularSalarioNeto(float Salario){
        return (Salario - CalcularINSS(Salario) - CalcularIR(Salario));
    }
}
