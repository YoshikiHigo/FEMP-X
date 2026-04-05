package unverified;

public class ClonePair10423 {

    double method1(double angle){
      if (angle < -Math.PI) {
        int _180s=((int)(-angle / (Math.PI)));
        if (_180s % 2 == 1) {
          _180s++;
        }
        double remove=_180s * (Math.PI);
        return angle + remove;
      }
     else   if (angle > Math.PI) {
        int _180s=((int)(angle / (Math.PI)));
        if (_180s % 2 == 1) {
          _180s++;
        }
        double remove=_180s * (Math.PI);
        return angle - remove;
      }
     else {
        return angle;
      }
    }

    double method2(double angle){
      while (angle < -Math.PI)   angle+=2.0 * Math.PI;
      while (angle > Math.PI)   angle-=2.0 * Math.PI;
      return angle;
    }
}
