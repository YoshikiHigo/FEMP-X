package unverified;

public class ClonePair9973 {

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
