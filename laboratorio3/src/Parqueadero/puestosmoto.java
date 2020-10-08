
package Parqueadero;

public class puestosmoto {

    private int numero;
    private String estado;
    private motos moto;
    
    public puestosmoto (int numero){
        this.numero = numero;
        this.estado = "Libre";
    }
    
    public void asignarpuesto(motos moto){
        this.moto=moto;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public motos getMoto() {
        return moto;
    }

    public void setMoto(motos moto) {
        this.moto = moto;
    }

    
    public String libreStringm(){
        return "Puesto: "+this.getNumero()
            +"\nEstado: "+this.getEstado();
    }
    
    public String Datosmoto(){
        return "Puesto Moto N: " + this.getNumero()
            +"\nEstado: " + this.getEstado()
            +"\nPlaca de la moto: "+this.getMoto().getPlaca()
            +"\nHora: "+this.getMoto().getFechaingreso();

    }
}
