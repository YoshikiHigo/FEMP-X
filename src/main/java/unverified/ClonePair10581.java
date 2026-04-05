package unverified;

public class ClonePair10581 {

    double method1(double angle){
      if (angle > -180 && angle <= 180)   return angle;
      double fixedAngle=angle;
      while (fixedAngle <= -180)   fixedAngle+=360;
      while (fixedAngle > 180)   fixedAngle-=360;
      return fixedAngle;
    }

    double method2(double aDegree){
      while (aDegree <= -180)   aDegree+=360;
      while (aDegree > 180)   aDegree-=360;
      return aDegree;
    }
}
