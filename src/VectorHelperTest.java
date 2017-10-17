import org.junit.Test;

import java.util.Vector;
import static org.junit.Assert.*;

/**
 * Created by HP on 17/10/2017.
 */

public class VectorHelperTest {


    @Test
    public void inverser_vector() throws Exception {
        Vector<Integer> input = new Vector<Integer>();
        input.addElement(3);
        input.addElement(2);
        input.addElement(1);
        input.addElement(0);
        Vector<Integer> expected = new Vector<Integer>();
        expected.addElement(0);
        expected.addElement(1);
        expected.addElement(2);
        expected.addElement(3);
        VectorHelper.inverser_vector(input);
        assertEquals(input,expected);


    }

    @Test
    public void trier_vector() throws Exception {
        Vector<Integer> input = new Vector<Integer>();
        input.addElement(55);
        input.addElement(12);
        input.addElement(10);
        input.addElement(60);
        Vector<Integer> expected = new Vector<Integer>();
        expected.addElement(10);
        expected.addElement(12);
        expected.addElement(55);
        expected.addElement(60);
        VectorHelper.trier_vector(input);
        assertEquals(input,expected);

    }

    @Test
    public void somme2Vector() throws Exception {
        String st = null;



    }

    @Test
    public void min_max() throws Exception {
        Vector<Integer> input = new Vector<Integer>();
        Vector<Integer> min_max = new Vector<Integer>();
        Vector<Integer> expected = new Vector<Integer>();
        input.addElement(55);
        input.addElement(12);
        input.addElement(10);
        input.addElement(60);
        VectorHelper.min_max(input,min_max);
        expected.addElement(10);
        expected.addElement(60);
        assertEquals(min_max,expected);
    }

    @Test
    public void formule() throws Exception {
        Vector<Integer> input = new Vector<Integer>();
        input.addElement(3);
        input.addElement(2);
        input.addElement(1);
        input.addElement(4);
        Vector<Integer> expected = new Vector<Integer>();
        expected.addElement(9);
        expected.addElement(4);
        expected.addElement(1);
        expected.addElement(16);
           VectorHelper.formule(input);
        assertEquals(input,expected);
    }

}