package all;

public class ClonePair123 {

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

    double method2(double v1,double v2,double h){
      if (h < 0)   h+=1;
      if (h > 1)   h-=1;
      if (h < 1.0 / 6.0)   return v1 + (v2 - v1) * h * 6.0;
     else   if (h < 0.5)   return v2;
     else   if (h < 2.0 / 3.0)   return v1 + (v2 - v1) * (2.0 / 3.0 - h) * 6.0;
      return v1;
    }
}
