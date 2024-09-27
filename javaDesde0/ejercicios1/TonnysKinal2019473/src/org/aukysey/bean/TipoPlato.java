package org.aukysey.bean;



public class TipoPlato {
 
    private int codigoTipoPlato;
    private String descripciontipo;

    public TipoPlato() {

    }


    public TipoPlato(int codigoTipoPlato, String descripciontipo) {
        this.codigoTipoPlato = codigoTipoPlato;
        this.descripciontipo = descripciontipo;
    }

    public int getCodigoTipoPlato() {
        return codigoTipoPlato;
    }

    public void setCodigoTipoPlato(int codigoTipoPlato) {
        this.codigoTipoPlato = codigoTipoPlato;
    }

    public String getDescripciontipo() {
        return descripciontipo;
    }

    public void setDescripciontipo(String descripciontipo) {
        this.descripciontipo = descripciontipo;
    }
    
    
    
}
