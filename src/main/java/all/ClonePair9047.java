package all;

public class ClonePair9047 {

    double method1(double lng){
      if (lng < -180) {
        lng+=360;
      }
     else   if (lng > 180) {
        lng-=360;
      }
      return lng;
    }

    double method2(double phi){
      if (phi < -180.)   phi+=360.;
      if (phi > 180.)   phi-=360.;
      return phi;
    }
}
