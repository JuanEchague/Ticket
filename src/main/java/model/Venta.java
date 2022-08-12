package model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Venta {
    private LocalDateTime hora;
    private LocalDate fecha;

    private Integer numeroDeVenta;

    private Iva unaIva;

    private Empresa unaEmpresa;

    private List<LineaDeVenta> lineaDeVentas;

    public Venta() {
        this.lineaDeVentas = new ArrayList<>();
    }

    public Venta(LocalDateTime hora, LocalDate fecha, Integer numeroDeVenta, Iva unaIva) {
        this.hora = hora;
        this.fecha = fecha;
        this.numeroDeVenta = numeroDeVenta;
        this.unaIva = unaIva;

        this.lineaDeVentas = new ArrayList<>();
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public void setHora(LocalDateTime hora) {
        this.hora = hora;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Integer getNumeroDeVenta() {
        return numeroDeVenta;
    }

    public void setNumeroDeVenta(Integer numeroDeVenta) {
        this.numeroDeVenta = numeroDeVenta;
    }

    public Iva getUnaIva() {
        return unaIva;
    }

    public void setUnaIva(Iva unaIva) {
        this.unaIva = unaIva;
    }

    public List<LineaDeVenta> getLineaDeVentas() {
        return lineaDeVentas;
    }

    public void setLineaDeVentas(List<LineaDeVenta> lineaDeVentas) {
        this.lineaDeVentas = lineaDeVentas;
    }

    public Empresa getUnaEmpresa() {
        return unaEmpresa;
    }

    public void setUnaEmpresa(Empresa unaEmpresa) {
        this.unaEmpresa = unaEmpresa;
    }
}
