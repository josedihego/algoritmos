/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenacao;

/**
 *
 * @author jdso
 */
public class InsertionSort2<T> {
    
   
    public static void main(String [] args){
        Utilidades<String> util = new Utilidades<>();
        Utilidades<Float> utilFloat = new Utilidades<>();
        Float [] listaNotas = {8.4f, 9.6f, 5.2f, 5.4f, -1.0f, 4.5f, 8.9f, 10.0f};
        String [] nomes4Semestre = {"Ruan", "Valdinel", "Eick", 
            "Felipe Macedo", "Felipe de Jesus", "Hiago"};
        System.out.println("Antes");
        System.out.println(util.paraStringArray(nomes4Semestre));
        
        util.ordernarInsercao(nomes4Semestre);
        System.out.println("Depois");
        System.out.println(util.paraStringArray(nomes4Semestre));
        
        
        System.out.println("Antes");
        System.out.println(utilFloat.paraStringArray(listaNotas));
        
        utilFloat.ordernarInsercao(listaNotas);
        System.out.println("Depois");
        System.out.println(utilFloat.paraStringArray(listaNotas));
        
        Utilidades<Integer> utilInt = new Utilidades<>();
        Integer [] idades = {20,15,26,19,34,22};
         System.out.println("Antes");
          System.out.println(utilInt.paraStringArray(idades));
          
          utilInt.ordernarInsercao(idades);
          System.out.println("Depois");
          System.out.println(utilInt.paraStringArray(idades));
        
    }
}
