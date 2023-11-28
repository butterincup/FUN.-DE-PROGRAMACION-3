/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_6_pasos_parametros;

/**
 *
 * @author invitado
 */
public class EVA3_6_PASOS_PARAMETROS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=5;
        System.out.println("el valor de x en el main() es de " + x);
        PasoPorValor(x);
        System.out.println("el valor de x en el main() es de "+ x);
    }
    // en el paso por valor de argymentos, se envia una copia al metodo
    public static void PasoPorValor (int valor){
            System.out.println("el valor que recubo en el metidi es de "+ valor);
            valor++;
            System.out.println("el valor modificado en el metodo es de "+ valor);
}
}
