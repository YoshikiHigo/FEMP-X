package unverified;

public class ClonePair9415 {

    int method1(int[] values){
      int result=values[0];
      for (  int i : values)   if (i > result)   result=i;
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
