package unverified;

public class ClonePair9344 {

    double method1(double a){
      double r=a;
      while (r < -Math.PI)   r+=2.0 * Math.PI;
      while (r > Math.PI)   r-=2.0 * Math.PI;
      return r;
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
