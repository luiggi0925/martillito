
package Martillito.modelo;


public class Herramienta extends Producto{
    //String uso_herram;
        String IMG;

/*    public Herramientas(String uso_herram, String cod_prod, String nom_prod, double precio, int stock) {
        super(cod_prod, nom_prod, precio, stock);
        this.uso_herram = uso_herram;
    }*/
      public Herramienta(String cod_prod, String nom_prod, double precio, int stock, String IMG){
        super(cod_prod, nom_prod, precio, stock);
        this.IMG = IMG;
      }  
/*
    public String getUso_herram() {
        return uso_herram;
    }
   */
    public String getIMG(){
        return IMG;
    }
    
}
