/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_5_referencia;

/**
 *
 * @author invitado
 */
public class EVA3_5_REFERENCIA {
                
            //VALOR = cosas que no son objetos) se manda una copia del valor
    // no pasa nada, seguro modificar
            //por referencia = (hablamos de objetos) se manda la direccion del objeto 
    // cuidado, se pueden modificar los originales
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // referencia = diercion de memoria principal (ram)
        //apuntadores = direccion de memoria
        //referencias (java) = direccion de la jvm
        int[] arreglo = new int [10];
        // arreglo = dirccion donde estan los enteros
        // memori virtual = 
        System.out.println(arreglo);
        for (int i : arreglo) {
            System.out.println(i);
        }
        int i = 10;
        System.out.println(i);
        
        /*
        [I@7a81197d
        [ ---> arreglo
        I --> entero
        @ --> en 
        7a81197d --> tal direccion 
        */
    }
    
}
