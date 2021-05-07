/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.devrod.sga.servico;

import java.util.List;
import javax.ejb.Remote;
import py.com.devrod.sga.domain.Persona;

/**
 *
 * @author Rodrigo-DevCode
 */
@Remote
public interface PersonaServiceRemote {
    
    
    
    public List<Persona>listarPersona();
    public Persona encontarPeronsaPorId(Persona persona);
    public Persona enonctrarPerosonaPorEmaul(Persona persona);
    
    public void registrarPersona(Persona persona);
    public void moidificarPersona(Persona persona);
    public void eliminarPersona(Persona persona);
}
