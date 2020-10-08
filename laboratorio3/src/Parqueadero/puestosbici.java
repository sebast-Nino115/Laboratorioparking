
package Parqueadero;
public class puestosbici {
    private int numero;
    private String estado;
    private bicicletas Bici;
    
    public puestosbici(int numero){
        this.numero = numero;
        this.estado = "Libre";
    }
    
    public void asignarpuesto(bicicletas Bici){
        this.Bici = Bici;
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

    public bicicletas getBici() {
        return Bici;
    }

    public void setBici(bicicletas Bici) {
        this.Bici = Bici;
    }

    public String libreStringb(){
        return "Puesto : "+this.getNumero()
            +"\nEstado: "+this.getEstado();
    }
    
    public String Datosbici(){
        return "Puesto Bicicleta N: "+this.getNumero()
            +"\nEstado: "+this.getEstado()
            +"\nNumero de cedula: "+this.getBici().getCedula()
            +"\nHora: "+this.getBici().getFechaingreso();
    }
}
