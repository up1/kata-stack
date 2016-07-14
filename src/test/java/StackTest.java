import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StackTest {

    StackString stack = new StackString();

    @Test public void
    เริ่มต้นสร้าง_Stack_ว่างๆขึ้นมา() {
        assertEquals(0, stack.size());
    }

    @Test public void
    ขนาดของ_Stack_จะเพิ่มขึ้นเมื่อทำการ_push_ข้อมูลเข้า() {
        stack.push("A");
        assertEquals(1, stack.size());
    }

    @Test public void
    ขนาดของ_Stack_จะเพิ่มขึ้นเมื่อทำการ_push_ข้อมูลมากกว่าหนึ่ง() {
        stack.push("A");
        stack.push("B");
        assertEquals(2, stack.size());
    }

    @Test public void
    ขนาดของ_Stack_จะลดลงเมื่อ_pop_ข้อมูลออก() {
        stack.push("A");
        stack.pop();
        assertEquals(0, stack.size());
    }

    @Test public void
    ขนาดของ_Stack_จะลดลงเมื่อ_pop_ข้อมูลออกอีกครั้ง() {
        stack.push("A");
        stack.push("B");
        stack.pop();
        assertEquals(1, stack.size());
    }

}
