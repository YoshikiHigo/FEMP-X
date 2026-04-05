package unverified;

public class ClonePair9394 {

    double method1(double d){
      while (d < -Math.PI) {
        d+=Math.PI * 2;
      }
      while (d > Math.PI) {
        d-=Math.PI * 2;
      }
      return d;
    }

    double method2(double angle){
      while (angle < -Math.PI)   angle+=2.0 * Math.PI;
      while (angle > Math.PI)   angle-=2.0 * Math.PI;
      return angle;
    }
}
