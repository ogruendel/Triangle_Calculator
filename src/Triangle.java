public class Triangle {
    private Double alpha;
    private Double beta;
    private Double gamma;

    private Double a;
    private Double b;
    private Double c;

    public final double toDeg = 180 / Math.PI;
    public final double toRad = Math.PI / 180;

    private boolean isComplete;

    public void calcState() {

        int nonNulls = 0;
        if(alpha != null) nonNulls++;
        if(beta != null) nonNulls++;
        if(gamma != null) nonNulls++;
        if(a != null) nonNulls++;
        if(b != null) nonNulls++;
        if(c != null) nonNulls++;

        if(nonNulls == 3) {
            if(alpha != null && beta != null && gamma != null) {
                throw new IllegalStateException("You cannot calculate a triangle with only 3 angles");
            }else if(a != null && b != null && c != null){

            }else if(alpha != null && a != null && b != null){
                //sin(beta) = b / a => beta = arcsin(b / a)
                beta = Math.asin(b / a) * toDeg;
                gamma = 90 - beta;
                //sin(gamma) = c / a => c = sin(gamma) * a
                c = Math.sin(gamma * toRad) * a;

            }else if(alpha != null && a != null && c != null){
                //cos(beta) = c / a => beta = arccos(c / a)
                beta = Math.acos(c / a) * toDeg;
                gamma = 90 - beta;
                //cos(gamma) = b / a => b = cos(gamma) * a
                b = Math.cos(gamma * toRad) * a;

            }else if(alpha != null && b != null && c != null){
                a = Math.sqrt(b * b + c * c);
                //sin(beta) = b / a => beta = arcsin(b / a)
                beta = Math.asin(b / a) * toDeg;
                gamma = Math.asin(c / a) * toDeg;

            }else if(beta != null && a != null && b != null){
                //sin(alpha) = a / b => alpha = arcsin(a / b)
                alpha = Math.asin(a / b) * toDeg;
                //cos(alpha) = c / b => c = cos(alpha) * b
                c = Math.cos(alpha * toRad) * b;
                //sin(gamma) = c / b => gamma = arcsin(c / b)
                gamma = Math.asin(c / b) * toDeg;

            }else if(beta != null && a != null && c != null){
                b = Math.sqrt(a * a + c * c);
                //sin(gamma) = c / b => gamma = arcsin(c / b)
                gamma = Math.asin(c / b) * toDeg;
                alpha = Math.asin(a / b) * toDeg;

            }else if(beta != null && b != null && c != null){
                //cos(alpha) = c / b => alpha = arccos(c / b)
                alpha = Math.acos(c / b) * toDeg;
                //sin(alpha) = a / b => a = sin(alpha) * b
                a = Math.sin(alpha * toRad) * b;
                //sin(gamma) = c / b => gamma = arcsin(c / b)
                gamma = Math.asin(c / b) * toDeg;

            }else if(gamma != null && a != null && b != null){
                c = Math.sqrt(a * a + b * b);
                alpha = Math.asin(a / c) * toDeg;
                beta = Math.asin(b / c) * toDeg;

            }else if(gamma != null && a != null && c != null){
                alpha = Math.asin(a / c) * toDeg;
                b = Math.cos(alpha * toRad) * c;
                beta = Math.asin(a / c) * toDeg;

            }else if(gamma != null && b != null && c != null){
                alpha = Math.acos(b / c) * toDeg;
                a = Math.sin(alpha * toRad) * b;
                beta = Math.asin(b / c) * toDeg;

            }else if(alpha != null && beta != null && a != null){
                gamma = 180 - alpha - beta;

            }else if(alpha != null && beta != null && b != null){
                gamma = 180 - alpha - beta;

            }else if(alpha != null && beta != null && c != null){
                gamma = 180 - alpha - beta;

            }else if(alpha != null && gamma != null && a != null){
                beta = 180 - alpha - gamma;

            }else if(alpha != null && gamma != null && b != null){
                beta = 180 - alpha - gamma;

            }else if(alpha != null && gamma != null && c != null){
                beta = 180 - alpha - gamma;

            }else if(beta != null && gamma != null && a != null){
                alpha = 180 - beta - gamma;

            }else if(beta != null && gamma != null && b != null){
                alpha = 180 - beta - gamma;

            }else if(beta != null && gamma != null && c != null){
                alpha = 180 - beta - gamma;
            }else{
                throw new IllegalStateException("This should not have happened :P");
            }
            isComplete = true;
        }
    }



    public double getAlpha() {
        return alpha;
    }
    public void setAlpha(double alpha) {
        this.alpha = alpha;
        calcState();
    }

    public double getBeta() {
        return beta;
    }
    public void setBeta(double beta) {
        this.beta = beta;
        calcState();
    }

    public double getGamma() {
        return gamma;
    }
    public void setGamma(double gamma) {
        this.gamma = gamma;
        calcState();
    }



    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
        calcState();
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
        calcState();
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
        calcState();
    }

    public boolean isComplete() {
        return isComplete;
    }
}
