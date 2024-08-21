/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eduardo
 */
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Proveedor proveedor1 = new Proveedor("Proveedor 1");
        Proveedor proveedor2 = new Proveedor("Proveedor 2");

        Producto producto1 = new ProductoElectrónico("Televisor", 500.0, 10, proveedor1, 2);
        Producto producto2 = new ProductoAlimenticio("Leche", 1.5, 100, proveedor2, new Date());

        Categoría categoríaElectrónica = new Categoría("Electrónica");
        Categoría categoríaAlimenticia = new Categoría("Alimenticia");

        categoríaElectrónica.agregarProducto(producto1);
        categoríaAlimenticia.agregarProducto(producto2);

        GestorDeInventario gestor = new GestorDeInventario(new CalculadorDePrecioConDescuento(0.1));
        gestor.agregarProducto(producto1);
        gestor.agregarProducto(producto2);

        double total = gestor.calcularPrecioTotal();
        System.out.println("Precio total del inventario: " + total);
    }
}

