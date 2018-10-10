
package com.norellanac.courier2018.models;


public class Persona {
    /*TA_PERSONA
    -no lleva edad
    -no lleva idpersona
    -no lleva nacionalidad
    */
    private int ID_PERSONA,  EDAD; 
    Double DPI;
    private String  NOMBRES,APELLIDOS, NACIONALIDAD;

    public Persona() {
    }

    public long getID_PERSONA() {
        return ID_PERSONA;
    }

    public void setID_PERSONA(int ID_PERSONA) {
        this.ID_PERSONA = ID_PERSONA;
    }

    public Double getDPI() {
        return DPI;
    }

    public void setDPI(Double DPI) {
        this.DPI = DPI;
    }

    public int getEDAD() {
        return EDAD;
    }

    public void setEDAD(int EDAD) {
        this.EDAD = EDAD;
    }

    public String getNOMBRES() {
        return NOMBRES;
    }

    public void setNOMBRES(String NOMBRES) {
        this.NOMBRES = NOMBRES;
    }

    public String getAPELLIDOS() {
        return APELLIDOS;
    }

    public void setAPELLIDOS(String APELLIDOS) {
        this.APELLIDOS = APELLIDOS;
    }

    public String getNACIONALIDAD() {
        return NACIONALIDAD;
    }

    public void setNACIONALIDAD(String NACIONALIDAD) {
        this.NACIONALIDAD = NACIONALIDAD;
    }
    
}
