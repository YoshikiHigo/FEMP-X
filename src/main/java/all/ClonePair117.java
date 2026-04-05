package all;

public class ClonePair117 {

    double method1(double e1,double e2,double e3){
      double min=e1;
      if (e2 < min) {
        min=e2;
      }
      if (e3 < min) {
        min=e3;
      }
      return min;
    }

    double method2(double a,double b,double c){
      if (a <= b && a <= c)   return a;
     else   if (b <= a && b <= c)   return b;
     else   return c;
    }
}
