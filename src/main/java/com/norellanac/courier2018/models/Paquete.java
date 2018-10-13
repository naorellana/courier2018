
package com.norellanac.courier2018.models;


public class Paquete {
    //TA_PAQUETE
    private int ID_PAQUETE, PESO ;
    String TIPO_PAQUETE, UNIDADES;
    
    public Paquete() {
    }

    public int getID_PAQUETE() {
        return ID_PAQUETE;
    }

    public void setID_PAQUETE(int ID_PAQUETE) {
        this.ID_PAQUETE = ID_PAQUETE;
    }

    public int getPESO() {
        return PESO;
    }

    public void setPESO(int PESO) {
        this.PESO = PESO;
    }


    public String getTIPO_PAQUETE() {
        return TIPO_PAQUETE;
    }

    public void setTIPO_PAQUETE(String TIPO_PAQUETE) {
        this.TIPO_PAQUETE = TIPO_PAQUETE;
    }

    public String getUNIDADES() {
        return UNIDADES;
    }

    public void setUNIDADES(String UNIDADES) {
        this.UNIDADES = UNIDADES;
    }
    
    
}