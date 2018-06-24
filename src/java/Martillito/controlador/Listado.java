/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Martillito.controlador;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import Martillito.modelo.Herramienta;


public class Listado {
    ArrayList<Herramienta> listaHerramientas = new ArrayList<>();
    
    public void registrarProducto(Herramienta objHerramientas){
        listaHerramientas.add(objHerramientas);
    }
    
    public Map<Integer,Object> getProducto(){
        Map<Integer,Object> listaProducto = new HashMap<>();
        listaProducto.put(1, listaHerramientas);
        return listaProducto;
    }
    
    
    public ArrayList<Herramienta> getListaHerramientas(){
        return listaHerramientas;
    }
    public Herramienta getProducto(String cod_prod){
           for(Herramienta h:listaHerramientas){
               if(cod_prod.equals(h.getCod_prod())){
                   return h;
               }
           }
           return null;
    }  
}
