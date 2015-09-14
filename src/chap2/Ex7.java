package chap2;

/**
 * Created by liuchang on 15-9-14.
 * <ol>
 *     <li>Item one</li>
 *     <li>Item two</li>
 *     <li>Item three</li>
 * </ol>
 */
public class Ex7 {

    public Ex7() {

    }

    public static void main(String[] args) {
        System.out.println(StaticTest.i);
        increment();
        System.out.println(StaticTest.i);
    }

    static void increment() {
        StaticTest.i++;
    }
}

class StaticTest {
    static int i = 47;
}