package chap2;

/**
 * Created by liuchang on 15-9-14.
 * Ex5 and Ex6
 */
public class Ex5 {
    int i;
    double d;
    boolean b;

    String string;

    public Ex5() {

    }

    public static void main(String[] args) {
        Ex5 ex5 = new Ex5();
        ex5.i = 1;
        ex5.d = 2.2;
        ex5.b = true;
        System.out.println(ex5.i);
        System.out.println(ex5.d);
        System.out.println(ex5.b);

        ex5.string = "Hello World!";
        System.out.println(ex5.storage(ex5.string));
    }

    public int storage(String s) {
        return s.length() * 2;
    }
}
