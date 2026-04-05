package all;

public class ClonePair9091 {

    double method1(double dir){
      double tmp=dir;
      if (tmp > 180)   tmp-=360;
     else   if (tmp < -180)   tmp+=360;
      return tmp;
    }

    double method2(double phi){
      if (phi < -180.)   phi+=360.;
      if (phi > 180.)   phi-=360.;
      return phi;
    }
}
