
package examenfinal;


import static examenfinal.NombreDelDepartamentoLista.scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuListas {
    
    static  Scanner leer=new Scanner (System.in);
    public void menuLista(int opcion){
        
        List<NombreDelDepartamentoLista> lis_Nombre = new ArrayList<>();
        NombreDelDepartamentoLista datos = new NombreDelDepartamentoLista();
        do {
         System.out.println( "1" + " ingresar datos del Departamento");
         System.out.println( "2 "+ "mostrar Departamentos");
         System.out.println( "3" + " Mostrar todos los datos juntos");
         System.out.println( "4" + " vaciar Departamento");
         System.out.println( "5" + " vaciar todo");   
         System.out.println( "6" + " Buscar departamento");   
         System.out.println( "7" + " salir");   
          opcion = scanner.nextInt();
           switch(opcion){

               case 1: 
                   datos.Departamento();
                   datos.cantidad();
                   datos.cabecera();
                
                   break;
               case 2:
                   datos.mostrarDepartamento();
                       break;
               case 3:
                   datos.mostrarDepartamento();
                   datos.mostrarCantidad();
                   datos.mostrarcabecera();
                       break;
               case 4:
                   datos.vaciar();
                       break;
               
               case 5:
                   datos.vaciarcabe();
                   datos.vaciar();
                   datos.vaciarcanti();
                       break;
               case 6:  
               datos.BuscarDepa();
                   break;
               
               
               
               
               
               
               
               
               
               
           }
}    while (opcion !=7);
}
    
    
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
}
