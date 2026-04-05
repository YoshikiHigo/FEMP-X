package all;

public class ClonePair9981 {

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

    double method2(double lng){
      if (lng > 180.0) {
        while (lng > 180.0)     lng-=360.0;
      }
     else   if (lng < -180.0) {
        while (lng < -180.0)     lng+=360.0;
      }
      return lng;
    }
}
