package com.solucionfactible.dev;

import static java.lang.Math.pow;
import java.util.Arrays;

/**
 * comp checks whether the two arrays have the "same" elements, with the same multiplicities. "Same" means, 
 * here, that the elements in b are the elements in a squared, regardless of the order.
 * 
 * @author developer
 */
public class AreSame {
	
	public static boolean comp(int[] a, int[] b) {
	int[] aux = new int[a.length];
            for(int h =0; h<a.length; h++){
                   aux[h] = a[h] * a[h];
                   
                }
            for (int x = 0; x < aux.length; x++) {
                for (int i = 0; i < aux.length - x - 1; i++) {
                    if (aux[i] < aux[i + 1]) {
                        int tmp = aux[i + 1];
                        aux[i + 1] = aux[i];
                        aux[i] = tmp;
                    }
                }
            }
            for (int y = 0; y < b.length; y++) {
                for (int j = 0; j < b.length - y - 1; j++) {
                    if (b[j] < b[j + 1]) {
                        int tmp = b[j + 1];
                        b[j + 1] = b[j];
                        b[j] = tmp;
                    }
                }
            }
            
            if(Arrays.equals(aux, b)){
                return true;
            }
            else{
                    return false;
            }
	}
        

}
