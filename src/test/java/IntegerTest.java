import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class IntegerTest {

    @Test
    public void integer_should_not_be_change() throws Exception {
        Integer integer = new Integer(10);
        assertEquals(10, integer.intValue());
    }
    private void triple(Integer integer){
        integer = integer * 3;
    }

    @Test
    public void integer_auto_box() throws Exception {
        ArrayList<Integer> integers = new ArrayList<Integer>();
        integers.add(1);

        int integer = integers.get(0);
        assertEquals(1, integer);
    }
}
