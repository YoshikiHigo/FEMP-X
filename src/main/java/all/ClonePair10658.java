package all;

public class ClonePair10658 {

    double method1(double ang){
      double a=ang % (2 * Math.PI);
      if (a > Math.PI)   a-=(2 * Math.PI);
     else   if (a < -Math.PI)   a+=(2 * Math.PI);
      return a;
    }

    double method2(double angle){
      while (angle < -Math.PI)   angle+=2.0 * Math.PI;
      while (angle > Math.PI)   angle-=2.0 * Math.PI;
      return angle;
    }
}
