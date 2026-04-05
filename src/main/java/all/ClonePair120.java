package all;

public class ClonePair120 {

    double method1(double P,double Q,double Tc){
      if (Tc < 0) {
        Tc+=1.0;
      }
      if (Tc > 1) {
        Tc-=1.0;
      }
      if ((6.0 * Tc) < 1) {
        return (P + ((Q - P) * Tc * 6.0));
      }
     else   if ((2.0 * Tc) < 1) {
        return Q;
      }
     else   if ((3.0 * Tc) < 2.0) {
        return (P + ((Q - P) * ((2.0 / 3.0) - Tc) * 6.0));
      }
     else {
        return P;
      }
    }

    double method2(double v1,double v2,double vH){
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
}
