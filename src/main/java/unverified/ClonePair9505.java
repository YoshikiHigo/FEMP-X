package unverified;

public class ClonePair9505 {

    int method1(int[] _d){
      int max=_d[0];
      for (int i=1; i < _d.length; i++) {
        if (_d[i] > max)     max=_d[i];
      }
      return max;
    }

    int method2(int[] values){
      int max=values[0];
      for (  int value : values) {
        if (value > max) {
          max=value;
        }
      }
      return max;
    }
}
