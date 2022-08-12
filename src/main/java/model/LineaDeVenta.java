package model;

public class LineaDeVenta {

    private Integer cantidad;
    private Venta unaVenta;
    private Articulo unArticulo;

    public LineaDeVenta() {
    }

    public LineaDeVenta(Integer cantidad, Venta unaVenta, Articulo unArticulo) {
        this.cantidad = cantidad;
        this.unaVenta = unaVenta;
        this.unArticulo = unArticulo;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Venta getUnaVenta() {
        return unaVenta;
    }

    public void setUnaVenta(Venta unaVenta) {
        this.unaVenta = unaVenta;
    }

    public Articulo getUnArticulo() {
        return unArticulo;
    }

    public void setUnArticulo(Articulo unArticulo) {
        this.unArticulo = unArticulo;
    }
}
