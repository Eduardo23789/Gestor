/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eduardo
 */
import java.util.ArrayList;
import java.util.List;

public class GestorDeInventario {
    private List<Producto> productos;
    private CalculadorDePrecio calculadorDePrecio;

    public GestorDeInventario(CalculadorDePrecio calculadorDePrecio) {
        this.productos = new ArrayList<>();
        this.calculadorDePrecio = calculadorDePrecio;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public double calcularPrecioTotal() {
        return calculadorDePrecio.calcularPrecioTotal(productos);
    }
}

