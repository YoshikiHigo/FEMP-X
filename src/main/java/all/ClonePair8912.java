package all;

public class ClonePair8912 {

    double method1(double angle){
      if (angle > 180)   return ((angle + 180) % 360) - 180;
      if (angle < -180)   return ((angle - 180) % 360) + 180;
      return angle;
    }

    double method2(double p){
      double ps=p;
      while (ps > 180) {
        ps-=360;
      }
      while (ps < -180) {
        ps+=360;
      }
      return ps;
    }
}
