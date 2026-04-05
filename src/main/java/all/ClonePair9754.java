package all;

public class ClonePair9754 {

    double method1(double p){
      while (p > Math.PI)   p=p - 2. * Math.PI;
      while (p < -Math.PI)   p=p + 2. * Math.PI;
      return p;
    }

    double method2(double angle){
      while (angle < -Math.PI)   angle+=2.0 * Math.PI;
      while (angle > Math.PI)   angle-=2.0 * Math.PI;
      return angle;
    }
}
