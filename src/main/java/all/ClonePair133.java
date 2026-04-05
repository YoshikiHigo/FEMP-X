package all;

public class ClonePair133 {

    double method1(double val,double minVal,double maxVal){
      double newVal=val;
      if (minVal < maxVal) {
        if (newVal < minVal)     newVal=minVal;
     else     if (newVal > maxVal)     newVal=maxVal;
      }
     else {
        if (newVal < maxVal)     newVal=maxVal;
     else     if (newVal > minVal)     newVal=minVal;
      }
      return newVal;
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
