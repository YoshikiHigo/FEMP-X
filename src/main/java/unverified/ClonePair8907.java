package unverified;

public class ClonePair8907 {

    double method1(double angle){
      if (angle > 180)   return ((angle + 180) % 360) - 180;
      if (angle < -180)   return ((angle - 180) % 360) + 180;
      return angle;
    }

    double method2(double angle){
      while (angle > 180.0)   angle-=360.0;
      while (angle < -180.0)   angle+=360.0;
      return (angle);
    }
}
