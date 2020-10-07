
package Parqueadero;

public class puestosmoto {
    private int numero;
    private String estado;

    public motos getMoto() {
        return moto;
    }

    public void setMoto(motos moto) {
        this.moto = moto;
    }
    private motos moto;
    
    public puestosmoto (int numero){
        this.numero = numero;
        this.estado = "Libre";
    }
    
    public void asignarpuesto(motos moto){
        this.moto = moto;
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

   
    
    
    public String libreStringc(){
        return "Puesto: "+this.getNumero()
            +"\nEstado: "+this.getEstado();
    }
    
    public String Datoscarro(){
        return "Puesto: " + this.getNumero()
            +"\nEstado: " + this.getEstado();
           /* +"\nPlaca del carro: "+this.getcarro().getplaca()
            +"\nHora: "+this.getcarro().getFechaingreso();
*/
    }
}
