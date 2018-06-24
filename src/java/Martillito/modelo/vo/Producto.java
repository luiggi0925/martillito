package Martillito.modelo.vo;

public class Producto {
    private String codProd;
    private int tipo;
    private String nomProd;
    private double precio;
    private int stock;
    private String img;
    private String dni_adm;
    
    
            

    public String getCodProd() {
        return codProd;
    }

    public void setCodProd(String codProd) {
        this.codProd = codProd;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getNomProd() {
        return nomProd;
    }

    public void setNomProd(String nomProd) {
        this.nomProd = nomProd;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDni_adm() {
        return dni_adm;
    }

    public void setDni_adm(String dni_adm) {
        this.dni_adm = dni_adm;
    }

}
