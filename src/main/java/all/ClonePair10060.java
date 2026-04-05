package all;

public class ClonePair10060 {

    double method1(double d){
      if (d >= 360.0)   d-=360.0;
     else   if (d < 0.0)   d+=360.0;
      if ((d >= 0) && (d < 360.0))   return d;
      return d - Math.floor(d / 360.0) * 360.0;
    }

    double method2(double angle){
      if (angle >= 0 && angle < 360) {
        return angle;
      }
      double fixedAngle=angle;
      while (fixedAngle < 0) {
        fixedAngle+=360;
      }
      while (fixedAngle >= 360) {
        fixedAngle-=360;
      }
      return fixedAngle;
    }
}
