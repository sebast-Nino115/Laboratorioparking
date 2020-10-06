/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parqueadero;

import java.util.Date;

/**
 *
 * @author Acer
 */
class bicicletas extends Transportes {
    public String cedula;

    public bicicletas(String cedula, Date fechaingreso){
        this.cedula=cedula;
        this.fechaingreso=fechaingreso;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
}
