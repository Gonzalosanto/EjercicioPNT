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
public class Producto implements Comparable<Producto> {
    
    public Producto(int precio, String nombre){
        this.nombre=nombre;
        this.precio=precio;
                
    }
    
    @Override
        public int compareTo(Producto prod){  
        if(precio==prod.precio)  
            return 0;  
        else if(precio>prod.precio)  
            return 1;  
        else  
            return -1;  
        }  
        
    private int precio;
    String nombre;  
    
    public int getPrecio(){
    return (this.precio);
    }
    public String getNombre(){
    return (this.nombre);
    }
           
    public void setPrecio(int precio){
        this.precio=precio;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
   
}
