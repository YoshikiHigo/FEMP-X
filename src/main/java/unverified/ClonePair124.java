package unverified;

public class ClonePair124 {

    double method1(double v1,double v2,double vH){
      double vHCorrected=vH;
      if (vHCorrected < 0) {
        vHCorrected+=1;
      }
      if (vHCorrected > 1) {
        vHCorrected-=1;
      }
      if ((6 * vHCorrected) < 1) {
        return (v1 + (v2 - v1) * 6 * vHCorrected);
      }
      if ((2 * vHCorrected) < 1) {
        return (v2);
      }
      if ((3 * vHCorrected) < 2) {
        return (v1 + (v2 - v1) * (((double)2 / 3) - vHCorrected) * 6);
      }
      return (v1);
    }

    double method2(double v1,double v2,double vH){
      if (vH < 0)   vH+=1;
      if (vH > 1)   vH-=1;
      if ((6 * vH) < 1)   return (v1 + (v2 - v1) * 6 * vH);
      if ((2 * vH) < 1)   return (v2);
      if ((3 * vH) < 2)   return (v1 + (v2 - v1) * ((2 / 3.0) - vH) * 6);
      return (v1);
    }
}
