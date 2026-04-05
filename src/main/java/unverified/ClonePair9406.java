package unverified;

public class ClonePair9406 {

    int method1(int[] t){
      int m=t[0];
      for (int i=1; i < t.length; i++)   if (t[i] < m)   m=t[i];
      return m;
    }

    int method2(int[] v){
      int min=v[0];
      for (int i=1; i < v.length; i++) {
        if (min > v[i]) {
          min=v[i];
        }
      }
      return (min);
    }
}
