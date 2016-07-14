import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StackTest {

    @Test public void
    เริ่มต้นสร้าง_Stack_ว่างๆขึ้นมา() {
        StackString stack = new StackString();
        assertEquals(0, stack.size());
    }

    @Test public void
    ขนาดของ_Stack_จะเพิ่มขึ้นเมื่อทำการ_push_ข้อมูลเข้า() {
        StackString stack = new StackString();
        stack.push("A");
        assertEquals(1, stack.size());
    }


}
