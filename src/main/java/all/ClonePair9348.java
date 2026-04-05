package all;

public class ClonePair9348 {

    double method1(double a){
      double r=a;
      while (r < -Math.PI)   r+=2.0 * Math.PI;
      while (r > Math.PI)   r-=2.0 * Math.PI;
      return r;
    }

    double method2(double ang){
      double a=ang % (2 * Math.PI);
      if (a > Math.PI)   a-=(2 * Math.PI);
     else   if (a < -Math.PI)   a+=(2 * Math.PI);
      return a;
    }
}
