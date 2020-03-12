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
public class InserionSort {
    
    public static void insertionSort(int [] A){
        for(int j=1; j < A.length; j = j+1){
            int key = A[j];
            // Insere A[j] na sequencia ordenada A[1..j-1]
            int i = j-1;
            while(i >=0 && A[i] > key){
                A[i+1] = A[i];
                i = i -1;
            }
            A[i+1] = key;
        }
    }  
    
    public static void printArray(int [] A){  
        for (int e : A) {
            System.err.print(e+" ");    
        }
        System.err.println("");
    }
    
    
    public static void main(String [] args){
        int A [] = {8,6,9,3,7,2,4,8,5,1};
        System.out.println("---Antes--");
        printArray(A);
        insertionSort(A);
        System.out.println("---Depois---");
        printArray(A);
        
    }
            
}
