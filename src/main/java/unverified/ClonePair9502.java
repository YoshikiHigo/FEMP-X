package unverified;

public class ClonePair9502 {

    int method1(int[] _d){
      int max=_d[0];
      for (int i=1; i < _d.length; i++) {
        if (_d[i] > max)     max=_d[i];
      }
      return max;
    }

    int method2(int[] v){
      int max=v[0];
      for (int i=1; i < v.length; i++) {
        if (max < v[i]) {
          max=v[i];
        }
      }
      return (max);
    }
}
