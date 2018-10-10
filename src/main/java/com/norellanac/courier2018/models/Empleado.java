
package com.norellanac.courier2018.models;


public class Empleado {

    private int ID_EMPLEADO,  ID_USUARIO, ID_PERSONA, ID_SERVICIO; 
     private String  AREA_PUESTO;
     float SALARIO;

    public Empleado() {
    }

    public int getID_EMPLEADO() {
        return ID_EMPLEADO;
    }

    public void setID_EMPLEADO(int ID_EMPLEADO) {
        this.ID_EMPLEADO = ID_EMPLEADO;
    }

    public int getID_USUARIO() {
        return ID_USUARIO;
    }

    public void setID_USUARIO(int ID_USUARIO) {
        this.ID_USUARIO = ID_USUARIO;
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

    public String getAREA_PUESTO() {
        return AREA_PUESTO;
    }

    public void setAREA_PUESTO(String AREA_PUESTO) {
        this.AREA_PUESTO = AREA_PUESTO;
    }

    public float getSALARIO() {
        return SALARIO;
    }

    public void setSALARIO(float SALARIO) {
        this.SALARIO = SALARIO;
    }
        
    
}
