package all;

public class ClonePair10147 {

    double method1(double angle){
      double newAngle=angle;
      if (angle > Math.PI)   newAngle-=(Math.PI * 2);
     else   if (angle < -Math.PI)   newAngle+=(Math.PI * 2);
      return newAngle;
    }

    double method2(double d){
      if (d > Math.PI) {
        d-=Math.PI * 2;
      }
     else   if (d < -Math.PI) {
        d+=Math.PI * 2;
      }
      return d;
    }
}
