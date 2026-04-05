package unverified;

public class ClonePair10640 {

    double method1(double phi){
      double delta=2. * Math.PI;
      if (phi > Math.PI)   delta=-2. * Math.PI;
      while (phi < -Math.PI || phi > Math.PI)   phi+=delta;
      return phi;
    }

    double method2(double angle){
      while (angle < -Math.PI)   angle+=2.0 * Math.PI;
      while (angle > Math.PI)   angle-=2.0 * Math.PI;
      return angle;
    }
}
