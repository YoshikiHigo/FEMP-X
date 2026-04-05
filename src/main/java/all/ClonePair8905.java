package all;

public class ClonePair8905 {

    double method1(double angle){
      if (angle > 180)   return ((angle + 180) % 360) - 180;
      if (angle < -180)   return ((angle - 180) % 360) + 180;
      return angle;
    }

    double method2(double lon){
      double times;
      if (lon >= -180.0 && lon <= 180.0) {
        return (lon);
      }
     else {
        times=Math.floor((Math.abs(lon) + 180.0) / 360.0);
        if (lon < 0.0) {
          return (lon + 360.0 * times);
        }
     else {
          return (lon - 360.0 * times);
        }
      }
    }
}
