package unverified;

public class ClonePair9361 {

    int method1(int[] sn){
      int result=sn[0];
      for (int i=0; i < sn.length; i++) {
        if (result < sn[i])     result=sn[i];
      }
      return result;
    }

    int method2(int[] _d){
      int max=_d[0];
      for (int i=1; i < _d.length; i++) {
        if (_d[i] > max)     max=_d[i];
      }
      return max;
    }
}
