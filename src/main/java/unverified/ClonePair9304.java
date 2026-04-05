package unverified;

public class ClonePair9304 {

    double method1(double angle){
      if (angle > Math.PI) {
        if (angle <= (Math.PI * 3.0)) {
          angle=angle - (Math.PI * 2.0);
        }
     else {
          angle=Math.IEEEremainder(angle,(Math.PI * 2.0));
          if (angle == -Math.PI) {
            angle=Math.PI;
          }
        }
      }
     else   if (angle <= -Math.PI) {
        if (angle > (-Math.PI * 3.0)) {
          angle=angle + (Math.PI * 2.0);
        }
     else {
          angle=Math.IEEEremainder(angle,(Math.PI * 2.0));
          if (angle == -Math.PI) {
            angle=Math.PI;
          }
        }
      }
      return angle;
    }

    double method2(double angle){
      if (angle > -Math.PI && angle <= Math.PI)   return angle;
      double fixedAngle=angle;
      while (fixedAngle <= -Math.PI)   fixedAngle+=Math.PI * 2;
      while (fixedAngle > Math.PI)   fixedAngle-=Math.PI * 2;
      return fixedAngle;
    }
}
