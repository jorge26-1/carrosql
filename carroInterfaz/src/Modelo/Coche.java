
package Modelo;

import Modelo.Vehiculo;

public class Coche extends Vehiculo {
    private int numeroPuertas;
    private String marca;
    private String tipoCombustible;
    private String caracteristicasAdicionales;

   
    public Coche() {
        super();
        this.numeroPuertas = 4;
        this.marca = "";
        this.tipoCombustible = "";
        this.caracteristicasAdicionales = "";
    }

    
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    
    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    
    public String getCaracteristicasAdicionales() {
        return caracteristicasAdicionales;
    }

    public void setCaracteristicasAdicionales(String caracteristicasAdicionales) {
        this.caracteristicasAdicionales = caracteristicasAdicionales;
    }

    
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Número de puertas: " + numeroPuertas);
        System.out.println("Marca: " + marca);
        System.out.println("Tipo de combustible: " + tipoCombustible);
        System.out.println("Características adicionales: " + caracteristicasAdicionales);
    }
}


