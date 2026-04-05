package unverified;

public class ClonePair4429 {

    double method1(double a,double b){
      if ((a >= 0.0 && b >= 0.0) || (a < 0.0 && b < 0.0))   return a;
     else   return -a;
    }

    double method2(double a,double b){
      double c=a;
      if (b >= 0) {
        if (a >= 0) {
        }
     else {
          c=-1 * c;
        }
      }
     else   if (a >= 0) {
        c=-1 * c;
      }
      return c;
    }
}
