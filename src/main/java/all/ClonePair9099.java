package all;

public class ClonePair9099 {

    double method1(double angle){
      while (angle > Math.PI) {
        angle-=2 * Math.PI;
      }
      while (angle <= -Math.PI) {
        angle+=2 * Math.PI;
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
