package all;

public class ClonePair9341 {

    double method1(double a){
      double r=a;
      while (r < -Math.PI)   r+=2.0 * Math.PI;
      while (r > Math.PI)   r-=2.0 * Math.PI;
      return r;
    }

    double method2(double p){
      while (p > Math.PI)   p=p - 2. * Math.PI;
      while (p < -Math.PI)   p=p + 2. * Math.PI;
      return p;
    }
}
