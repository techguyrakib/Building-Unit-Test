


/**
 * Author@ CyberWarrior (dev8188)
 * The class containing tests for the {@link Demo} class. Make sure you
 * test all methods in this class (including both {@link Demo#main(String[])}
 * and {@link Demo#isTriangle(double, double, double)}).
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;
import org.junit.Test;

public class DemoTest {
    @Test
    public void test_is_triangle_1() {
        assertTrue(Demo.isTriangle(3, 4, 5));
    }
    @Test
    public void test_is_triangle_2() {
        assertTrue(Demo.isTriangle(5, 12, 13));
    }
    @Test
    public void test_is_triangle_3() {
        assertTrue(Demo.isTriangle(5, 13, 12));
    }
    @Test
    public void test_is_triangle_4() {
        assertTrue(Demo.isTriangle(12, 5, 13));
    }
    @Test
    public void test_is_triangle_5() {
        assertTrue(Demo.isTriangle(12, 13, 5));
    }
    @Test
    public void test_is_NOT_triangle_1() {
        assertFalse(Demo.isTriangle(5, 7, 13));
    }
    @Test
    public void test_is_NOT_triangle_2() {
        assertFalse(Demo.isTriangle(5, 13, 7));
    }
    @Test
    public void test_is_NOT_triangle_3() {
        assertFalse(Demo.isTriangle(13, 5, 7));
    }
    @Test
    public void test_is_NOT_triangle_4() {
        assertFalse(Demo.isTriangle(13,7, 5));
    }
    @Test
    public void test_is_NOT_triangle_5() {
        assertFalse(Demo.isTriangle(13, 7, 5));
    }
    @Test
    public void test_is_NOT_triangle_6() {
        assertFalse(Demo.isTriangle(5, 9, 3));
    }
    @Test
    public void test_is_NOT_triangle_7() {
        assertFalse(Demo.isTriangle(1, 2, -1));
    }

    
}
