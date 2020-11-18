import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    void pythagoras() {
        Triangle t = new Triangle();
        t.setGamma(90);
        t.setA(3);
        t.setC(5);

        assertTrue(t.isComplete());
        assertEquals(4, t.getB());
        assertEquals(t.getAlpha() + t.getBeta(), 90);
    }
    @org.junit.jupiter.api.Test
    void alphaAB(){
        Triangle t = new Triangle();

        t.setAlpha(90);
        t.setA(5);
        t.setB(4);

        assertTrue(t.isComplete());

        assertEquals(90, round(t.getAlpha(), 2));
        assertEquals(53.13, round(t.getBeta(), 2));
        assertEquals(36.87, round(t.getGamma(), 2));

        assertEquals(5, round(t.getA(), 2));
        assertEquals(4, round(t.getB(), 2));
        assertEquals(3, round(t.getC(), 2));

    }
    @org.junit.jupiter.api.Test
    void alphaAC(){
        Triangle t = new Triangle();

        t.setA(5);
        t.setC(3);
        t.setAlpha(90);

        assertTrue(t.isComplete());

        assertEquals(90, round(t.getAlpha(), 2));
        assertEquals(53.13, round(t.getBeta(), 2));
        assertEquals(36.87, round(t.getGamma(), 2));

        assertEquals(5, round(t.getA(), 2));
        assertEquals(4, round(t.getB(), 2));
        assertEquals(3, round(t.getC(), 2));

    }
    @org.junit.jupiter.api.Test
    void alphaBC(){
        Triangle t = new Triangle();

        t.setB(4);
        t.setC(3);
        t.setAlpha(90);

        assertTrue(t.isComplete());

        assertEquals(90, round(t.getAlpha(), 2));
        assertEquals(53.13, round(t.getBeta(), 2));
        assertEquals(36.87, round(t.getGamma(), 2));

        assertEquals(5, round(t.getA(), 2));
        assertEquals(4, round(t.getB(), 2));
        assertEquals(3, round(t.getC(), 2));
    }
    @org.junit.jupiter.api.Test
    void betaAB(){
        Triangle t = new Triangle();

        t.setA(3);
        t.setB(5);
        t.setBeta(90);

        assertTrue(t.isComplete());

        assertEquals(36.87, round(t.getAlpha(), 2));
        assertEquals(90, round(t.getBeta(), 2));
        assertEquals(53.13, round(t.getGamma(), 2));

        assertEquals(3, round(t.getA(), 2));
        assertEquals(5, round(t.getB(), 2));
        assertEquals(4, round(t.getC(), 2));

    }
    @org.junit.jupiter.api.Test
    void betaAC(){
        Triangle t = new Triangle();

        t.setA(3);
        t.setC(4);
        t.setBeta(90);

        assertTrue(t.isComplete());

        assertEquals(36.87, round(t.getAlpha(), 2));
        assertEquals(90, round(t.getBeta(), 2));
        assertEquals(53.13, round(t.getGamma(), 2));

        assertEquals(3, round(t.getA(), 2));
        assertEquals(5, round(t.getB(), 2));
        assertEquals(4, round(t.getC(), 2));
    }
    @org.junit.jupiter.api.Test
    void betaBC(){
        Triangle t = new Triangle();

        t.setB(5);
        t.setC(4);
        t.setBeta(90);

        assertTrue(t.isComplete());

        assertEquals(36.87, round(t.getAlpha(), 2));
        assertEquals(90, round(t.getBeta(), 2));
        assertEquals(53.13, round(t.getGamma(), 2));

        assertEquals(3, round(t.getA(), 2));
        assertEquals(5, round(t.getB(), 2));
        assertEquals(4, round(t.getC(), 2));
    }
    @org.junit.jupiter.api.Test
    void gammaAB(){
        Triangle t = new Triangle();

        t.setA(3);
        t.setB(4);
        t.setGamma(90);

        assertTrue(t.isComplete());

        assertEquals(36.87, round(t.getAlpha(), 2));
        assertEquals(53.13, round(t.getBeta(), 2));
        assertEquals(90, round(t.getGamma(), 2));

        assertEquals(3, round(t.getA(), 2));
        assertEquals(4, round(t.getB(), 2));
        assertEquals(5, round(t.getC(), 2));
    }
    @org.junit.jupiter.api.Test
    void gammaAC(){
        Triangle t = new Triangle();

        t.setA(3);
        t.setC(5);
        t.setGamma(90);

        assertTrue(t.isComplete());

        assertEquals(36.87, round(t.getAlpha(), 2));
        assertEquals(53.13, round(t.getBeta(), 2));
        assertEquals(90, round(t.getGamma(), 2));

        assertEquals(3, round(t.getA(), 2));
        assertEquals(4, round(t.getB(), 2));
        assertEquals(5, round(t.getC(), 2));
    }
    @org.junit.jupiter.api.Test
    void gammaBC(){
        Triangle t = new Triangle();

        t.setB(4);
        t.setC(5);
        t.setGamma(90);

        assertTrue(t.isComplete());

        assertEquals(36.87, round(t.getAlpha(), 2));
        assertEquals(53.13, round(t.getBeta(), 2));
        assertEquals(90, round(t.getGamma(), 2));

        assertEquals(3, round(t.getA(), 2));
        assertEquals(4, round(t.getB(), 2));
        assertEquals(5, round(t.getC(), 2));

    }
    @org.junit.jupiter.api.Test
    void alphaBetaA(){
        Triangle t = new Triangle();

        t.setB(4);
        t.setC(5);
        t.setGamma(90);

        assertTrue(t.isComplete());

        assertEquals(36.87, round(t.getAlpha(), 2));
        assertEquals(53.13, round(t.getBeta(), 2));
        assertEquals(90, round(t.getGamma(), 2));

        assertEquals(3, round(t.getA(), 2));
        assertEquals(4, round(t.getB(), 2));
        assertEquals(5, round(t.getC(), 2));
    }
    @org.junit.jupiter.api.Test
    void alphaBetaB(){
        Triangle t = new Triangle();

        t.setB(4);
        t.setC(5);
        t.setGamma(90);

        assertTrue(t.isComplete());

        assertEquals(36.87, round(t.getAlpha(), 2));
        assertEquals(53.13, round(t.getBeta(), 2));
        assertEquals(90, round(t.getGamma(), 2));

        assertEquals(3, round(t.getA(), 2));
        assertEquals(4, round(t.getB(), 2));
        assertEquals(5, round(t.getC(), 2));
    }
    @org.junit.jupiter.api.Test
    void alphaBetaC(){
        Triangle t = new Triangle();

        t.setB(4);
        t.setC(5);
        t.setGamma(90);

        assertTrue(t.isComplete());

        assertEquals(36.87, round(t.getAlpha(), 2));
        assertEquals(53.13, round(t.getBeta(), 2));
        assertEquals(90, round(t.getGamma(), 2));

        assertEquals(3, round(t.getA(), 2));
        assertEquals(4, round(t.getB(), 2));
        assertEquals(5, round(t.getC(), 2));
    }
    @org.junit.jupiter.api.Test
    void alphaGammaA(){
        Triangle t = new Triangle();

        t.setB(4);
        t.setC(5);
        t.setGamma(90);

        assertTrue(t.isComplete());

        assertEquals(36.87, round(t.getAlpha(), 2));
        assertEquals(53.13, round(t.getBeta(), 2));
        assertEquals(90, round(t.getGamma(), 2));

        assertEquals(3, round(t.getA(), 2));
        assertEquals(4, round(t.getB(), 2));
        assertEquals(5, round(t.getC(), 2));
    }
    @org.junit.jupiter.api.Test
    void alphaGammaB(){
        Triangle t = new Triangle();

        t.setB(4);
        t.setC(5);
        t.setGamma(90);

        assertTrue(t.isComplete());

        assertEquals(36.87, round(t.getAlpha(), 2));
        assertEquals(53.13, round(t.getBeta(), 2));
        assertEquals(90, round(t.getGamma(), 2));

        assertEquals(3, round(t.getA(), 2));
        assertEquals(4, round(t.getB(), 2));
        assertEquals(5, round(t.getC(), 2));
    }
    @org.junit.jupiter.api.Test
    void alphaGammaC(){
        Triangle t = new Triangle();

        t.setB(4);
        t.setC(5);
        t.setGamma(90);

        assertTrue(t.isComplete());

        assertEquals(36.87, round(t.getAlpha(), 2));
        assertEquals(53.13, round(t.getBeta(), 2));
        assertEquals(90, round(t.getGamma(), 2));

        assertEquals(3, round(t.getA(), 2));
        assertEquals(4, round(t.getB(), 2));
        assertEquals(5, round(t.getC(), 2));
    }
    @org.junit.jupiter.api.Test
    void betaGammaA(){
        Triangle t = new Triangle();

        t.setB(4);
        t.setC(5);
        t.setGamma(90);

        assertTrue(t.isComplete());

        assertEquals(36.87, round(t.getAlpha(), 2));
        assertEquals(53.13, round(t.getBeta(), 2));
        assertEquals(90, round(t.getGamma(), 2));

        assertEquals(3, round(t.getA(), 2));
        assertEquals(4, round(t.getB(), 2));
        assertEquals(5, round(t.getC(), 2));
    }
    @org.junit.jupiter.api.Test
    void betaGammaB(){
        Triangle t = new Triangle();

        t.setB(4);
        t.setC(5);
        t.setGamma(90);

        assertTrue(t.isComplete());

        assertEquals(36.87, round(t.getAlpha(), 2));
        assertEquals(53.13, round(t.getBeta(), 2));
        assertEquals(90, round(t.getGamma(), 2));

        assertEquals(3, round(t.getA(), 2));
        assertEquals(4, round(t.getB(), 2));
        assertEquals(5, round(t.getC(), 2));
    }
    @org.junit.jupiter.api.Test
    void betaGammaC(){
        Triangle t = new Triangle();

        t.setB(4);
        t.setC(5);
        t.setGamma(90);

        assertTrue(t.isComplete());

        assertEquals(36.87, round(t.getAlpha(), 2));
        assertEquals(53.13, round(t.getBeta(), 2));
        assertEquals(90, round(t.getGamma(), 2));

        assertEquals(3, round(t.getA(), 2));
        assertEquals(4, round(t.getB(), 2));
        assertEquals(5, round(t.getC(), 2));
    }

    private static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}