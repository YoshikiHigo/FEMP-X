package all;

public class ClonePair9909 {

    double method1(double angle){
      if (angle > -180 && angle <= 180) {
        return angle;
      }
      double fixedAngle=angle;
      while (fixedAngle <= -180) {
        fixedAngle+=360;
      }
      while (fixedAngle > 180) {
        fixedAngle-=360;
      }
      return fixedAngle;
    }

    double method2(double angle){
      if (angle > -180 && angle <= 180)   return angle;
      double fixedAngle=angle;
      while (fixedAngle <= -180)   fixedAngle+=360;
      while (fixedAngle > 180)   fixedAngle-=360;
      return fixedAngle;
    }
}
