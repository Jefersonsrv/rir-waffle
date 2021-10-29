package control;

import model.Modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.HashMap;
import java.util.Map;


public class AppModelo extends Object{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Modelo objeto1 = new Modelo("Saveiro 1.6 CS Robust 2022");
        Modelo objeto2 = new Modelo("Supra IV 3.0i");
        System.out.println("\nObjetos originais \n");
        System.out.println(objeto1);
        System.out.println(objeto2);
        
        objeto1.setDescricao("Saveiro 1.6 CS Robust 2021 Turbo Deluxe");
        objeto2.setDescricao("Supra IV 3.0i Plus");
        
        System.out.println("\nObjetos modificados \n");
        
        System.out.println(objeto1.getDescricao());
        System.out.println(objeto2.getDescricao());
        
        // List
        
        List<Modelo> modelos;
        
        modelos = new ArrayList<Modelo>();
        
        modelos.add(new Modelo("Uno Mille Fire 1.0 (Flex) 2013"));
        modelos.add(new Modelo("Gol 1.0 2021"));
        modelos.add(new Modelo("Fusca 1300"));
        modelos.add(new Modelo("Gol 1.0 2021"));
        modelos.add(new Modelo("Ka 1.0 SE (Flex) 2021"));
        
        //Collections.reverse(modelos); //Ordem decrescente
        
        System.out.println("\nObjetos do LIST \n");
        
        for(int i = modelos.size() -1 ; i >= 0 ; i--){
        	System.out.println(modelos.get(i));
        }
        System.out.println("\nLIST ID 3 \n");
        System.out.println(modelos.get(3).getDescricao());
        
        // Map
        
        Map<Integer,Modelo> map=new HashMap<Integer,Modelo>();
        
        map.put(1,new Modelo("Fusion 2.0 EcoBoost Titanium (Aut) 2018"));  
        map.put(2,new Modelo("Camaro - Motor 6.2L V8"));  
        map.put(3,new Modelo("Lancer Evo 8"));
        map.put(4,new Modelo("Fusion 2.0 EcoBoost Titanium (Aut) 2018"));
        map.put(5,new Modelo("Skyline R34"));
         
        System.out.println("\nObjetos do MAP \n");
        
        for(Map.Entry m:map.entrySet()){  
         System.out.println(m.getKey()+" "+m.getValue());  
        }  
        System.out.println("\nMAP ID 3 \n");
        System.out.println(map.get(3).getDescricao());
    }
    
}
