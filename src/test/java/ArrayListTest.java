import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ArrayListTest {

    @Test
    public void array_to_list() throws Exception {
        Integer[] ints1 = {10, 20};
        List<Integer> ints = Arrays.asList(ints1);
        assertEquals(2, ints.size());
        assertEquals(10, (int)ints.get(0));

        List<Integer> ints2 = Arrays.asList(1, 2, 3);
        assertEquals(3, ints2.size());
    }

    @Test
    public void list_to_array() throws Exception {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(10);
        Integer[] arrayIntegers = new Integer[integers.size()];
        Integer[] integers1 = integers.toArray(arrayIntegers);
        assertEquals(1, arrayIntegers.length);
        assertEquals(10, (int)arrayIntegers[0]);
        assertEquals(1, integers1.length);
        assertEquals(10, (int)integers1[0]);
    }
}
