/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahomework5;

import java.util.Random;

/**
 *
 * @author krasa
 */
public class JavaHomework5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random=new Random();
        int summa=0, value=0;
        int[] nums;
        nums= new int[20]; 
        for (int i = 0; i < nums.length; i++) {  
            int numRandom=random.nextInt(21)&-2;
            nums[i]+=numRandom;
            value=value+1;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.printf("%4d",nums[i]);
            
        }
        for (int i = 0; i <nums.length; i++) {
            summa+=nums[i];
        }
        summa=summa/value;
        System.out.printf(" | Средняя арифмитическое строки - "+summa);
    }
    
}
