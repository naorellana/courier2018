
package com.norellanac.courier2018.models;


public class Tracking {
    //TA_TRACKING
    private int TRACKING_NUMBER, ID_ESTADO,  ID_PAQUETE, ID_FLOTILLA, ID_REMITENTE, ID_DESTINATARIO; 
     private String  FECHA_ENVIO, FECHA_ENTREGA;

    public Tracking() {
    }

    public int getTRACKING_NUMBER() {
        return TRACKING_NUMBER;
    }

    public void setTRACKING_NUMBER(int TRACKING_NUMBER) {
        this.TRACKING_NUMBER = TRACKING_NUMBER;
    }

    public int getID_ESTADO() {
        return ID_ESTADO;
    }

    public void setID_ESTADO(int ID_ESTADO) {
        this.ID_ESTADO = ID_ESTADO;
    }

    public int getID_PAQUETE() {
        return ID_PAQUETE;
    }

    public void setID_PAQUETE(int ID_PAQUETE) {
        this.ID_PAQUETE = ID_PAQUETE;
    }

    public int getID_FLOTILLA() {
        return ID_FLOTILLA;
    }

    public void setID_FLOTILLA(int ID_FLOTILLA) {
        this.ID_FLOTILLA = ID_FLOTILLA;
    }

    public int getID_REMITENTE() {
        return ID_REMITENTE;
    }

    public void setID_REMITENTE(int ID_REMITENTE) {
        this.ID_REMITENTE = ID_REMITENTE;
    }

    public int getID_DESTINATARIO() {
        return ID_DESTINATARIO;
    }

    public void setID_DESTINATARIO(int ID_DESTINATARIO) {
        this.ID_DESTINATARIO = ID_DESTINATARIO;
    }

    public String getFECHA_ENVIO() {
        return FECHA_ENVIO;
    }

    public void setFECHA_ENVIO(String FECHA_ENVIO) {
        this.FECHA_ENVIO = FECHA_ENVIO;
    }

    public String getFECHA_ENTREGA() {
        return FECHA_ENTREGA;
    }

    public void setFECHA_ENTREGA(String FECHA_ENTREGA) {
        this.FECHA_ENTREGA = FECHA_ENTREGA;
    }

    
    
    
}
