
package com.solucionfactible.dev;

import static com.solucionfactible.dev.AreSame.comp;
import static com.solucionfactible.dev.ArrayDiff.diff;
import static com.solucionfactible.dev.FindMissingLetter.findMissingLetter;
import static com.solucionfactible.dev.Persistence.persistence;
import static com.solucionfactible.dev.ValidatePIN.isValid;
import java.util.Scanner;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author AlienWare
 */
public class Home {
     public static void main(String[] args){
            /*Scanner resp =  new Scanner(System.in);
            long entrada;
            System.out.print("Ingrese un numero: ");
            entrada = resp.nextLong();
            System.out.print("Numero de Persistencia: "+ persistence(entrada));*/
           
            //System.out.print(isValid("090900tt9"));
            
            //int[] a = new int[]{21, 144, 19, 161, 19, 144, 19, 11};
		//int[] b = new int[]{132, 14641, 20736, 361, 25921, 361, 20736, 361};
            System.out.println(diff(new int [] {9,4,2,23,5,52,83,22}, new int[] {83,24,23,5}));
        }
}
