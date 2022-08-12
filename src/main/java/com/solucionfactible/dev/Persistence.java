package com.solucionfactible.dev;

import java.util.Scanner;


/**
 * persistence takes in a positive parameter num and returns its multiplicative persistence, which is the number 
 * of times you must multiply the digits in num until you reach a single digit.
 * 
 * @author developer
 */
public class Persistence {
	
	public static int persistence(long num) {
            String conver = String.valueOf(num);
            char[] cont = conver.toCharArray();
            int cuenta = 0, aux = 0;
            if(conver.length()>1){
                    for(int h = 0; h <= cont.length; h++)
                    {
                       aux *= Character.getNumericValue(cont[h]);
                       cuenta++;
                    }
                }
            return cuenta;
	}
       
}
