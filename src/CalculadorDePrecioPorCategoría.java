/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eduardo
 */
import java.util.List;

public class CalculadorDePrecioPorCategoría implements CalculadorDePrecio {
    private String nombreCategoría;

    public CalculadorDePrecioPorCategoría(String nombreCategoría) {
        this.nombreCategoría = nombreCategoría;
    }

    @Override
    public double calcularPrecioTotal(List<Producto> productos) {
        double total = 0.0;
        for (Producto producto : productos) {
            if (producto instanceof Categoría) {
                Categoría categoría = (Categoría) producto;
                if (categoría.getNombre().equals(nombreCategoría)) {
                    total += producto.calcularPrecioTotal();
                }
            }
        }
        return total;
    }
}

