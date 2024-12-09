public class SimpleLinearRegression {

    ///dataset///
    private final double[] advertising = {23, 26, 30, 34, 43, 48, 52, 57, 58};
    private final double[] sales = {651, 762, 856, 1063, 1190, 1298, 1421, 1440, 1518};


    private double beta0, beta1;



    ///calculos///
    public void calculateParameters() {
        int n = advertising.length;
        double sumaX = 0, sumaY = 0, sumaXY = 0, sumaXala2 = 0;

        for (int i = 0; i < n; i++) {
            sumaX += advertising[i];
            sumaY += sales[i];
            sumaXY += advertising[i] * sales[i];
            sumaXala2 += advertising[i] * advertising[i];
        }

        beta1 = (n * sumaXY - sumaX * sumaY) / (n * sumaXala2 - sumaX * sumaX);
        beta0 = (sumaY - beta1 * sumaX) / n;
    }



    ///lo que se imprimira///
    public void printParameters() {
        System.out.println("Simple Linear Regression");
        System.out.println("Beta0 (Intersección): " + beta0);
        System.out.println("Beta1 (Pendiente): " + beta1);
    }



    ///para ejecutar///
    public static void main(String[] args) {
        SimpleLinearRegression slr = new SimpleLinearRegression();
        slr.calculateParameters();
        slr.printParameters();
    }
}
