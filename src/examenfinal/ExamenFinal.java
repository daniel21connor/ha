
package examenfinal;

import static examenfinal.NombreDelDepartamentoLista.scanner;


public class ExamenFinal {


    public static void main(String[] args) {
   MenuListas hola=new MenuListas();
   MenuArrays hi=new MenuArrays();
         int opcion  = 0;
         
  do{
        System.out.println("\n BIENVENIDO A GUATEMALA:");
          System.out.println("<<<<>>>>>>>>>>>>>>>>>>");
           System.out.println(" 1"+" METODO LISTAS");
            System.out.println(" 2"+" METODO ARRAYS");
             System.out.println(" 3"+" SALIR");
           System.out.println(" "+"Escoja el metodo que desea");
           System.out.println("<<<<>>>>>>>>>><<<>>>>>>>>>>>>>>>>><<<<>>");
          
        opcion = scanner.nextInt();
       switch(opcion){
               
         case 1 -> { 
           hola.menuLista(opcion);
            
           
               }
          
         case 2 -> {
       hi.menuLista(opcion);
         }  
                   
    }
    
}while (opcion !=3);
    }
    
    
}
        
        
        


