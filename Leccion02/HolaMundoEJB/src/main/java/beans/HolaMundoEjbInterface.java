package beans;

import javax.ejb.Remote;

/**
 *
 * @author Rodrigo-DevCode
 */
@Remote
public interface HolaMundoEjbInterface {
    public int sumar(int a, int b);
}
