/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_3_factorial;

/**
 *
 * @author invitado
 */
public class EVA3_3_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int val = 5;
        System.out.println("factorial de 5 = " + calcularFactorial(val));
        //crear metodo calcularPotencia->
        
    }
    
    public static int calcularFactorial(int val){
        
        int guardar = 1;
        for (int i = 1; i <= val; i++) {
            guardar *= i;  //guardad = gardar * i;
            
            
        }
        return guardar;
    }
    
    
}
