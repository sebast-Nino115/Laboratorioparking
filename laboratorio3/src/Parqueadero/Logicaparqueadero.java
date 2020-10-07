
package Parqueadero;

 import java.util.ArrayList;
import java.util.Date;

public class Logicaparqueadero {
public int vacantescarros=12;
public int vacantesmotos=8;
public int vacantesbicicletas=6;


public ArrayList<puestosmoto> Puestom;
public ArrayList<puestosbici> Puestob;
public ArrayList<puestoscarro> Puestoc;
public ArrayList<carros> Listadocarros;
public ArrayList<motos> Listadomotos;
public ArrayList<bicicletas> Listadobicicletas;



public Double preciocarro;
public Double preciomoto;
public Double preciobicicleta;
int canttiempo;
//constructor
public Logicaparqueadero(){

 this.Listadocarros= new ArrayList<carros>();
 this.Listadomotos= new ArrayList<motos>();
 this.Listadobicicletas = new ArrayList<bicicletas>();
 this.Puestob = new  ArrayList<puestosbici>();
 this.Puestoc = new ArrayList<puestoscarro>();
 this.Puestom=new ArrayList<puestosmoto>();
 this.crearPuestosBici();
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
        
        if(this.puestoVacio()!=-1){
            carros carro = new carros(placa, fechaingreso);
            this.Puestoc.get(this.puestoVacio()).asignarpuesto(carro);
            this.Puestoc.get(this.puestoVacio()).setEstado("Ocupado");
            return "Carro parqueado con exito";
        }
            
        return men;
    }
public String parquearMoto(String placa, Date fechaingreso){
        String men = "No hay puestos para parquear más motos";
        
        if(this.buscarMoto(placa) != null)
            return "La moto ya esta parqueado en un puesto";
        
        if(this.puestoVacio()!=-1){
            motos moto = new motos(placa, fechaingreso);
            this.Puestom.get(this.puestoVacio()).asignarpuesto(moto);
            this.Puestom.get(this.puestoVacio()).setEstado("Ocupado");
            return "Moto parqueada con exito";
        }
            
        return men;
    }
// retirar transportes

    public String retirarBici(String cedula, Date fechasalida){
        String mensaje = "No se ha podido retirar la bicicleta";
        int costo = 0;
        canttiempo= fechaingreso.compareTo(fechasalida);
        System.out.println(canttiempo + " segundos");
        
        for(int i=0; i<=this.Puestob.size(); i++)
            if(this.Puestob.get(i).getBici()!= null && 
                    this.Puestob.get(i).getBici().getCedula().equalsIgnoreCase(cedula)){
                this.Puestob.get(i).setBici(null);
                this.Puestob.get(i).setEstado("Libre");
                return "Se ha retirado correctamente, debe pagar ";
            }
                
        return mensaje;
    }
    
    public String retirarcarro(String placa, Date fechasalida){
        String mensaje = "No se ha podido retirar el carro";
        int precio = 0 ;
        
        for(int i=0; i<=this.Puestoc.size(); i++)
            if(this.Puestoc.get(i).getcarro()!= null && 
                     this.Puestoc.get(i).getcarro().getplaca().equalsIgnoreCase(placa)){
                this.Puestoc.get(i).setcarro(null);
                this.Puestoc.get(i).setEstado("Libre");
                return "Se ha retirado correctamente, debe pagar " + precio;
            }
                
        return mensaje;
    }
     public String retirarmoto(String placa, Date fechasalida){
        String mensaje = "No se ha podido retirar la moto";
        int precio = 0 ;
        
        for(int i=0; i<=this.Puestom.size(); i++)
            if(this.Puestom.get(i).getmoto()!= null && 
                     this.Puestom.get(i).getmoto().getplaca().equalsIgnoreCase(placa)){
                this.Puestom.get(i).setmoto(null);
                this.Puestom.get(i).setEstado("Libre");
                return "Se ha retirado correctamente, debe pagar " + precio;
            }
                
        return mensaje;
    }
    
    
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
        
        for(puestosmoto pc: Puestom)
            if(pc!=null && pc.getEstado().equalsIgnoreCase("Libre"))
                libresm += pc.libreStringm()+"\n\n";
                
        return libresm;
    }
    
    
// verificación
public bicicletas buscarBici(String cedula){
        bicicletas Bici = null;
        
        for(puestosbici pb: Puestob){
            if(pb.getEstado().equalsIgnoreCase("Ocupado") && 
                    pb.getBici().getCedula().equalsIgnoreCase(cedula)){
                Bici = pb.getBici();
            }
        }
        return Bici;
    }

public carros buscarCarro(String placa){
        carros carro = null;
        
        for(puestoscarro pc: Puestoc)
            if(pc.getEstado().equalsIgnoreCase("Ocupado") && 
                    pc.getcarro().getplaca().equalsIgnoreCase(placa))
                carro = pc.getcarro();
        
        return carro;
    }
public motos buscarMoto(String placa){
        motos moto = null;
        
        for(puestosmoto pc: Puestom)
            if(pc.getEstado().equalsIgnoreCase("Ocupado") && 
                    pc.getmoto().getplaca().equalsIgnoreCase(placa))
                moto = pc.getmoto();
        
        return moto;
    }
    
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
    
    public int calcularPrecioBici( Date fechaingreso, Date fechasalida, bicicletas Bici){
        int costo = 0;
        canttiempo= fechaingreso.compareTo(fechasalida);
        System.out.println(canttiempo +" segundos");
      
        
        
        return canttiempo;
    }
    
    
    public int calcularPreciocarro( Date fechaingreso, Date fechasalida, carros carro){
        int costo = 0;
        int canttiempo= fechaingreso.compareTo(fechasalida);
        System.out.println(canttiempo + " segundos");
        if (canttiempo <= 36000){
            
                costo = canttiempo/60*70;
           
        }
        else {
            costo = 13000;
        }
        
        return costo;
    }
    
    
    public int calcularPreciomoto( Date fechaingreso, Date fechasalida, motos moto){
        int costo = 0;
        int canttiempo= fechaingreso.compareTo(fechasalida);
        System.out.println(canttiempo + " segundos");
        if (canttiempo <= 36000){
            
                costo = canttiempo/60*70;
           
        }
        else {
            costo = 13000;
        }
        
        return costo;
    }
    


    public String concatenarPlacasCarros(){
        String carros = "";
        
        for(int i=0; i<this.Puestoc.size();i++)
            if(this.Puestoc.get(i).getEstado().equalsIgnoreCase("Ocupado"))
                carros += this.Puestoc.get(i).getcarro().getplaca()+ "~";
        
        return carros;
    }
    
     public String concatenarPlacasMotos(){
        String motos = "";
        
        for(int i=0; i<this.Puestom.size();i++)
            if(this.Puestom.get(i).getEstado().equalsIgnoreCase("Ocupado"))
                motos += this.Puestom.get(i).getmoto().getplaca()+ "~";
        
        return motos;
    }
     
     
    public String concatenarCedulaBici(){
        String bicicleta = "";
        
        for(int i=0; i<this.Puestob.size();i++){
            if(this.Puestob.get(i).getEstado().equalsIgnoreCase("Ocupado")){
                bicicleta += this.Puestob.get(i).getBici().getCedula()+"~";
            }
        }
        return bicicleta;

    }
    
    
    public String concatenarInfoBici(){
        String infob = "";
        
        for(puestosbici pb: Puestob){
            if(pb.getEstado().equalsIgnoreCase("Ocupado")){
                infob += pb.Datosbici()+"\n\n";
            }
        }
        return infob;
    }
    
}
