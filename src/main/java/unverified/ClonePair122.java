package unverified;

public class ClonePair122 {

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
      if (vH < 0)   vH+=1;
      if (vH > 1)   vH-=1;
      if ((6 * vH) < 1)   return (v1 + (v2 - v1) * 6 * vH);
      if ((2 * vH) < 1)   return (v2);
      if ((3 * vH) < 2)   return (v1 + (v2 - v1) * ((2 / 3.0) - vH) * 6);
      return (v1);
    }
}
