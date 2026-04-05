package unverified;

public class ClonePair8914 {

    double method1(double angle){
      if (angle > 180)   return ((angle + 180) % 360) - 180;
      if (angle < -180)   return ((angle - 180) % 360) + 180;
      return angle;
    }

    double method2(double angle){
      double a=angle;
      while (a > 180)   a-=360;
      while (a < -180)   a+=360;
      return a;
    }
}
