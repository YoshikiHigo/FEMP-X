package unverified;

public class ClonePair121 {

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

    double method2(double v1,double v2,double h){
      if (h < 0)   h+=1;
      if (h > 1)   h-=1;
      if (h < 1.0 / 6.0)   return v1 + (v2 - v1) * h * 6.0;
     else   if (h < 0.5)   return v2;
     else   if (h < 2.0 / 3.0)   return v1 + (v2 - v1) * (2.0 / 3.0 - h) * 6.0;
      return v1;
    }
}
