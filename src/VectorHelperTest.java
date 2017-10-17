import java.util.Vector;

import static org.junit.Assert.*;

/**
 * Created by HP on 17/10/2017.
 */
public class VectorHelperTest {
    @org.junit.Test
    public void inverser_vector() throws Exception {
        Vector<Integer> inppuut = new Vector<Integer>();
        inppuut.add(1);
        inppuut.add(2);
        inppuut.add(3);
        inppuut.add(4);

        Vector<Integer> expec = new Vector<Integer>();
        expec.add(4);
        expec.add(3);
        expec.add(2);
        expec.add(1);

        VectorHelper.inverser_vector(inppuut);
        assertEquals(expec, inppuut);

    }
}