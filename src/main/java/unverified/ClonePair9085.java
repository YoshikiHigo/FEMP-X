package unverified;

public class ClonePair9085 {

    double method1(double dir){
      double tmp=dir;
      if (tmp > 180)   tmp-=360;
     else   if (tmp < -180)   tmp+=360;
      return tmp;
    }

    double method2(double val){
      double valOut=val;
      if (val > 180)   valOut=val - 360.;
      if (val < -180.)   valOut=val + 360.;
      return valOut;
    }
}
