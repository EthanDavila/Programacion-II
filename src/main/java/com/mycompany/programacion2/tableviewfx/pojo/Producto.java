/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.programacion2.tableviewfx.pojo;

/**
 *
 * @author Sistemas-32
 */
public class Producto {
    private int id;
    private String nombre, descripcion;
    private int cantidad;
    private float precio;
    private String imagen;

    public Producto(int id, String nombre, String descripcion, int cantidad, float precio, String imagen) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
        this.imagen = imagen;
    }
}
