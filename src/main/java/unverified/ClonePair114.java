package unverified;

public class ClonePair114 {

    double method1(double val1,double val2,double val3){
      if (val1 < val2) {
        return val1 < val3 ? val1 : val3;
      }
     else {
        return val2 < val3 ? val2 : val3;
      }
    }

    double method2(double e1,double e2,double e3){
      double min=e1;
      if (e2 < min) {
        min=e2;
      }
      if (e3 < min) {
        min=e3;
      }
      return min;
    }
}
