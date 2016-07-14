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
    ทำการ_pop_ข้อมูลล่าสุดที่เพิ่มออกจาก_stack() {
        stack.push("A");
        assertEquals("A", stack.pop());
    }

    @Test public void
    ทำการ_pop_ข้อมูลล่าสุดที่เพิ่มออกจาก_stack_อีกครั้ง() {
        stack.push("B");
        assertEquals("B", stack.pop());
    }






}
