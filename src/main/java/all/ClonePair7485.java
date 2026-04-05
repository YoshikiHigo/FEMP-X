package all;

public class ClonePair7485 {

    int method1(double windAngle,double boatAngle){
      double angle=windAngle - boatAngle;
      if (angle < 0) {
        if (angle < -180)     angle+=360;
      }
     else   if (angle > 180)   angle-=360;
      return new Long(Math.round(angle)).intValue();
    }

    int method2(double windAngle,double boatAngle){
      double angle=windAngle - boatAngle;
      if (angle < 0) {
        if (angle < -180)     angle+=360;
      }
     else {
        if (angle > 180) {
          angle-=360;
        }
      }
      return new Long(Math.round(angle)).intValue();
    }
}
