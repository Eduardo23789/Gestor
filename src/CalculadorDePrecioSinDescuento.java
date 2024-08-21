/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eduardo
 */
import java.util.List;

public class CalculadorDePrecioSinDescuento implements CalculadorDePrecio {
    @Override
    public double calcularPrecioTotal(List<Producto> productos) {
        double total = 0.0;
        for (Producto producto : productos) {
            total += producto.calcularPrecioTotal();
        }
        return total;
    }
}

