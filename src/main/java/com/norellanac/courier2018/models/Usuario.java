
package com.norellanac.courier2018.models;


public class Usuario {
    private int ID_USUARIO;
    private String TIPOUSUARIO,PASS;

    public Usuario() {
    }

    public int getID_USUARIO() {
        return ID_USUARIO;
    }

    public void setID_USUARIO(int ID_USUARIO) {
        this.ID_USUARIO = ID_USUARIO;
    }

    public String getTIPOUSUARIO() {
        return TIPOUSUARIO;
    }

    public void setTIPOUSUARIO(String TIPOUSUARIO) {
        this.TIPOUSUARIO = TIPOUSUARIO;
    }

    public String getPASS() {
        return PASS;
    }

    public void setPASS(String PASS) {
        this.PASS = PASS;
    }
    
    
}
