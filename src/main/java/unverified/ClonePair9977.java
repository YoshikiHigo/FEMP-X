package unverified;

public class ClonePair9977 {

    double method1(double phi){
      if (phi < -180.) {
        while (phi < -180.) {
          phi+=360.;
        }
        return phi;
      }
      if (phi > 180.) {
        while (phi > 180.) {
          phi-=360.;
        }
        return phi;
      }
      return phi;
    }

    double method2(double angle){
      double a=angle;
      while (a > 180)   a-=360;
      while (a < -180)   a+=360;
      return a;
    }
}
