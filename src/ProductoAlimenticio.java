/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eduardo
 */
import java.util.Date;

public class ProductoAlimenticio extends Producto {
    private Date fechaDeCaducidad;

    public ProductoAlimenticio(String nombre, double precio, int cantidad, Proveedor proveedor, Date fechaDeCaducidad) {
        super(nombre, precio, cantidad, proveedor);
        this.fechaDeCaducidad = fechaDeCaducidad;
    }

    @Override
    public String getDetalles() {
        return "Producto Alimenticio: " + nombre + ", Precio: " + precio + ", Cantidad: " + cantidad + ", Fecha de Caducidad: " + fechaDeCaducidad;
    }

    public Date getFechaDeCaducidad() {
        return fechaDeCaducidad;
    }
}

