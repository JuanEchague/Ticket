package controller;

import model.Articulo;
import model.Venta;

public class VentaController {
    private Venta nuevaVenta;

    public VentaController(Venta nuevaVenta) {
        this.nuevaVenta = nuevaVenta;
    }

    public Venta crearNuevaVenta(){
        int posicionUltimeElemento = this.nuevaVenta.getUnaEmpresa().getVentas().size()-1;
        int cantidad = this.nuevaVenta.getUnaEmpresa().getVentas().get(posicionUltimeElemento).getNumeroDeVenta();
        this.nuevaVenta.setNumeroDeVenta(cantidad+1);
        return null;
    }

    public Articulo buscarAticulo(){
        return null;
    }

    public void agregarArticulo(){

    }

    public Venta finalizarVenta(){
        return null;
    }

}
