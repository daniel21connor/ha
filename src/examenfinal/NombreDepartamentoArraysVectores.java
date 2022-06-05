
package examenfinal;



import java.util.Scanner;

public class NombreDepartamentoArraysVectores {
    
static  Scanner scanner=new Scanner (System.in);
   private String [] departamentos=new String[24];
   private String [] cabecera =new String[24];
   private String [] municipios=new String [24];
   private int indiceVector;
    
   public void registroCabercera(String tipo ){
        indiceVector= indiceVector+1;
 
        cabecera[indiceVector]=   " * " +  " CABECERA--->"+ tipo;
    
    }
   public void registroMunicipio(String tipo ){
        indiceVector= indiceVector+1;
 
        municipios[indiceVector]=   " * " +  " municipio--->"+ tipo;
    
    }
   
   
    public void registroDepa(String tipo ){
        indiceVector= indiceVector+1;
 
        departamentos[indiceVector]=   " * " +  " Departamento--->"+ tipo;
    
    }
    
    public void mostrarcabecera(){
      
            for (int i=1; i<cabecera.length;i++){
                if(cabecera[i] != null){
               
                    System.out.println("Regitro = "+ cabecera[i]);
                   
                }
            }
            System.out.println("");
            for(String transaccion : cabecera){
                if(transaccion != null){
                   
                }   
            } 
        } 
    public void mostrarmuni(){
      
            for (int i=1; i<municipios.length;i++){
                if(municipios[i] != null){
               
                    System.out.println("Regitro = "+ municipios[i]);
                   
                }
            }
            System.out.println("");
            for(String transaccion : municipios){
                if(transaccion != null){
                   
                }   
            } 
        } 
    public void mostrarDepa(){
      
            for (int i=1; i<departamentos.length;i++){
                if(departamentos[i] != null){
               
                    System.out.println("Regitro = "+ departamentos[i]);
                   
                }
            }
            System.out.println("");
            for(String transaccion : departamentos){
                if(transaccion != null){
                   
                }   
            } 
        }      
     public void busqueda(){
   String busque=null;
     int posicion =1;
   int resultado=posicion;
System.out.println("ingrese el departamento");
 busque=scanner.next();

   while(posicion<departamentos.length){
       if (departamentos.equals(busque))
       {
           resultado=posicion;
     posicion++;
           break;
            
   }else{
           
           posicion++;
       }
        }if(resultado<=(departamentos.length+1)){
       System.out.println("EL departamento "+ busque+" fue encontrado en la posicion "+ "---"+resultado+"----" );     
            
        }else {
          System.out.println("No Se encontro");    
        }
     }
   
}
