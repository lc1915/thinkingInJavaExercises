package chap2;

/**
 * Created by liuchang on 15-9-13.
 * Ex1
 */
public class Ex1 {
    public int int1;
    public char char1 = '\u0000';

    public Ex1() {
        System.out.println(int1);
        System.out.println("[" + char1 + "]");
        System.out.println('\u0000');
        System.out.print(1);
    }

    public static void main(String[] args) {
        new Ex1();
    }
}
