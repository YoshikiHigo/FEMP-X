package all;

public class ClonePair10584 {

    double method1(double angle){
      if (angle > -180 && angle <= 180)   return angle;
      double fixedAngle=angle;
      while (fixedAngle <= -180)   fixedAngle+=360;
      while (fixedAngle > 180)   fixedAngle-=360;
      return fixedAngle;
    }

    double method2(double angle){
      if (angle > 180.0) {
        if (angle <= (180.0 + 360.0)) {
          angle=angle - 360.0;
        }
     else {
          angle=Math.IEEEremainder(angle,360.0);
          if (angle == -180.0) {
            angle=180.0;
          }
        }
      }
     else   if (angle <= -180.0) {
        if (angle > (-180.0 - 360.0)) {
          angle=angle + 360.0;
        }
     else {
          angle=Math.IEEEremainder(angle,360.0);
          if (angle == -180.0) {
            angle=180.0;
          }
        }
      }
      return angle;
    }
}
