package model;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private List<Venta> ventas;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.ventas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }
}
