
package Parqueadero;

 import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Logicaparqueadero {
public int vacantescarros=12;
public int vacantesmotos=8;
public int vacantesbicicletas=6;

public ArrayList<puestosbici> Puestob;
public ArrayList<puestoscarro> Puestoc;
public ArrayList<puestosmoto> Puestom;
public ArrayList<carros> Listadocarros;
public ArrayList<motos> Listadomotos;
public ArrayList<bicicletas> Listadobicicletas;

//constructor
public Logicaparqueadero(){

 this.Listadocarros= new ArrayList<carros>();
 this.Listadomotos= new ArrayList<motos>();
 this.Listadobicicletas = new ArrayList<bicicletas>();
 
 this.Puestob = new  ArrayList<puestosbici>();
 this.Puestoc = new ArrayList<puestoscarro>();
 this.Puestom= new ArrayList<puestosmoto>();
 
 this.crearPuestosBici();
 this.crearPuestosCarro();
 this.crearPuestosMoto();
}
//cantidadde puestos
    private void crearPuestosBici(){
        for(int i=0; i<vacantesbicicletas; i++)
            this.Puestob.add(new puestosbici(i+1));
    }
    private void crearPuestosCarro(){
        for(int i=0; i<vacantescarros; i++)
            this.Puestoc.add(new puestoscarro(i+1));
    }
    private void crearPuestosMoto(){
        for(int i=0;i<vacantesmotos;i++)
            this.Puestom.add(new puestosmoto(i+1));
    }
//parquear Transportes

    public String parquearBici(String cedula, Date fechaingreso){
        String men = "No hay puestos para parquear más carros";
        
        if(this.buscarBici(cedula) != null)
            return "El carro ya esta parqueado en un puesto";
        
        if(this.puestoVacio()!=-1){
            bicicletas bici = new bicicletas(cedula, fechaingreso);
            this.Puestob.get(this.puestoVacio()).asignarpuesto(bici);
            this.Puestob.get(this.puestoVacio()).setEstado("Ocupado");
            return "Carro parqueado con exito";
        }
            
        return men;
    }
    public String parquearCarro(String placa, Date fechaingreso){
        String men = "No hay puestos para parquear más carros";
        
        if(this.buscarCarro(placa) != null)
            return "El carro ya esta parqueado en un puesto";
        
        if(this.puestoVacioc()!=-1){
            carros carro = new carros(placa, fechaingreso);
            this.Puestoc.get(this.puestoVacioc()).asignarpuesto(carro);
            this.Puestoc.get(this.puestoVacioc()).setEstado("Ocupado");
            return "Carro parqueado con exito";
        }
            
        return men;
    }
    public String parquearMoto(String placa, Date fechaingreso){
        String men = "No hay puestos para parquear más motos";
        
        if(this.buscarMoto(placa) != null)
            return "La moto ya esta parqueado en un puesto";
        
        if(this.puestoVaciom()!=-1){
            motos moto = new motos(placa, fechaingreso);
            this.Puestom.get(this.puestoVaciom()).asignarpuesto(moto);
            this.Puestom.get(this.puestoVaciom()).setEstado("Ocupado");
            return "Moto parqueada con exito";
        }
            
        return men;
    }
// retirar transportes

    public String retirarBici(String cedula, Date fechasalida){
        String mensaje = "No se ha podido retirar la bicicleta ";
        long precio = this.calcularPrecioBici(fechasalida, this.buscarBici(cedula));

       for(int i=0; i<=this.Puestob.size(); i++)
            if(this.Puestob.get(i).getBici()!= null && 
                    this.Puestob.get(i).getBici().getCedula().equalsIgnoreCase(cedula)){
                this.Puestob.get(i).setBici(null);
                this.Puestob.get(i).setEstado("Libre");
                return "Se ha retirado correctamente, debe pagar "+precio;
            }
                
        return mensaje;
    }
     public String retirarcarro(String placa, Date fechasalida){
        String mensaje = "No se ha podido retirar el carro";

        long precio = this.calcularPrecioCarro(fechasalida, this.buscarCarro(placa));
        for(int i=0; i<=this.Puestoc.size(); i++)
            if(this.Puestoc.get(i).getcarro()!= null && 
                     this.Puestoc.get(i).getcarro().getPlaca().equalsIgnoreCase(placa)){
                this.Puestoc.get(i).setcarro(null);
                this.Puestoc.get(i).setEstado("Libre");
                return "Se ha retirado correctamente, debe pagar " + precio;
            }
                
        return mensaje;
    }
public String retirarmoto(String placa, Date fechasalida){
        String mensaje = "No se ha podido retirar la moto";
        long precio = this.calcularPrecioMoto(fechasalida, this.buscarMoto(placa));
        
        for(int i=0; i<=this.Puestom.size(); i++){
          if(this.Puestom.get(i).getMoto()!= null && 
                this.Puestom.get(i).getMoto().getPlaca().equalsIgnoreCase(placa)){
                this.Puestom.get(i).setMoto(null);
                this.Puestom.get(i).setEstado("Libre");
                return "Se ha retirado correctamente, debe pagar " + precio;
            }
        }
        return mensaje;
}

 //información de puestos
    public String InfoPuestosLibresBici(){
        String libresb = "";
        for(puestosbici pb: Puestob)
            if(pb!=null && pb.getEstado().equalsIgnoreCase("Libre"))
                libresb += pb.libreStringb()+"\n\n";
                
        return libresb;
    }
     public String InfoPuestosLibrescarro(){
        String libresc = "";
        
        for(puestoscarro pc: Puestoc)
            if(pc!=null && pc.getEstado().equalsIgnoreCase("Libre"))
                libresc += pc.libreStringc()+"\n\n";
                
        return libresc;
    }
     public String InfoPuestosLibresmoto(){
        String libresm = "";
        
        for(puestosmoto pm: Puestom)
        if(pm!=null && pm.getEstado().equalsIgnoreCase("Libre"))
           libresm += pm.libreStringm()+"\n\n";
                
        return libresm;
    }

//información puestod vacios
   public int puestoVacio(){
        for(puestosbici pb: Puestob)
            if(pb.getEstado().equalsIgnoreCase("Libre"))
                return (pb.getNumero()-1);
        
        return -1;
    }
   public int puestoVacioc(){
        for(puestoscarro pc: Puestoc)
            if(pc.getEstado().equalsIgnoreCase("Libre"))
                return (pc.getNumero()-1);
        
        return -1;
    }
   public int puestoVaciom(){
        for(puestosmoto pc: Puestom)
            if(pc.getEstado().equalsIgnoreCase("Libre"))
                return (pc.getNumero()-1);
        
        return -1;
    }
// verificación
    public bicicletas buscarBici(String cedula){
        bicicletas Bici = null;
        
        for(puestosbici pb: Puestob)
            if(pb.getEstado().equalsIgnoreCase("Ocupado") && 
                    pb.getBici().getCedula().equalsIgnoreCase(cedula))
                Bici = pb.getBici();
        
        return Bici;
    }
    public carros buscarCarro(String placa){
        carros carro = null;
        
        for(puestoscarro pc: Puestoc)
            if(pc.getEstado().equalsIgnoreCase("Ocupado") && 
                    pc.getcarro().getPlaca().equalsIgnoreCase(placa))
                carro = pc.getcarro();
        
        return carro;
    }
    public motos buscarMoto(String placa){
        motos moto = null;
        
        for(puestosmoto pm: Puestom)
        if(pm.getEstado().equalsIgnoreCase("Ocupado") && 
            pm.getMoto().getPlaca().equalsIgnoreCase(placa))
            moto = pm.getMoto();
   return moto;
    }

//calculos
    public long calcularPrecioBici(Date fechasalida, bicicletas Bici){
        
        long costob = 10;
        long canttiempo= fechasalida.getTime()-Bici.getFechaingreso().getTime();
        long minutos= canttiempo/(60*1000);
        if(minutos == 600){
            costob=13000;
        }else {
            costob=(costob*minutos);
        }
        System.out.println(minutos +" minutos ");
        return costob;
    }
    public long calcularPrecioCarro(Date fechasalida, carros Carro){
        long costoc = 75;
        long canttiempo= fechasalida.getTime()-Carro.getFechaingreso().getTime();
        long minutos= canttiempo/(60*1000);
        if(minutos ==600){
            costoc=13000;
        }else{
             costoc=(costoc*minutos);
        }
        System.out.println(minutos +" minutos ");
        return costoc;
    }
    public long calcularPrecioMoto(Date fechasalida, motos Moto){
        long costom = 20;
        long canttiempo= fechasalida.getTime()-Moto.getFechaingreso().getTime();
        long minutos= canttiempo/(60*1000);
        if(minutos ==600){
            costom=13000;
        }else{
             costom=(costom*minutos);
        }
        System.out.println(minutos +" minutos ");
        return costom;
    }
 //concatenar información 
    public String concatenarInfoBici(){
        String infob = "";
        
        for(puestosbici pb: Puestob)
            if(pb.getEstado().equalsIgnoreCase("Ocupado"))
                infob += pb.Datosbici()+"\n\n";
        
        return infob;
    }
    public String concatenarInfoCarro(){
        String infoc = "";
        
        for(puestoscarro pc: Puestoc)
            if(pc.getEstado().equalsIgnoreCase("Ocupado"))
                infoc += pc.Datoscarro()+"\n\n";
        
        return infoc;
    }
    public String concatenarInfoMoto(){
        String infom = "";
        
        for(puestosmoto pm: Puestom)
            if(pm.getEstado().equalsIgnoreCase("Ocupado"))
                infom += pm.Datosmoto()+"\n\n";
        
        return infom;
    }
    //concatenar 
    public String concatenarPlacasCarros(){
        String carros = "";
        
        for(int i=0; i<this.Puestoc.size();i++)
            if(this.Puestoc.get(i).getEstado().equalsIgnoreCase("Ocupado"))
                carros += this.Puestoc.get(i).getcarro().getPlaca()+"~";
        
        return carros;
    }
    public String concatenarCedulasBicicletas(){
        String Bicicletas = "";
        
        for(int i=0; i<this.Puestob.size();i++)
            if(this.Puestob.get(i).getEstado().equalsIgnoreCase("Ocupado"))
                Bicicletas += this.Puestob.get(i).getBici().getCedula()+"~";
        
        return Bicicletas;
    }
    public String concatenarPlacasMotos(){
        String Motos = "";
        
        for(int i=0; i<this.Puestom.size();i++)
            if(this.Puestom.get(i).getEstado().equalsIgnoreCase("Ocupado"))
                Motos += this.Puestom.get(i).getMoto().getPlaca()+"~";
        
        return Motos;
    }
    
}
