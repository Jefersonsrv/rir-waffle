package control;

import model.Automovel;


public class AppAutomovel extends Object{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Automovel objeto1 = new Automovel("0123456", "abc1234", "amarelo", 4, "gasolina", 5112, "0000", 212.00);
        System.out.println(objeto1);
        
        objeto1.setCor("Azul");
        
        System.out.println(objeto1.getCor() + " (Cor alterada)");
        System.out.println(objeto1.toString());
        
    }
    
}
