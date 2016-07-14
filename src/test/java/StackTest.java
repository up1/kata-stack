import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StackTest {

    @Test public void
    เริ่มต้นสร้าง_Stack_ว่างๆขึ้นมา() {
        StackString stack = new StackString();
        assertEquals(0, stack.size());
    }

}
