package com.solucionfactible.dev;

/**
 * diff subtracts one list from another and returns the result.
 * It should remove all values from list a, which are present in list b keeping their order.
 * 
 * @author developer
 */
public class ArrayDiff {

    public static int[] diff(int[] a, int[] b) {
        int[] aux = new int[a.length];
        int cuenta = 0;
        aux = new int[a.length];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] == b[i]) {
                    a[j] = a[j+1];
                    cuenta++;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length - 1; j++) {
            if (a[i] == a[j]) {
                
                    a[j] = a[j + 1];
                
            }
            }

        }
        for(int z=0; z<a.length-cuenta+1;z++)
        System.out.println(a[z]);
        return a;
    }

}
