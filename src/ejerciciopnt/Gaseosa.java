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
public class Gaseosa extends Producto {
    public Gaseosa(int precio, String nombre, double litros){
        super(precio, nombre);
        this.litros=litros;
    }
    
    private double litros;

    /**
     * @return the litros
     */
    public double getLitros() {
        return litros;
    }

    /**
     * @param litros the litros to set
     */
    public void setLitros(double litros) {
        this.litros = litros;
    }
   
   @Override
    public String toString(){
        return "Nombre: "+ this.getNombre()+" /// Litros: "+ this.getLitros()+ " /// Precio: $"+this.getPrecio();
    }    
    
}
