package model;

import java.math.BigDecimal;

public class Iva {
    private BigDecimal porcentaje;
    private String descripcion;

    public Iva() {
    }

    public Iva(BigDecimal porcentaje, String descripcion) {
        this.porcentaje = porcentaje;
        this.descripcion = descripcion;
    }

    public BigDecimal getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(BigDecimal porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
