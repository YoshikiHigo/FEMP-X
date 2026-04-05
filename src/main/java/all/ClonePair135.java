package all;

public class ClonePair135 {

    double method1(double val,double minVal,double maxVal){
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
