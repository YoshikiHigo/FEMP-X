package unverified;

public class ClonePair9742 {

    double method1(double p){
      while (p > Math.PI)   p=p - 2. * Math.PI;
      while (p < -Math.PI)   p=p + 2. * Math.PI;
      return p;
    }

    double method2(double ang){
      double a=ang % (2 * Math.PI);
      if (a > Math.PI)   a-=(2 * Math.PI);
     else   if (a < -Math.PI)   a+=(2 * Math.PI);
      return a;
    }
}
