
package examenfinal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NombreDelDepartamentoLista {
    List<String> lisNombreDepar = new ArrayList<>();
        List<String> cantidadLis = new ArrayList<>();
        List<String> cabecera = new ArrayList<>();
        List<Integer> numero=new ArrayList<>();
      static  Scanner scanner=new Scanner (System.in);
       public void numeri(){
       System.out.println("La cabecera Del Departamento");
       int uwu=scanner.nextInt();
      numero.add(uwu);
     }
      public void vaciar(){
      lisNombreDepar.clear();
      
      
      }
       public void vaciarcanti(){
     cantidadLis.clear();
      
      
      }
        public void vaciarcabe(){
      cabecera.clear();
      
    
      }
      public void cabecera(){
       System.out.println("Cabecera del Departamento");
       String uwu=scanner.next();
      cabecera.add(uwu);
     }

     public void cantidad(){
       System.out.println("La cantidad de municipio");
       String uwu=scanner.next();
      cantidadLis.add(uwu);
     }
     public void Departamento(){
      System.out.println("numero de depa");
      int owo=scanner.nextInt();
       System.out.println("Nombre Del Departamento");
       String uwu=scanner.next();
      lisNombreDepar.add(uwu);
      numero.add(owo);
     }
     public void mostrarCantidad(){
      
            for (int i=1; i<cantidadLis.size();i++){
                if(cantidadLis != null){
               
                    System.out.println("MUNICIPIOS ="+ cantidadLis );
                   
                }
            }
            System.out.println("");
            for(String transaccion : cantidadLis){
                if(transaccion != null){
                   
                }   
            } 
        }
       public void mostrarcabecera(){
      
            for (int i=1; i<cabecera.size();i++){
                if(cabecera != null){
               
                    System.out.println("CEBECERA ="+ cabecera );
                   
                }
            }
            System.out.println("");
            for(String transaccion : cabecera){
                if(transaccion != null){
                   
                }   
            } 
        }

    public List<String> getLisNombreDepar() {
        return lisNombreDepar;
    }

    public List<String> getCantidadLis() {
        return cantidadLis;
    }

    public List<String> getCabecera() {
        return cabecera;
    }
    
     public void mostrarDepartamento(){
      
            for (int i=1; i<lisNombreDepar.size();i++){
                if(lisNombreDepar != null){
               
                    System.out.println("NOMBRES ="+ lisNombreDepar );
                   
                }
            }
            System.out.println("");
            for(String transaccion : lisNombreDepar){
                if(transaccion != null){
                   
                }   
            } 
        }
    
     public void BuscarDepa(){
   System.out.println(" numero departamento que buscar");
int depa=scanner.nextInt();
   int posicion=lisNombreDepar.indexOf(depa);
    if (posicion <=numero.indexOf(posicion))
         System.out.println(" __Departamento__"+ lisNombreDepar);
         else{
             System.out.println(" __Departamento__"+ lisNombreDepar );
         
                 } 
     
     
     } 
}
