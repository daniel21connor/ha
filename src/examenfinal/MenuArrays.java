
package examenfinal;

import static examenfinal.NombreDelDepartamentoLista.scanner;


public class MenuArrays {
      public void menuLista(int opcion){
        
              NombreDepartamentoArraysVectores datos = new NombreDepartamentoArraysVectores();
        do {
         System.out.println( "1" + " ingresar datos del Departamento");
         System.out.println( "2 "+ "mostrar Departamentos");
         System.out.println( "3" + " Buscar Depa");
         System.out.println( "4" + " Mostrar Cabecera Y Departamentos");  
         System.out.println( "5" + " Mostrar Datos Juntos");   
         System.out.println( "6" + " salir");   
          opcion = scanner.nextInt();
           switch(opcion){

               case 1: 
                  System.out.println("Escribe El nombre del Departamento");
                  String date=scanner.next();
                   System.out.println("Escribe La Cabecera");
                  String da=scanner.next();
                   System.out.println("Escribe El Numero De municipios");
                  String de=scanner.next();
                  datos.registroDepa(date);
                  datos.registroCabercera(da);
                  datos.registroMunicipio(de);
                   break;
               case 2:
                  datos.mostrarDepa();
                       break;
               case 3:
                  datos.busqueda();
                       break;
               case 4:
                  datos.mostrarcabecera();
                 datos.mostrarDepa();
                       break;
               
               case 5:
                  datos.mostrarDepa();
                 datos.mostrarcabecera();
                 datos.mostrarmuni();
                       break;
             
               
           }
}    while (opcion !=6);
}
    
    
    
}
