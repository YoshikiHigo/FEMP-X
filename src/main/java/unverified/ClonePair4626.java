package unverified;

public class ClonePair4626 {

    double method1(double[] data){
      double answer=data[0];
      for (int i=1; i < data.length; i++) {
        double alt=data[i];
        if (alt < answer) {
          answer=alt;
        }
      }
      return answer;
    }

    double method2(double[] verteces){
      double l;
      l=verteces[0];
      for (int i=0; i < verteces.length; i++) {
        if (verteces[i] < l) {
          l=verteces[i];
        }
      }
      return l;
    }
}
