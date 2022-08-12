package model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class RegistroPrecioArticulo {
    private BigDecimal precio;
    private LocalDate fecha;
    private Articulo unArticulo;

    public RegistroPrecioArticulo() {
    }

    public RegistroPrecioArticulo(BigDecimal precio, LocalDate fecha, Articulo unArticulo) {
        this.precio = precio;
        this.fecha = fecha;
        this.unArticulo = unArticulo;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Articulo getUnArticulo() {
        return unArticulo;
    }

    public void setUnArticulo(Articulo unArticulo) {
        this.unArticulo = unArticulo;
    }
}
