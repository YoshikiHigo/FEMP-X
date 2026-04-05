package all;

public class ClonePair4403 {

    double method1(double a,double b){
      if (b < 0)   return (a < 0) ? a : -a;
      return (a > 0) ? a : -a;
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
