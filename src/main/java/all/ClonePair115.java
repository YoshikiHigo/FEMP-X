package all;

public class ClonePair115 {

    double method1(double val1,double val2,double val3){
      if (val1 < val2) {
        return val1 < val3 ? val1 : val3;
      }
     else {
        return val2 < val3 ? val2 : val3;
      }
    }

    double method2(double a,double b,double c){
      if (a <= b && a <= c)   return a;
     else   if (b <= a && b <= c)   return b;
     else   return c;
    }
}
