/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parqueadero;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Acer
 */
class carros extends Transportes{
  
    public carros(String Placa, Date fechaingreso){
        this.placa = Placa;
        this.fechaingreso=fechaingreso;
    }

    public String getplaca() {
        return placa;
    }

    public void setplaca(String placa) {
        this.placa = placa;
    }
   
}
