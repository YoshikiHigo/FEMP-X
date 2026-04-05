package all;

public class ClonePair9353 {

    double method1(double a){
      double r=a;
      while (r < -Math.PI)   r+=2.0 * Math.PI;
      while (r > Math.PI)   r-=2.0 * Math.PI;
      return r;
    }

    double method2(double angle){
      while (angle < -Math.PI)   angle+=2.0 * Math.PI;
      while (angle > Math.PI)   angle-=2.0 * Math.PI;
      return angle;
    }
}
