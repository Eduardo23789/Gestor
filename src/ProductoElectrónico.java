/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eduardo
 */
public class ProductoElectrónico extends Producto {
    private int garantia;

    public ProductoElectrónico(String nombre, double precio, int cantidad, Proveedor proveedor, int garantia) {
        super(nombre, precio, cantidad, proveedor);
        this.garantia = garantia;
    }

    @Override
    public String getDetalles() {
        return "Producto Electrónico: " + nombre + ", Precio: " + precio + ", Cantidad: " + cantidad + ", Garantía: " + garantia + " años";
    }

    public int getGarantia() {
        return garantia;
    }
}

