/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eduardo
 */
import java.util.List;

public class CalculadorDePrecioConDescuento implements CalculadorDePrecio {
    private double porcentajeDescuento;

    public CalculadorDePrecioConDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public double calcularPrecioTotal(List<Producto> productos) {
        double total = 0.0;
        for (Producto producto : productos) {
            total += producto.calcularPrecioTotal();
        }
        return total * (1 - porcentajeDescuento);
    }
}

