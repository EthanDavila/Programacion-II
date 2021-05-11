/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.programacion2.depresiacion.pojo;

/**
 *
 * @author Sistemas-32
 */
public class Activo {
    private String nombre;
    private float valorA;
    private String tipoA;
    private float valorS;

    public Activo(String nombre, float valorA, String tipoA, float valorS) {
        this.nombre = nombre;
        this.valorA = valorA;
        this.tipoA = tipoA;
        this.valorS = valorS;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getValorA() {
        return valorA;
    }

    public void setValorA(float valorA) {
        this.valorA = valorA;
    }

    public String getTipoA() {
        return tipoA;
    }

    public void setTipoA(String tipoA) {
        this.tipoA = tipoA;
    }

    public float getValorS() {
        return valorS;
    }

    public void setValorS(float valorS) {
        this.valorS = valorS;
    }
    
}
