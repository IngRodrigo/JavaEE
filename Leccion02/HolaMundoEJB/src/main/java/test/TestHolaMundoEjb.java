/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import beans.HolaMundoEjbInterface;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author Rodrigo-DevCode
 */
public class TestHolaMundoEjb {
    public static void main(String[] args) {
        System.out.println("Iniciando llamada al EJB desde el cliente \n");
        try {
            Context jndi=new InitialContext();
            HolaMundoEjbInterface holaMundoEjbInterface= (HolaMundoEjbInterface) jndi.lookup("java:global/HolaMundoEJB-1.0/HolaMundoEjbImplementInterface!beans.HolaMundoEjbInterface");
            int resultado= holaMundoEjbInterface.sumar(5, 6);
            System.out.println("El resultado de sumar 5 + 6 es: "+resultado);
        } catch (NamingException e) {
            e.printStackTrace(System.out);
        }
    }
}
