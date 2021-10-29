package control;

import java.sql.Time;

import java.sql.Date;

import model.Locacao;


public class AppLocacao extends Object{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locacao objeto1 = new Locacao(Date.valueOf("2021-10-22"), Time.valueOf("12:33:16"), Date.valueOf("2021-10-26"), Time.valueOf("12:57:06"), 7253, 90.00, 180.00, true);
        System.out.println(objeto1);
        
        objeto1.setDataDevolucao(null);
        objeto1.setHoraDevolucao(null);
        objeto1.setDevolvido(false);
        
        System.out.println(objeto1.getDataDevolucao() + " " 
        + objeto1.getHoraDevolucao() + " "
        + objeto1.isDevolvido() + " O carro ainda não foi devolvido.");
        
        System.out.println(objeto1.toString());
    }
    
}
