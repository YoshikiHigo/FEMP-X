package all;

public class ClonePair10155 {

    double method1(double angle){
      double newAngle=angle;
      if (angle > Math.PI)   newAngle-=(Math.PI * 2);
     else   if (angle < -Math.PI)   newAngle+=(Math.PI * 2);
      return newAngle;
    }

    double method2(double theta){
      if (theta < -Math.PI)   return theta + 2 * Math.PI;
      if (theta > Math.PI)   return theta - 2 * Math.PI;
      return theta;
    }
}
