/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenacao;

/**
 *
 * @author jdso
 * @param <T>
 */
public class Utilidades <T extends Comparable> {
    
    public String paraStringArray(T [] valores){
        String resultado = "[";
        for (T v : valores) {
           resultado = resultado +v + ", " ;
        }
        resultado = resultado.substring(0, resultado.length()-2);
        resultado = resultado + "]";
        return resultado;
    }
     public void ordernarInsercao(T [] A){
        for(int j = 1; j < A.length ; j = j+1){
            T chave = A[j];
            int i = j-1;
            while(i >= 0 && chave.compareTo(A[i]) < 0){
                A[i+1] = A[i];
                i = i -1;
            }
            A[i+1] = chave;
        }
    }
   
}







