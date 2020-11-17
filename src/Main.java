public class Main {
    public static void main(String[] args) {
        Triangle t = new Triangle();

        t.setAlpha(90);
        t.setA(6);
        t.setB(3.5);

        t.calcState();
        System.out.println("a = " + t.getA());
        System.out.println("b = " + t.getB());
        System.out.println("c = " + t.getC());

        System.out.println("α = " + t.getAlpha());
        System.out.println("β = " + t.getBeta());
        System.out.println("γ = " + t.getGamma());

    }
}
