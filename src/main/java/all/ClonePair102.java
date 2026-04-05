package all;

public class ClonePair102 {

    double method1(double pValue,double pBoundary1,double pBoundary2){
      double lLowerBoundary=pBoundary1;
      double lUpperBoundary=pBoundary2;
      if (lLowerBoundary > lUpperBoundary) {
        final double lTmp=lLowerBoundary;
        lLowerBoundary=lUpperBoundary;
        lUpperBoundary=lTmp;
      }
      if (pValue < lLowerBoundary) {
        return lLowerBoundary;
      }
      if (pValue > lUpperBoundary) {
        return lUpperBoundary;
      }
      return pValue;
    }

    double method2(double val,double minVal,double maxVal){
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
}
