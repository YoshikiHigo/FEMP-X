package unverified;

public class ClonePair9045 {

    double method1(double lng){
      if (lng < -180) {
        lng+=360;
      }
     else   if (lng > 180) {
        lng-=360;
      }
      return lng;
    }

    double method2(double val){
      double valOut=val;
      if (val > 180)   valOut=val - 360.;
      if (val < -180.)   valOut=val + 360.;
      return valOut;
    }
}
