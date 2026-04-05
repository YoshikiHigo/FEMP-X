package unverified;

public class ClonePair9388 {

    double method1(double d){
      while (d < -Math.PI) {
        d+=Math.PI * 2;
      }
      while (d > Math.PI) {
        d-=Math.PI * 2;
      }
      return d;
    }

    double method2(double p){
      while (p > Math.PI)   p=p - 2. * Math.PI;
      while (p < -Math.PI)   p=p + 2. * Math.PI;
      return p;
    }
}
