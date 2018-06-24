/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Martillito.modelo;

public class Producto {
    private String cod_prod;
    private String nom_prod;
    private double precio;
    private int stock;

    public Producto(String cod_prod, String nom_prod, double precio, int stock) {
        this.cod_prod = cod_prod;
        this.nom_prod = nom_prod;
        this.precio = precio;
        this.stock = stock;
    }

    public String getCod_prod() {
        return cod_prod;
    }

    public String getNom_prod() {
        return nom_prod;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }
    
}
