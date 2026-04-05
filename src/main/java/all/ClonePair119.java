package all;

public class ClonePair119 {

    double method1(double a,double b,double c){
      if (b > a) {
        if (c > b) {
          return b;
        }
        if (a > c) {
          return a;
        }
        return c;
      }
     else {
        if (c > a) {
          return a;
        }
        if (b > c) {
          return b;
        }
        return c;
      }
    }

    double method2(double val,double minVal,double maxVal){
      double newVal=val;
      if (minVal < maxVal) {
        if (newVal < minVal) {
          newVal=minVal;
        }
     else     if (newVal > maxVal) {
          newVal=maxVal;
        }
      }
     else {
        if (newVal < maxVal) {
          newVal=maxVal;
        }
     else     if (newVal > minVal) {
          newVal=minVal;
        }
      }
      return newVal;
    }
}
