package unverified;

public class ClonePair9970 {

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
      int k=(int)Math.abs((lng / 360));
      if (lng > 180.0) {
        lng-=k * 360;
        if (lng > 180.0)     lng-=360.0;
      }
     else   if (lng < -180.0) {
        lng+=k * 360;
        if (lng < -180.0)     lng+=360.0;
      }
      return lng;
    }
}
