import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        Triangle t = new Triangle();

        t.setAlpha(90);
        t.setA(5);
        t.setC(3);

        t.calcState();

        System.out.println("a = " + round(t.getA(), 2));
        System.out.println("b = " + round(t.getB(), 2));
        System.out.println("c = " + round(t.getC(), 2));

        System.out.println("α = " + round(t.getAlpha(), 2));
        System.out.println("β = " + round(t.getBeta(), 2));
        System.out.println("γ= " + round(t.getGamma(), 2));

    }

    private static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
