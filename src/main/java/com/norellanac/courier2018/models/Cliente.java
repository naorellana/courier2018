
package com.norellanac.courier2018.models;


public class Cliente {

    private int ID_CLIENTE,  ID_DIRECCION, ID_PERSONA, ID_SERVICIO; 
     private String  TELEFONO,NIT;

    public Cliente() {
    }

    public int getID_CLIENTE() {
        return ID_CLIENTE;
    }

    public void setID_CLIENTE(int ID_CLIENTE) {
        this.ID_CLIENTE = ID_CLIENTE;
    }

    public int getID_DIRECCION() {
        return ID_DIRECCION;
    }

    public void setID_DIRECCION(int ID_DIRECCION) {
        this.ID_DIRECCION = ID_DIRECCION;
    }

    public int getID_PERSONA() {
        return ID_PERSONA;
    }

    public void setID_PERSONA(int ID_PERSONA) {
        this.ID_PERSONA = ID_PERSONA;
    }

    public int getID_SERVICIO() {
        return ID_SERVICIO;
    }

    public void setID_SERVICIO(int ID_SERVICIO) {
        this.ID_SERVICIO = ID_SERVICIO;
    }

    public String getTELEFONO() {
        return TELEFONO;
    }

    public void setTELEFONO(String TELEFONO) {
        this.TELEFONO = TELEFONO;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }
    
}
