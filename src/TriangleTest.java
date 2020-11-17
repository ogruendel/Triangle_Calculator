import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @org.junit.jupiter.api.Test
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
        t.setA(6);
        t.setB(3.5);

        assertTrue(t.isComplete());

        assertEquals(35.68533471265206, t.getBeta());
        assertEquals(54.31466528734794, t.getGamma());
        assertEquals(4.873397172404482, t.getC());
    }
    @org.junit.jupiter.api.Test
    void alphaAC(){
        Triangle t = new Triangle();
        assertTrue(t.isComplete());

    }
    @org.junit.jupiter.api.Test
    void alphaBC(){
        Triangle t = new Triangle();
        assertTrue(t.isComplete());
        assertEquals(t.getBeta() + t.getGamma(), 90);
    }
    @org.junit.jupiter.api.Test
    void betaAB(){
        Triangle t = new Triangle();
        assertTrue(t.isComplete());

    }
    @org.junit.jupiter.api.Test
    void betaAC(){
        Triangle t = new Triangle();
        assertTrue(t.isComplete());
        assertEquals(t.getAlpha() + t.getGamma(), 90);
    }
    @org.junit.jupiter.api.Test
    void betaBC(){
        Triangle t = new Triangle();
        assertTrue(t.isComplete());

    }
    @org.junit.jupiter.api.Test
    void gammaAB(){
        Triangle t = new Triangle();
        assertTrue(t.isComplete());
        assertEquals(t.getAlpha() + t.getBeta(), 90);
    }
    @org.junit.jupiter.api.Test
    void gammaAC(){
        Triangle t = new Triangle();
        assertTrue(t.isComplete());

    }
    @org.junit.jupiter.api.Test
    void gammaBC(){
        Triangle t = new Triangle();
        assertTrue(t.isComplete());

    }
    @org.junit.jupiter.api.Test
    void alphaBetaA(){
        Triangle t = new Triangle();
        assertTrue(t.isComplete());
    }
    @org.junit.jupiter.api.Test
    void alphaBetaB(){
        Triangle t = new Triangle();
        assertTrue(t.isComplete());
    }
    @org.junit.jupiter.api.Test
    void alphaBetaC(){
        Triangle t = new Triangle();
        assertTrue(t.isComplete());
    }
    @org.junit.jupiter.api.Test
    void alphaGammaA(){
        Triangle t = new Triangle();
        assertTrue(t.isComplete());
    }
    @org.junit.jupiter.api.Test
    void alphaGammaB(){
        Triangle t = new Triangle();
        assertTrue(t.isComplete());
    }
    @org.junit.jupiter.api.Test
    void alphaGammaC(){
        Triangle t = new Triangle();
        assertTrue(t.isComplete());
    }
    @org.junit.jupiter.api.Test
    void betaGammaA(){
        Triangle t = new Triangle();
        assertTrue(t.isComplete());
    }
    @org.junit.jupiter.api.Test
    void betaGammaB(){
        Triangle t = new Triangle();
        assertTrue(t.isComplete());
    }
    @org.junit.jupiter.api.Test
    void betaGammaC(){
        Triangle t = new Triangle();
        assertTrue(t.isComplete());
    }
}