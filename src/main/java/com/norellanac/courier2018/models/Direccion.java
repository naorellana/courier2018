
package com.norellanac.courier2018.models;


public class Direccion {

    public int getID_DIRECCION() {
        return ID_DIRECCION;
    }

    public void setID_DIRECCION(int ID_DIRECCION) {
        this.ID_DIRECCION = ID_DIRECCION;
    }

    public int getID_MUN() {
        return ID_MUN;
    }

    public void setID_MUN(int ID_MUN) {
        this.ID_MUN = ID_MUN;
    }

    public String getCALLE() {
        return CALLE;
    }

    public void setCALLE(String CALLE) {
        this.CALLE = CALLE;
    }

    public String getAVENIDA() {
        return AVENIDA;
    }

    public void setAVENIDA(String AVENIDA) {
        this.AVENIDA = AVENIDA;
    }

    public String getZONA() {
        return ZONA;
    }

    public void setZONA(String ZONA) {
        this.ZONA = ZONA;
    }
    private int ID_DIRECCION, ID_MUN ;
    private String CALLE, AVENIDA, ZONA;

    public Direccion() {
    }

}
