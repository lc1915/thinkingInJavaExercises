package chap3;

/**
 * Created by liuchang on 15-9-18.
 */
public class Ex9 {

    float minFloat;
    float maxFloat;
    double minDouble;
    double maxDouble;

    public Ex9() {

    }

    public static void main(String[] args) {
        Ex9 ex9 = new Ex9();
        ex9.minFloat = Float.MIN_VALUE;
        ex9.maxFloat = Float.MAX_VALUE;
        ex9.minDouble = Double.MIN_VALUE;
        ex9.maxDouble = Double.MAX_VALUE;
        
        System.out.print("minFloat = " + ex9.minFloat + " maxFloat = " + ex9.maxFloat + " minDouble = " + ex9.minDouble + " max Double = " + ex9.maxDouble);
    }
}

