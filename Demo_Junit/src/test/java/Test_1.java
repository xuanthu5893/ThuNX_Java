import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Test_1 {
    Caculator caculator = new Caculator();

    /*
    assertEquals(): So sánh 2 giá trị để kiểm tra bằng nhau.
    Test sẽ pass nếu các giá trị bằng nhau.
     */
    @org.junit.Test
    public void testSum() {
        assertEquals(5, caculator.sum(2, 3));
    }

    /*
    assertNotEquals(): So sánh 2 giá trị để kiểm tra bằng nhau.
    Test sẽ pass nếu các giá trị không bằng nhau.
     */
    @org.junit.Test
    public void testSum1() {
        assertNotEquals(6, caculator.sum(2, 3));
    }

    /*
    assertArrayEquals(): So sánh 2 mảng để kiểm tra bằng nhau.
    Test sẽ pass nếu 2 mảng là bằng nhau.
    */

    @org.junit.Test
    public void TestAssertArray() {
        assertArrayEquals(new int[]{1, 2, 3}, new int[]{1, 2, 3});
    }

    /*
    assertNull(): Để kiểm tra 1 object là null.
    Test sẽ pass nếu null.
    */

    /*
    assertNotNull(): Để kiểm tra 1 object là notnull.
    Test sẽ pass nếu notnull.
    */
    @org.junit.Test
    public void TestAssertNull(){
        String a = "Ahihi";
        String b = null;
        assertNull(b);
        assertNotNull(a);
    }

    /*
    assertTrue(): Đánh giá một biểu thức luận lý
    Test sẽ pass nếu trả về giá trị true.
    */

    /*
    assertFalse(): Đánh giá một biểu thức luận lý
    Test sẽ pass nếu trả về giá trị false.
    */

    @org.junit.Test
    public void TestAssertTrue_False(){
        assertTrue(5<8);
        assertFalse(5>8);
    }

    /*
    assertSame(): So sánh địa chỉ vùng nhớ của 2 tham chiếu đối tượng bằng cách sử dụng toán tử ==
    Test sẽ pass nếu cùng 1 địa chỉ.
    */

    /*
    assertNotSame(): So sánh địa chỉ vùng nhớ của 2 tham chiếu đối tượng bằng cách sử dụng toán tử ==
    Test sẽ pass nếu không cùng 1 địa chỉ.
    */

    @org.junit.Test
    public void TestAssertSame(){
        String a = "A";
        String b = a;
        String c = "C";
        assertSame(a,b);
        assertNotSame(a,c);
    }
}
