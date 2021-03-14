package Pojo;

public class Producto {
    private int id;//4
    private String nombre_producto;//35
    private double precio;//8
    private int cantidad;//4
    private String pais_origen;//23
    private String proveedor;//35
    private String Date;//23
    
    // 4 + 35 + 8 + 4 + 23 + 35 + 23 = 132

    public Producto() {
        
    }

    public Producto(int id, String nombre_producto, double precio, int cantidad, String pais_origen, String proveedor, String Date) {
        this.id = id;
        this.nombre_producto = nombre_producto;
        this.precio = precio;
        this.cantidad = cantidad;
        this.pais_origen = pais_origen;
        this.proveedor = proveedor;
        this.Date = Date;        
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getPais_origen() {
        return pais_origen;
    }

    public void setPais_origen(String pais_origen) {
        this.pais_origen = pais_origen;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
    
    public String getDate(){
        return Date;
    }
    
    public void setDate(String Date){
        this.Date = Date;
    }
    
    public String toString(){
        return "Fecha de ingreso: "+getDate()+"\nID: "+getId()+"\nNombre del producto: "+getNombre_producto()+""
                + "\nPrecio: $"+getPrecio()+"\nCantidad: "+getCantidad()+" unidades"+"\nPais de origen: "+getPais_origen()+"\n"
                + "Proveedor: "+getProveedor();
    }
}
