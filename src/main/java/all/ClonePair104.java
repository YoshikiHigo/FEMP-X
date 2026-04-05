package all;

public class ClonePair104 {

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

    double method2(double viewScale,double minViewScale,double maxViewScale){
      viewScale*=1000.0;
      double v=Math.floor(viewScale);
      if (viewScale - v >= 0.5) {
        v+=0.5;
      }
      viewScale=v / 1000.0;
      if (viewScale < minViewScale) {
        viewScale=minViewScale;
      }
      if (viewScale > maxViewScale) {
        viewScale=maxViewScale;
      }
      return viewScale;
    }
}
