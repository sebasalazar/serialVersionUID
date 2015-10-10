/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.sebastian.random.run;

import org.apache.commons.lang3.RandomUtils;

/**
 *
 * @author Sebastián Salazar Molina <sebasalazar@gmail.com>
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long numero = RandomUtils.nextLong(1000000000000000000L, Long.MAX_VALUE);
        System.out.println(numero);
        
    }
    
}
