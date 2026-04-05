package unverified;

public class ClonePair9389 {

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
}
