package model;

import java.util.ArrayList;
import java.util.List;

public class Articulo {

    private String descripcion;

    private List<RegistroPrecioArticulo> registroPrecioArticulos;

    public Articulo(String descripcion) {
        this.descripcion = descripcion;

        this.registroPrecioArticulos = new ArrayList<>();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<RegistroPrecioArticulo> getRegistroPrecioArticulos() {
        return registroPrecioArticulos;
    }

    public void setRegistroPrecioArticulos(List<RegistroPrecioArticulo> registroPrecioArticulos) {
        this.registroPrecioArticulos = registroPrecioArticulos;
    }
}
