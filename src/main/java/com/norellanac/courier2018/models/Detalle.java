
package com.norellanac.courier2018.models;


public class Detalle {
    //TA_DETALLE_FACTURA
    int ID_DETALLE, ID_FACTURA, ID_PAQUETE, NUMERO_UNIDADES ;
    float PRECIO, IVA, TOTAL, GARANTIA;
    
    public Detalle() {
    }

    public int getID_DETALLE() {
        return ID_DETALLE;
    }

    public void setID_DETALLE(int ID_DETALLE) {
        this.ID_DETALLE = ID_DETALLE;
    }

    public int getID_FACTURA() {
        return ID_FACTURA;
    }

    public void setID_FACTURA(int ID_FACTURA) {
        this.ID_FACTURA = ID_FACTURA;
    }

    public int getID_PAQUETE() {
        return ID_PAQUETE;
    }

    public void setID_PAQUETE(int ID_PAQUETE) {
        this.ID_PAQUETE = ID_PAQUETE;
    }

    public int getNUMERO_UNIDADES() {
        return NUMERO_UNIDADES;
    }

    public void setNUMERO_UNIDADES(int NUMERO_UNIDADES) {
        this.NUMERO_UNIDADES = NUMERO_UNIDADES;
    }

    public float getPRECIO() {
        return PRECIO;
    }

    public void setPRECIO(float PRECIO) {
        this.PRECIO = PRECIO;
    }

    public float getIVA() {
        return IVA;
    }

    public void setIVA(float IVA) {
        this.IVA = IVA;
    }

    public float getTOTAL() {
        return TOTAL;
    }

    public void setTOTAL(float TOTAL) {
        this.TOTAL = TOTAL;
    }

    public float getGARANTIA() {
        return GARANTIA;
    }

    public void setGARANTIA(float GARANTIA) {
        this.GARANTIA = GARANTIA;
    }

    
    
    
}