/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.devrod.sga.servico;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import py.com.devrod.sga.domain.Persona;

/**
 *
 * @author Rodrigo-DevCode
 */
@Stateless
public class PersonaServiceImplementacion implements PersonaServiceRemote {

    @Override
    public List<Persona> listarPersona() {
        List<Persona> retornarLista = new ArrayList<>();
        retornarLista.add(new Persona("Rodrigo", "Sánchez", "rodrigo@rodrigo.com", "123456"));
        retornarLista.add(new Persona("Jhoel", "Sánchez", "jhoel@jhoel.com", "112345645"));
        retornarLista.add(new Persona("Diana", "Martinez", "diana@diana.com", "112345645"));
        retornarLista.add(new Persona("Johan", "Sánchez", "johan@johan.com", "112345645"));

        return retornarLista;
    }

    @Override
    public Persona encontarPeronsaPorId(Persona persona) {
        return null;
    }

    @Override
    public Persona enonctrarPerosonaPorEmaul(Persona persona) {
        return null;
    }

    @Override
    public void registrarPersona(Persona persona) {
    }

    @Override
    public void moidificarPersona(Persona persona) {
    }

    @Override
    public void eliminarPersona(Persona persona) {
    }

}
