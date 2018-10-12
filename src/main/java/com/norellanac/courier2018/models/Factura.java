
package com.norellanac.courier2018.models;


public class Factura {
    private int ID_FACTURA, ID_CLIENTE ;
    String FECHA;

    public Factura() {
    }

    public int getID_FACTURA() {
        return ID_FACTURA;
    }

    public void setID_FACTURA(int ID_FACTURA) {
        this.ID_FACTURA = ID_FACTURA;
    }

    public int getID_CLIENTE() {
        return ID_CLIENTE;
    }

    public void setID_CLIENTE(int ID_CLIENTE) {
        this.ID_CLIENTE = ID_CLIENTE;
    }

    public String getFECHA() {
        return FECHA;
    }

    public void setFECHA(String FECHA) {
        this.FECHA = FECHA;
    }

    
    
}
