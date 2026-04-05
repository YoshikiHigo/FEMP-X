package all;

public class ClonePair7266 {

    double method1(double x,double[] coefficients){
      double value=coefficients[0];
      for (int i=1; i < coefficients.length; i++) {
        value+=coefficients[i] * Math.pow(x,i);
      }
      return value;
    }

    double method2(double x,double[] coeff){
      int n=coeff.length - 1;
      double y=coeff[n];
      for (int i=n - 1; i >= 0; i--) {
        y=coeff[i] + (y * x);
      }
      return y;
    }
}
