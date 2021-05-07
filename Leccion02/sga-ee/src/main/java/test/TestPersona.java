package test;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import py.com.devrod.sga.domain.Persona;
import py.com.devrod.sga.servico.PersonaServiceRemote;

public class TestPersona {
    public static void main(String[] args) {
        System.out.println("Iniciando servicios desde el servidor");
        try {
            Context jdni=new InitialContext();
            PersonaServiceRemote persona= (PersonaServiceRemote)jdni.lookup("java:global/sga-ee-1.0/PersonaServiceImplementacion");
            
            List<Persona>misPersonas=persona.listarPersona();
            
            for (Persona item : misPersonas) {
                System.out.println("item = " + item.toString());
            }
            System.out.println("Fin del servicio");
        } catch (NamingException ex) {
           ex.printStackTrace(System.out);
        }
    }
}
