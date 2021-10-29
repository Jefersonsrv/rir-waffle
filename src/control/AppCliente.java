
package control;

import model.Cliente;

/**
 *
 * @author jeferson
 */
public class AppCliente {
    
    public static void main(String[] args){
        Cliente objeto1 = new Cliente("00000000000", "Fulano", "Rodrigues", "Pelotas - Centro", "11111-111", "53999999999", "fulano@email.com");
        System.out.println(objeto1);
        
        objeto1.setSobrenome("Silva");
        System.out.println(objeto1.getSobrenome() + " (Sobrenome alterado)");
        System.out.println(objeto1.toString());
    }
    
}
