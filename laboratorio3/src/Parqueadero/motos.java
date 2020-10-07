/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parqueadero;

import java.util.Date;

class motos extends Transportes{
 public motos(String Placa, Date fechaingreso){
        this.placa = Placa;
        this.fechaingreso=fechaingreso;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
   
    
}
