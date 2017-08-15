import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringTest {
    @Test
    public void string_equal_test() throws Exception {
        String a = "1111";
        String b = String.format("111%s", "1");
        assertEquals(false, a == b);
        assertEquals(true, a.equals(b));
    }
}
