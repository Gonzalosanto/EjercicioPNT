/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopnt;

import java.util.ArrayList;
import java.util.Collections;

public class EjercicioPNT_1 {      
    
    public static void main(String[] args) {        
      ArrayList<Producto> lProd = seteoLista();      
      imprimirValores(lProd);                          
    }
    
    public static ArrayList<Producto> seteoLista(){
        
        ArrayList<Producto> listaProd = new ArrayList<>();        
        listaProd.add(new Gaseosa(20, "Coca-Cola Zero", 1.5));
        listaProd.add(new Gaseosa(18, "Coca-Cola", 1.5));
        listaProd.add(new Shampoo(19, "Shampoo Sedal",500 ));
        listaProd.add(new Fruta(64, "Frutilla", "kilo"));        
        return listaProd;        
    }
         
    public static void imprimirValores(ArrayList<Producto> lProd) {
            for(Producto prod : lProd){
                System.out.println(prod.toString());
            }
                System.out.println("======================");            
                Collections.sort(lProd);      
                    System.out.println("Producto más caro: " +lProd.get(lProd.size()-1).getNombre() );
                    System.out.println("Producto más barato: "+ lProd.get(0).getNombre());
        
          
    }
        
}
       
    

