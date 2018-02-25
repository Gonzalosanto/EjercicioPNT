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
public class Shampoo extends Producto {
    
    
   private int contenido;

    public Shampoo(int precio, String nombre, int contenido) {
        super(precio, nombre);
        this.contenido=contenido;
    }

    /**
     * @return the contenido
     */
    public int getContenido() {
        return contenido;
    }

    /**
     * @param contenido the contenido to set
     */
    public void setContenido(int contenido) {
        this.contenido = contenido;
    }
    
     @Override
    public String toString(){
        return "Nombre: "+ this.getNombre()+" /// Contenido: "+ this.getContenido()+ "ml /// Precio: $"+this.getPrecio();
    }    
}
