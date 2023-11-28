/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_7_objetos;

/**
 *
 * @author invitado
 */
public class EVA3_7_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        persona perso1 = new persona();
        System.out.println(perso1);
        perso1.nombre= "juan";
        perso1.apellido= "Perez";
        perso1.edad= 10;
        imprimirPersonas(perso1);
        
        persona perso2=new persona();
        System.out.println(perso2);
        perso2.nombre= " Pedro";
        perso2.apellido= " Paramo";
        perso2.edad= 70;
        imprimirPersonas(perso2);
    }
    
   public static void imprimirPersonas(persona perso){
       System.out.println("direccion: "+perso);
       System.out.println("nombre completo. "+perso.nombre + " " +perso.apellido);
       System.out.println("edad: "+ perso.edad);
       
   }
    
    
    
}
// definen una plantilla para crear objetos
//crean un nuevo tipo de dato
class persona {
    String nombre;
    String apellido;
    int edad;
    
}
