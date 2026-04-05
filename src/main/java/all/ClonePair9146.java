package all;

public class ClonePair9146 {

    double method1(double angle){
      while (angle > 180.0)   angle-=360.0;
      while (angle < -180.0)   angle+=360.0;
      return (angle);
    }

    double method2(double phi){
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
}
