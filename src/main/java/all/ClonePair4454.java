package all;

public class ClonePair4454 {

    double method1(double[] targets){
      double highest=targets[0];
      for (int i=1; i < targets.length; ++i)   if (highest < targets[i])   highest=targets[i];
      return highest;
    }

    double method2(double[] verteces){
      double r;
      r=verteces[0];
      for (int i=0; i < verteces.length; i++) {
        if (verteces[i] > r) {
          r=verteces[i];
        }
      }
      return r;
    }
}
