/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_2_valor_maximo;

/**
 *
 * @author invitado
 */
public class EVA3_2_VALOR_MAXIMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // llamada a funcion (invocar funcion )
        //utiliza el valor directamente de la funcion 
        System.out.println(buscarMaximo(100, 200));
        //guardar el vlor y usarlo despues
        int resu =buscarMaximo (100, 200);
        System.out.println(resu);
        //llamar a la funcion e ingnorar el resultado
        buscarMaximo(100, 200);
    }
    public static int buscarMaximo(int val1, int val2) {
        /*if (val1>val2)
            return val1;
        else
            return val2;*/
        
        int res;
        
        if (val1>val2)
            res= val1;
        else
            res= val2;
        return res;
    }
    
}
