package all;

public class ClonePair9339 {

    double method1(double a){
      double r=a;
      while (r < -Math.PI)   r+=2.0 * Math.PI;
      while (r > Math.PI)   r-=2.0 * Math.PI;
      return r;
    }

    double method2(double d){
      while (d < -Math.PI) {
        d+=Math.PI * 2;
      }
      while (d > Math.PI) {
        d-=Math.PI * 2;
      }
      return d;
    }
}
