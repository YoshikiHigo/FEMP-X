package unverified;

public class ClonePair10416 {

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

    double method2(double phi){
      double delta=2. * Math.PI;
      if (phi > Math.PI)   delta=-2. * Math.PI;
      while (phi < -Math.PI || phi > Math.PI)   phi+=delta;
      return phi;
    }
}
