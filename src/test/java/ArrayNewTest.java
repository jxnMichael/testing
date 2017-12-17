import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.omg.CORBA.portable.OutputStream;

import java.io.IOException;
import java.io.OutputStreamWriter;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Михаил on 14.12.2017.
 */
public class ArrayNewTest {

   @Test
    public void testSort()

    {

        ArrayNew test1 = new ArrayNew();

        int [] a =test1.sort();


        assertEquals("int[0] must be 0", 0,a[0]);

    }

    @Test
    public void testSort1()

    {

        ArrayNew test2 = new ArrayNew();

        int [] a =test2.sort();


        assertEquals("int[0] must be 9", 9,a[9]);

    }


    @Test
   public void testSort2(){

        ArrayNew test3 = new ArrayNew();

        int b[] = {0,1,2,3,4,5,6,7,8,9};

        assertArrayEquals("Массивы должны совпадать",test3.sort() ,b);

    }
    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void testSort3() throws ArrayIndexOutOfBoundsException{

        exception.expect(ArrayIndexOutOfBoundsException.class);

        ArrayNew test4 = new ArrayNew();

        test4.sort();

    }

}
