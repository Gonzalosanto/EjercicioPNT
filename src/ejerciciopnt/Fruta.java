/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopnt;

/**
 *
 * @author Gonzalo
 */
public class Fruta extends Producto {
    
  private String unidadDeVenta;
    public Fruta(int precio, String nombre, String unidadDeVenta) {
        super(precio, nombre);
        this.unidadDeVenta=unidadDeVenta;
    }
    /**
     * @return the unidadDeVenta
     */
    public String getUnidadDeVenta() {
        return unidadDeVenta;
    }

    /**
     * @param unidadDeVenta the unidadDeVenta to set
     */
    public void setUnidadDeVenta(String unidadDeVenta) {
        this.unidadDeVenta = unidadDeVenta;
    }
     @Override
    public String toString(){
        return "Nombre: "+ this.getNombre()+" /// Precio: $"+ this.getPrecio()+ " /// Unidad de venta: "+this.getUnidadDeVenta();
    }    
}
