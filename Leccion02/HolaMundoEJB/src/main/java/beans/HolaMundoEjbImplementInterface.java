/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.ejb.Stateless;

/**
 *
 * @author Rodrigo-DevCode
 */
@Stateless
public class HolaMundoEjbImplementInterface implements HolaMundoEjbInterface{

    @Override
    public int sumar(int a, int b) {
        System.out.println("Ejecutandose desde el servidor de glasfish");
        return a+b;
    }
    
}
