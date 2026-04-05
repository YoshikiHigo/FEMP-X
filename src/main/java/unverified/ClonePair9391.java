package unverified;

public class ClonePair9391 {

    double method1(double d){
      while (d < -Math.PI) {
        d+=Math.PI * 2;
      }
      while (d > Math.PI) {
        d-=Math.PI * 2;
      }
      return d;
    }

    double method2(double ang){
      double a=ang % (2 * Math.PI);
      if (a > Math.PI)   a-=(2 * Math.PI);
     else   if (a < -Math.PI)   a+=(2 * Math.PI);
      return a;
    }
}
