/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

/**
 *
 * @author Ethan Dávila
 */
public class Producto {
    String Nombre;
    int NoExistencias;
    String Marca;
    String Modelo;
    float Precio;

    public Producto() {
        
    }

    public Producto(String Nombre, int NoExistencias, String Marca, String Modelo, float Precio) {
        this.Nombre = Nombre;
        this.NoExistencias = NoExistencias;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Precio = Precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getNoExistencias() {
        return NoExistencias;
    }

    public void setNoExistencias(int NoExistencias) {
        this.NoExistencias = NoExistencias;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    @Override
    public String toString() {
        return "Producto [" + "Nombre: " + Nombre + ", NoExistencias: " + NoExistencias + ", Marca: " + Marca + ", Modelo: " + Modelo + ", Precio: " + Precio + ']';
    }
}