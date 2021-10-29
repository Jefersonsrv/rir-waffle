package control;

import model.Marca;


public class AppMarca extends Object{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Marca objeto1 = new Marca("Volkswagen");
        Marca objeto2 = new Marca("Toyota");
        System.out.println(objeto1);
        System.out.println(objeto2);
        
        objeto1.setDescricao("Volkswagen S");
        objeto2.setDescricao("Toyota D");
        
        System.out.println(objeto1.getDescricao());
        System.out.println(objeto2.getDescricao());
        
        
    }
    
}
