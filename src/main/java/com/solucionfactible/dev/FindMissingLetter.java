package com.solucionfactible.dev;

/**
 * findMissingLetter takes an array of consecutive (increasing) letters as input and that returns the missing letter 
 * in the array. You will always get an valid array. And it will be always exactly one letter be missing. 
 * The length of the array will always be at least 2.The array will always contain letters in only one case.
 * (Use the English alphabet with 26 letters)
 * 
 * @author developer
 */
public class FindMissingLetter {
	
	public static char findMissingLetter(char[] array) {
            char[] letras = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
            char[] cont = new char[array.length];
            int hiper =0;
                
                    for(int i=0; i<letras.length; i++)
                    if(array[0]==letras[i])
                    {         
                        System.out.println("1° : "+array[0]);
                        hiper = i;
                        System.out.println(hiper);
                    }  
                for(int y =0; y<array.length;y++){
                    if(array[y]!=letras[hiper+y])
                        return letras[hiper+y];
                }
            return 0;
                
            }
}
